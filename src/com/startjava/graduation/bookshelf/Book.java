package com.startjava.graduation.bookshelf

public class Book {
    private String author;
    private String name;
    private int year;

    public Book(String author, String name, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return author + " " + name + " " + year;
    }

    public int getLenght(){
        return author.length() + name.length() + String.valueOf(year).length() + 2;
    }
}