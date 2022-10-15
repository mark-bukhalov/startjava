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
        secretNum = (int) (1 + Math.random() * 101);
        System.out.print("\nНовая игра");
    }

    private boolean compareNumbers(Player player) {
        if (player.getNumber() == secretNum) {
            System.out.printf("Игрок %s победил!\n", player.getName());
            return true;
        }
        if (player.getNumber() > secretNum) {
            System.out.printf("Число %d больше того, что загадал компьютер", player.getNumber());
        } else {
            System.out.printf("Число %d меньше того, что загадал компьютер", player.getNumber());
        }
        return false;
    }
}
