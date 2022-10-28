package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static final int NUM_PLAYERS = 3;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GuessNumber guessGame = new GuessNumber(createPlayers());
        String playerAnswer = "yes";
        while (playerAnswer.equals("yes")) {
            guessGame.launch();
            do {
                System.out.print("Хотите продолжить игру? [yes/no] ");
                playerAnswer = scan.nextLine();
            } while (!playerAnswer.equals("yes") && !playerAnswer.equals("no"));
        }
    }

    private static Player[] createPlayers() {
        Player[] players = new Player[NUM_PLAYERS];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < NUM_PLAYERS; i++) {
            System.out.printf("Игрок %S, введите имя: ", i + 1);
            players[i] = new Player(scan.nextLine());
        }
        return players;
    }
}