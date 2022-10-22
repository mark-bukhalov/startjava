package com.startjava.lesson_2_3.guess;

import java.util.Arrays;

public class Player {
    private String name;

    private int[] enteredNums = new int[10];

    private int countAttempts;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addNum(int num) {
        enteredNums[countAttempts] = num;
        countAttempts++;
    }

    public int getNum() {
        return enteredNums[countAttempts - 1];
    }

    public void reset() {
        Arrays.fill(enteredNums, 0, countAttempts, 0);
        countAttempts = 0;
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    public int[] getNums() {
        return Arrays.copyOf(enteredNums, countAttempts);
    }

}


