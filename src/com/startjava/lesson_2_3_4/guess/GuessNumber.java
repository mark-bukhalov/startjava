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
        player1.refreshLog();
        player2.refreshLog();
        generateSecretNum();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.printf("%n%s ваш ход: ", player1.getName());
            player1.setNumber(scan.nextInt());
            if (compareNumbers(player1)) {
                break;
            }
            System.out.printf("%n%s ваш ход: ", player2.getName());
            player2.setNumber(scan.nextInt());
            if (compareNumbers(player2)) {
                break;
            }
        }
    }

    private void generateSecretNum() {
        secretNum = (int) (1 + Math.random() * 100);
        System.out.print("Новая игра");
    }

    private boolean compareNumbers(Player player) {
        if (player.getCountAttempts() >= 10) {
            System.out.printf("У игрока %s закончились попытки!\n", player.getName());
            displayPlayersNumbers();
            return true;
        }
        if (player.getNumber() == secretNum) {
            System.out.printf("Игрок %s угадал число %d c %d попытки\n",
                    player.getName(), player.getNumber(), player.getCountAttempts());
            displayPlayersNumbers();
            return true;
        }
        if (player.getNumber() > secretNum) {
            System.out.printf("Число %d больше того, что загадал компьютер", player.getNumber());
        } else {
            System.out.printf("Число %d меньше того, что загадал компьютер", player.getNumber());
        }
        return false;
    }

    private void displayPlayersNumbers() {
        displayPlayerNumber(player1);
        displayPlayerNumber(player2);
    }

    private void displayPlayerNumber(Player player) {
        System.out.printf("Числа игрока %s: ", player.getName());
        int[] playerNumbers = player.getNumbers();
        for (int i = 0; i < playerNumbers.length; i++) {
            if (i != playerNumbers.length - 1) {
                System.out.printf("%d, ", playerNumbers[i]);
            } else {
                System.out.printf("%d", playerNumbers[i]);
            }
        }
        System.out.println();
    }
}
