package com.startjava.lesson_2_3.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int number;

    private int[] logNumbers = new int[10];

    private int countAttempts = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
        logNumber(number);
    }

    public int getNumber() {
        return number;
    }

    public void refreshLog() {
        Arrays.fill(logNumbers, 0, countAttempts, 0);
        countAttempts = 0;
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    private void logNumber(int number) {
        logNumbers[countAttempts] = number;
        countAttempts++;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(logNumbers, countAttempts);
    }
