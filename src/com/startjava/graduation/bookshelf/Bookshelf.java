package com.startjava.graduation.bookshelf

import java.util.Arrays;

public class Bookshelf {
    private static final int BOOKSHELF_LIMIT = 10;
    private int count;
    private Book[] books = new Book[BOOKSHELF_LIMIT];
    private int maxLenght;

    public void add(Book book) {
        books[count] = book;
        calcucateMaxLenght(book);
        count++;

    }

    public void delete(String name) {
        int index = findIndex(name);
        if (index < 0) {
            throw new IllegalStateException("Книга не найдена");
        }
        int lenght = books[index].toString().length();
        count--;
        System.arraycopy(books, index + 1, books, index, count - index);
        if (lenght == maxLenght) {
            calcucateMaxLenght();
        }
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

    public int getCountEmptyShelfs() {
        return BOOKSHELF_LIMIT - count;
    }

    public int getMaxLenght() {
        return maxLenght;
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

    private void calcucateMaxLenght() {
        maxLenght = 0;
        for (int i = 0; i < count; i++) {
            calcucateMaxLenght(books[i]);
        }
    }

    private void calcucateMaxLenght(Book book) {
        int lenght = book.toString().length();
        if (lenght > maxLenght) {
            maxLenght = lenght;
        }
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