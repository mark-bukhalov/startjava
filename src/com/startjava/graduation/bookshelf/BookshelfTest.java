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
        boolean stopProgramm = false;
        while (!stopProgramm) {
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
                stopProgramm = performUserAction(console.nextInt());
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }
            pressEnter();
        }
    }

    private static boolean performUserAction(int menuItem) {
        console.nextLine();
        switch (menuItem) {
            case ADD_BOOK:
                addBook();
                return false;
            case DELETE_BOOK:
                deleteBook();
                return false;
            case FIND_BOOK:
                findBook();
                return false;
            case CLEAR_BOOKSHELF:
                clearBookshelf();
                return false;
            case EXIT:
                return true;
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
        String Author = console.nextLine();
        System.out.print("Название книги: ");
        String Name = console.nextLine();
        System.out.print("Год книги: ");
        int Year = console.nextInt();
        Book newBook = new Book(Author, Name, Year);
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
        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("Книга не найдена");
        }
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
        int countFreePlaces = bookshelf.getCountFreePlaces();
        if (countBooks == 0) {
            System.out.println("\nШкаф пуст. Вы можете добавить в него первую книгу");
        } else {
            System.out.printf("\nШкаф содержит %d книг. Кол-во свободных полок %d .\n\n", countBooks, countFreePlaces);
            Book[] books = bookshelf.getBooks();
            for (Book book : books) {
                System.out.printf("|%-50s|%n", book);
                System.out.println("|" + "-".repeat(50) + '|');
            }
            if (countFreePlaces != 0) {
                System.out.println("|" + " ".repeat(50) + "|");
            }
        }
        System.out.println();
    }
}