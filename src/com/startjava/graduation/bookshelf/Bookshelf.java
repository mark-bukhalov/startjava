package com.startjava.graduation.bookshelf

import java.util.Arrays;

public class Bookshelf {
    private static final int BOOKSHELF_SIZE = 10;
    int countBooks = 0;
    private Book[] books = new Book[BOOKSHELF_SIZE];

    public void addBook(Book book) {
        books[countBooks] = book;
        countBooks++;
    }

    public void deleteBook(String bookName) {
        int bookIndx = getBookIndx(bookName);
        System.arraycopy(books, bookIndx + 1, books, bookIndx, countBooks - bookIndx - 1);
        countBooks--;
    }

    public Book findBook(String bookName) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getName().equals(bookName)) {
                return books[i];
            }
        }
        throw new IllegalStateException("Книга не найдена");
    }

    public int getCountBooks() {
        return countBooks;
    }

    public int getCountFreePlaces() {
        return BOOKSHELF_SIZE - countBooks;
    }

    public void clear() {
        Arrays.fill(books, 0, countBooks, null);
        countBooks = 0;
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, countBooks);
    }

    public boolean isFull() {
        return (countBooks >= BOOKSHELF_SIZE);
    }

    private int getBookIndx(String bookName) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getName().equals(bookName)) {
                return i;
            }
        }
        throw new IllegalStateException("Книга не найдена");
    }
}

