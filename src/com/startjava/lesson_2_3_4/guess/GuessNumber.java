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
        System.out.print("Новая игра");
        resetPlayers();
        generateSecretNum();
        boolean gameRun = true;
        while (gameRun) {
            gameRun = makeMove();
        }
        displayPlayersNums();
    }

    private void resetPlayers() {
        for (Player player : players) {
            player.reset();
        }
    }

    private void generateSecretNum() {
        secretNum = (int) (1 + Math.random() * 100);
    }

    private boolean makeMove() {
        Scanner scan = new Scanner(System.in);
        changeActivePlayer();
        if (activePlayer.getCountAttempts() >= 10) {
            System.out.printf("%nУ игрока %s закончились попытки!\n", activePlayer.getName());
            return false;
        }
        System.out.printf("%n%s ваш ход: ", activePlayer.getName());
        activePlayer.addNum(scan.nextInt());
        return compareNums(activePlayer) ? false : true;
    }

    private void changeActivePlayer() {
        activePlayer = (activePlayer == players[0] ? players[1] : players[0]);
    }

    private boolean compareNums(Player player) {
        int playerNum = player.getNum();
        if (playerNum == secretNum) {
            System.out.printf("Игрок %s угадал число %d c %d попытки\n",
                    player.getName(), playerNum, player.getCountAttempts());
            return true;
        }
        if (playerNum > secretNum) {
            System.out.printf("Число %d больше того, что загадал компьютер", playerNum);
        } else {
            System.out.printf("Число %d меньше того, что загадал компьютер", playerNum);
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


