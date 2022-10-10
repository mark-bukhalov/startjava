import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Игрок 1, введите имя: ");
        Player player1 = new Player(scan.nextLine());
        System.out.print("Игрок 2, введите имя: ");
        Player player2 = new Player(scan.nextLine());
        GuessNumber guessGame = new GuessNumber(player1, player2);
        boolean isRun = true;
        while (isRun == true) {
            guessGame.runGame();
            String userResponse;
            System.out.println();
            do {
                System.out.print("Хотите продолжить игру? [yes/no] ");
                userResponse = scan.nextLine();
                if (userResponse.equals("no")) {
                    isRun = false;
                } else if (userResponse.equals("yes")) {
                    guessGame.generateNewNumber();
                    System.out.print("\nНовая игра.");
                }
            } while (!userResponse.equals("yes") & !userResponse.equals("no"));
        }
    }
}

