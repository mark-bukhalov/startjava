package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    private static final int ADD_BOOK = 1;
    private static final int DELETE_BOOK = 2;
    private static final int FIND_BOOK = 3;
    private static final int SHOW_COUNT_BOOK = 4;
    private static final int SHOW_FREE_PLACES = 5;
    private static final int CLEAR_BH = 6;
    private static final int EXIT = 7;
    private static Bookshelf bookshelf;

    public static void main(String[] args) {
        bookshelf = new Bookshelf();
        while (true) {
            Scanner console = new Scanner(System.in);
            System.out.print("""
                    1. Добавить книгу
                    2. Удалить книгу
                    3. Найти книгу
                    4. Показать количество книг
                    5. Покать количество свободных полок
                    6. Очистить шкаф
                    7. Выйти
                    """);
            System.out.print("Выберите функцию: ");

            try {
                doAction(console.nextInt());
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            } catch (SecurityException e) {
                break;
            }
        }
    }

    private static void doAction(int actionID) {
        switch (actionID) {
            case (ADD_BOOK):
                addBook();
                break;
            case (DELETE_BOOK):
                deleteBook();
                break;
            case (FIND_BOOK):
                findBook();
                break;
            case (SHOW_COUNT_BOOK):
                displayCountBook();
                break;
            case (SHOW_FREE_PLACES):
                displayFreePlaces();
                break;
            case (CLEAR_BH):
                clearBh();
                break;
            case (EXIT):
                throw new SecurityException();
            default:
                throw new IllegalStateException("Указан неправильный номер функции");
        }
        pressEnter();
        displayBookshelf();
    }

    private static void addBook() {
        if (bookshelf.isFull()) {
            System.out.println("Невозможно добавить книгу. Шкаф полон");
            return;
        }
        System.out.print("Автор книги: ");
        Scanner console = new Scanner(System.in);
        String bookAuthor = console.nextLine();
        System.out.print("Название книги: ");
        String bookName = console.nextLine();
        System.out.print("Год книги: ");
        int bookYear = console.nextInt();
        Book newBook = new Book(bookAuthor, bookName, bookYear);
        bookshelf.addBook(newBook);
    }

    private static void deleteBook() {
        Scanner console = new Scanner(System.in);
        System.out.print("Название книги для удаления:");
        try {
            bookshelf.deleteBook(console.nextLine());
        } catch (Exception e) {
            System.out.println("Удаление невозможно. " + e.getMessage());
        }
    }

    private static void findBook() {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите название книги: ");
        String name = console.nextLine();
        try {
            Book book = bookshelf.findBook(name);
            System.out.println(book);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void displayCountBook() {
        System.out.printf("Количество книг в шкафу: %d%n", bookshelf.getCountBook());
    }

    private static void displayFreePlaces() {
        System.out.printf("Количество свободных полок: %d%n", bookshelf.getCountFreePlaces());
    }

    private static void clearBh() {
        bookshelf.clear();
        System.out.println("Шкаф очищен");
    }

    private static void pressEnter() {
        Scanner console = new Scanner(System.in);
        System.out.print("Для продолжения работы нажмите Enter ");
        console.nextLine();
    }

    private static void displayBookshelf() {
        int countBooks = bookshelf.getCountBook();
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
