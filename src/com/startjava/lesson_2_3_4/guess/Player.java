package com.startjava.lesson_2_3.guess;

import java.util.Arrays;

public class Player {
    private String name;

    private int[] enteredNum = new int[10];

    private int countAttempts;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addNum(int num) {
        enteredNum[countAttempts] = num;
        countAttempts++;
    }

    public int getNum() {
        return enteredNum[countAttempts - 1];
    }

    public void reset() {
        Arrays.fill(enteredNum, 0, countAttempts, 0);
        countAttempts = 0;
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    public int[] getNums() {
        return Arrays.copyOf(enteredNum, countAttempts);
    }

}

