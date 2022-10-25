package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumber {
    private int secretNum;
    private Player[] players;
    private Player activePlayer;
    private int countGames;

    public GuessNumber(Player... playersIn) {
        players = playersIn;
        shufflePlayers();
    }

    public void launch() {
        System.out.println("\nУ каждого игрока по 10 попыток");
        System.out.print("Новая игра");
        countGames++;
        resetPlayers();
        generateSecretNum();
        boolean stopGame = false;
        while (!stopGame) {
            stopGame = makeMove();
        }
        displayPlayersNums();
        if (countGames == 3) {
            displayWinner();
            resetScores();
        }
    }

    private void shufflePlayers() {
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
        changeActivePlayer();
        if (activePlayer.getCountAttempts() >= 10) {
            System.out.printf("%nУ игрока %s закончились попытки!\n", activePlayer.getName());
            return false;
        }
        boolean successInput;
        do {
            System.out.printf("%n%s ваш ход: ", activePlayer.getName());
            try {
                activePlayer.addNum(scan.nextInt());
                successInput = true;
            } catch (Exception e) {
                successInput = false;
                System.out.print("Ошибка: " + e.getMessage());
            }
        } while (!successInput);
        return compareNums(activePlayer);
    }

    private void changeActivePlayer() {
        if (activePlayer == players[0]) {
            activePlayer = players[1];
        } else if (activePlayer == players[1]) {
            activePlayer = players[2];
        } else {
            activePlayer = players[0];
        }
    }

    private boolean compareNums(Player player) {
        int playerNum = player.getNum();
        if (playerNum == secretNum) {
            player.incScore();
            System.out.printf("Игрок %s угадал число %d c %d попытки\n",
                    player.getName(), playerNum, player.getCountAttempts());
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
        countGames = 0;
        for (Player player : players) {
            player.resetScore();
        }
    }
}

