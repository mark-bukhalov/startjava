package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private int secretNum;
    private Player[] players;
    private int rounds;

    public GuessNumber(Player... players) {
        this.players = players;
        castLots();
    }

    public void launch() {
        System.out.println("\nУ каждого игрока по 10 попыток");
        System.out.print("Новая игра");
        rounds++;
        resetPlayers();
        generateSecretNum();
        while (!makeMove()) {
        }
        displayPlayersNums();
        if (rounds == 3) {
            displayWinner();
            resetScores();
        }
    }

    private void castLots() {
        for (int i = players.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * i);
            Player temp = players[j];
            players[j] = players[i];
            players[i] = temp;
        }
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

        for (Player activePlayer : players) {
            if (activePlayer.getCountAttempts() >= 10) {
                System.out.printf("%nУ игрока %s закончились попытки!\n", activePlayer.getName());
                return false;
            }

            while (true) {
                System.out.printf("%n%s ваш ход: ", activePlayer.getName());
                try {
                    activePlayer.addNum(scan.nextInt());
                    break;
                } catch (IllegalStateException e) {
                    System.out.print("Ошибка: " + e.getMessage());
                }
            }
            if (compareNums(activePlayer)) {
                return true;
            }
        }
        return false;
    }

    private boolean compareNums(Player player) {
        int playerNum = player.getNum();
        if (playerNum == secretNum) {
            player.incScore();
            System.out.printf("Игрок %s угадал число %d c %d попытки\n", player.getName(), playerNum, player.getCountAttempts());
            return true;
        }
        String textCompare = playerNum > secretNum ? "больше" : "меньше";
        System.out.printf("Число %d %s того, что загадал компьютер", playerNum, textCompare);
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

    private void displayWinner() {
        int maxScore = 0;
        int countWinner = 0;

        for (Player player : players) {
            int score = player.getScore();
            if (score > maxScore) {
                maxScore = score;
                countWinner = 1;
            } else if (score == maxScore) {
                countWinner++;
            }
        }

        if (countWinner == 1) {
            System.out.print("Победил: ");
        } else {
            System.out.print("Победили: ");
        }

        for (Player player : players) {
            if (player.getScore() == maxScore) {
                System.out.print(player.getName() + " ");
            }
        }
        System.out.println();
    }

    private void resetScores() {
        rounds = 0;
        for (Player player : players) {
            player.resetScore();
        }
    }
}


