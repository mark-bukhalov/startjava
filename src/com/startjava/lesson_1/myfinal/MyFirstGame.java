package com.startjava.lesson_1.myfinal;
public class MyFirstGame {
    public static void main(String[] args) {
        int pcNum = 60;
        int playerNum = 99;
        int step = 10;
        while (playerNum != pcNum) {
            if (playerNum > pcNum) {
                System.out.println("число " + playerNum + " больше того, что загадал компьютер");
                playerNum -= step;
            } else if (playerNum < pcNum) {
                System.out.println("число " + playerNum + " меньше того, что загадал компьютер");
                playerNum += step;
            }
            if (step > 1) {
                step--;
            }
        }
        System.out.println("Вы победили!");
    }
}

