package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumber {
    private int secretNum;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void launch() {
        System.out.println("\nУ каждого игрока по 10 попыток");
        player1.reset();
        player2.reset();
        generateSecretNum();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.printf("%n%s ваш ход: ", player1.getName());
            player1.addNum(scan.nextInt());
            if (compareNums(player1)) {
                break;
            }
            System.out.printf("%n%s ваш ход: ", player2.getName());
            player2.addNum(scan.nextInt());
            if (compareNums(player2)) {
                break;
            }
        }
    }

    private void generateSecretNum() {
        secretNum = (int) (1 + Math.random() * 100);
        System.out.print("Новая игра");
    }

    private boolean compareNums(Player player) {
        if (player.getCountAttempts() >= 10) {
            System.out.printf("У игрока %s закончились попытки!\n", player.getName());
            displayPlayersNums();
            return true;
        }
        if (player.getNum() == secretNum) {
            System.out.printf("Игрок %s угадал число %d c %d попытки\n",
                    player.getName(), player.getNum(), player.getCountAttempts());
            displayPlayersNums();
            return true;
        }
        if (player.getNum() > secretNum) {
            System.out.printf("Число %d больше того, что загадал компьютер", player.getNum());
        } else {
            System.out.printf("Число %d меньше того, что загадал компьютер", player.getNum());
        }
        return false;
    }

    private void displayPlayersNums() {
        displayPlayerNum(player1);
        displayPlayerNum(player2);
    }

    private void displayPlayerNum(Player player) {
        System.out.printf("Числа игрока %s: ", player.getName());
        int[] playerNums = player.getNums();
        for (int i = 0; i < playerNums.length; i++) {
            if (i != playerNums.length - 1) {
                System.out.printf("%d, ", playerNums[i]);
            } else {
                System.out.printf("%d", playerNums[i]);
            }
        }
        System.out.println();
    }
}

