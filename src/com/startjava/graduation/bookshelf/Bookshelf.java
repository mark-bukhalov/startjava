package com.startjava.graduation.bookshelf

import java.util.Arrays;

public class Bookshelf {
    private static final int BOOKSHELF_SIZE = 10;
    int countBook = 0;
    private Book[] books = new Book[BOOKSHELF_SIZE];

    public void addBook(Book book) {
        books[countBook] = book;
        countBook++;
    }

    public void deleteBook(String bookName) {
        int bookIndx = getBookIndx(bookName);
        System.arraycopy(books, bookIndx + 1, books, bookIndx, countBook - bookIndx - 1);
        countBook--;
    }

    public Book findBook(String bookName) {
        for (int i = 0; i < countBook; i++) {
            if (books[i].getName().equals(bookName)) {
                return books[i];
            }
        }
        throw new IllegalStateException("Книга не найдена");
    }

    public int getCountBook() {
        return countBook;
    }

    public int getCountFreePlaces() {
        return BOOKSHELF_SIZE - countBook;
    }

    public void clear() {
        books = new Book[BOOKSHELF_SIZE];
        countBook = 0;
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, countBook);
    }

    public boolean isFull() {
        return (countBook >= BOOKSHELF_SIZE);
    }

    private int getBookIndx(String bookName) {
        for (int i = 0; i < countBook; i++) {
            if (books[i].getName().equals(bookName)) {
                return i;
            }
        }
        throw new IllegalStateException("Книга не найдена");
    }
}

