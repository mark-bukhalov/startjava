import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Игрок 1, введите имя: ");
        Player player1 = new Player(scan.nextLine());
        System.out.print("Игрок 2, введите имя: ");
        Player player2 = new Player(scan.nextLine());
        GuessNumber guessGame = new GuessNumber(player1, player2);
        String playerAnswer = "yes";
        while (playerAnswer.equals("yes")) {
            guessGame.launch();
            do {
                System.out.print("Хотите продолжить игру? [yes/no] ");
                playerAnswer = scan.nextLine();
            } while (!playerAnswer.equals("yes") && !playerAnswer.equals("no"));
        }
    }
}
