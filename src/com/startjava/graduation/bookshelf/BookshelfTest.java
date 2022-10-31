package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    private static final int ADD_BOOK = 1;
    private static final int DELETE_BOOK = 2;
    private static final int FIND_BOOK = 3;
    private static final int CLEAR_BOOKSHELF = 4;
    private static final int EXIT = 5;
    private static Bookshelf bookshelf;

    private static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        bookshelf = new Bookshelf();
        boolean isRun = true;
        while (isRun) {
            displayBookshelf();
            System.out.print("""
                    1. Добавить книгу
                    2. Удалить книгу
                    3. Найти книгу
                    4. Очистить шкаф
                    5. Выйти
                    """);
            System.out.print("Выберите функцию: ");
            try {
                isRun = executeUserSelection(console.nextInt());
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }
            pressEnter();
        }
    }

    private static boolean executeUserSelection(int menuItem) {
        console.nextLine();
        switch (menuItem) {
            case ADD_BOOK:
                addBook();
                return true;
            case DELETE_BOOK:
                deleteBook();
                return true;
            case FIND_BOOK:
                findBook();
                return true;
            case CLEAR_BOOKSHELF:
                clearBookshelf();
                return true;
            case EXIT:
                return false;
            default:
                throw new IllegalStateException("Указан неправильный номер функции");
        }
    }

    private static void addBook() {
        if (bookshelf.isFull()) {
            System.out.println("Невозможно добавить книгу. Шкаф полон");
            return;
        }
        System.out.print("Автор книги: ");
        String author = console.nextLine();
        System.out.print("Название книги: ");
        String name = console.nextLine();
        System.out.print("Год книги: ");
        int year = console.nextInt();
        Book newBook = new Book(author, name, year);
        bookshelf.add(newBook);
    }

    private static void deleteBook() {
        System.out.print("Название книги для удаления:");
        try {
            bookshelf.delete(console.nextLine());
        } catch (Exception e) {
            System.out.println("Удаление невозможно. " + e.getMessage());
        }
    }

    private static void findBook() {
        System.out.print("Введите название книги: ");
        String name = console.nextLine();
        Book book = bookshelf.find(name);
        System.out.println((book != null) ? book : ("Книга не найдена");
    }

    private static void clearBookshelf() {
        bookshelf.clear();
        System.out.println("Шкаф очищен");
    }

    private static void pressEnter() {
        System.out.print("Для продолжения работы нажмите Enter ");
        console.nextLine();
    }

    private static void displayBookshelf() {
        int countBooks = bookshelf.getCount();

        if (countBooks == 0) {
            System.out.println("\nШкаф пуст. Вы можете добавить в него первую книгу");
        } else {
            int countEmptyShelfs = bookshelf.getCountEmptyShelfs();
            int max_lenght = bookshelf.getMaxLenght();
            System.out.printf("\nШкаф содержит %d книг. Кол-во свободных полок %d .\n\n",
                    countBooks, countEmptyShelfs);
            Book[] books = bookshelf.getBooks();
            for (Book book : books) {
                System.out.printf("|%-" + (max_lenght) + "s|%n", book);
                System.out.println("|" + "-".repeat(max_lenght) + '|');
            }
            if (countEmptyShelfs != 0) {
                System.out.println("|" + " ".repeat(max_lenght) + "|");
            }
        }
        System.out.println();
    }