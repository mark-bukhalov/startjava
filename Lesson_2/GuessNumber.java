import java.util.Scanner;

public class GuessNumber {
    private int pcNum;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        generateNewNumber();
    }

    public void generateNewNumber() {
        pcNum = (int) (1 + Math.random() * 101);
    }

    private boolean checkPlayer(Player player) {
        if (player.getNumber() == pcNum) {
            System.out.printf("Игрок %s победил!", player.getName());
            return true;
        } else {
            if (player.getNumber() > pcNum) {
                System.out.printf("Число %d больше того, что загадал компьютер", player.getNumber());
            } else {
                System.out.printf("Число %d меньше того, что загадал компьютер", player.getNumber());
            }
            return false;
        }
    }

    public boolean checkPlayer1() {
        return checkPlayer(player1);
    }

    public boolean checkPlayer2() {
        return checkPlayer(player2);
    }

    public void runGame() {
        boolean isRun = true;
        int countGame = 0;
        Scanner scan = new Scanner(System.in);
        while (isRun == true) {
            boolean isGuessed;
            if (countGame % 2 == 0) {
                System.out.printf("%n%s ваш ход: ", player1.getName());
                player1.setNumber(scan.nextInt());
                isRun = !checkPlayer1();
            } else {
                System.out.printf("%n%s ваш ход: ", player2.getName());
                player2.setNumber(scan.nextInt());
                isRun = !checkPlayer2();
            }
            countGame++;
        }
    }
}
