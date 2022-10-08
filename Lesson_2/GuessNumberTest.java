import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Player player1 = new Player("Mark");
        Player player2 = new Player("Maksim");
        GuessNumber guessGame = new GuessNumber(player1, player2);
        boolean isRun = true;
        int countGame = 0;
        while (isRun == true) {
            Scanner userInput = new Scanner(System.in);
            boolean isGuessed;
            if (countGame % 2 == 0) {
                System.out.printf("%n%s ваш ход: ", player1.getName());
                player1.setNumber(userInput.nextInt());
                isGuessed = guessGame.CheckPlayer1();
            } else {
                System.out.printf("%n%s ваш ход: ", player2.getName());
                player2.setNumber(userInput.nextInt());
                isGuessed = guessGame.CheckPlayer2();
            }
            countGame++;
            if (isGuessed == true) {
                userInput.nextLine();
                String userResponse;
                do {
                    System.out.print("\nХотите продолжить игру? [yes/no] ");
                    userResponse = userInput.nextLine();
                    if (userResponse.equals("no")) {
                        isRun = false;
                    } else if (userResponse.equals("yes")) {
                        guessGame.GenerateNewNumber();
                        countGame = 0;
                        System.out.print("\nНовая игра.");
                    }
                } while (!userResponse.equals("yes") & !userResponse.equals("no"));
            }
        }
    }
}
