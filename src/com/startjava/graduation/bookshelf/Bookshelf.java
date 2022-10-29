package com.startjava.graduation.bookshelf

import java.util.Arrays;

public class Bookshelf {
    private static final int BOOKSHELF_LIMIT = 10;
    int count = 0;
    private Book[] books = new Book[BOOKSHELF_LIMIT];

    public void add(Book book) {
        books[count] = book;
        count++;
    }

    public void delete(String name) {
        int index = findIndex(name);
        if (index < 0) {
            throw new IllegalStateException("Книга не найдена");
        }
        System.arraycopy(books, index + 1, books, index, count - index - 1);
        count--;
    }

    public Book find(String name) {
        for (int i = 0; i < count; i++) {
            if (books[i].getName().equals(name)) {
                return books[i];
            }
        }
        return null;
    }

    public int getCount() {
        return count;
    }

    public int getCountFreePlaces() {
        return BOOKSHELF_LIMIT - count;
    }

    public void clear() {
        Arrays.fill(books, 0, count, null);
        count = 0;
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, count);
    }

    public boolean isFull() {
        return (count >= BOOKSHELF_LIMIT);
    }

    private int findIndex(String name) {
        for (int i = 0; i < count; i++) {
            if (books[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
}