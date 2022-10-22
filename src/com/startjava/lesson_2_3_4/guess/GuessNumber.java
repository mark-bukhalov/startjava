package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumber {
    private int secretNum;
    private Player[] players = new Player[2];

    private Player activePlayer;

    public GuessNumber(Player player1, Player player2) {
        players[0] = player1;
        players[1] = player2;
    }

    public void launch() {
        System.out.println("\nУ каждого игрока по 10 попыток");
        resetPlayers();
        generateSecretNum();
        Scanner scan = new Scanner(System.in);
        while (true) {
            changeActivePlayer();
            System.out.printf("%n%s ваш ход: ", activePlayer.getName());
            if (activePlayer.getCountAttempts() >= 10) {
                System.out.printf("%nУ игрока %s закончились попытки!\n", activePlayer.getName());
                displayPlayersNums();
                break;
            }
            activePlayer.addNum(scan.nextInt());
            if (compareNums(activePlayer)) {
                break;
            }
        }
    }

    private void resetPlayers() {
        for (Player player : players) {
            player.reset();
        }
    }

    private void generateSecretNum() {
        secretNum = (int) (1 + Math.random() * 100);
        System.out.print("Новая игра");
    }

    private void changeActivePlayer() {
        if (activePlayer == players[0]) {
            activePlayer = players[1];
        } else {
            activePlayer = players[0];
        }
    }

    private boolean compareNums(Player player) {
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
        for (Player player : players) {
            System.out.printf("Числа игрока %s: ", player.getName());
            for (int num : player.getNums()) {
                System.out.printf("%d ", num);
            }
            System.out.println();
        }
    }
}

