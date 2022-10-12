import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String userResponse = "yes";
        Calculator myCalc = new Calculator();
        Scanner userInput = new Scanner(System.in);
        while (userResponse.equals("yes")) {
            System.out.print("Введите первое число: ");
            int a = userInput.nextInt();
            myCalc.setA(a);
            boolean isSetSign = false;
            while (isSetSign != true) {
                System.out.print("Введите знак математической операции: ");
                char sign = userInput.next().charAt(0);
                isSetSign = myCalc.setSign(sign);
            }

            System.out.print("Введите второе число: ");
            int b = userInput.nextInt();
            myCalc.setB(b);
            int result = myCalc.calculate();
            System.out.printf("%d %c %d = %d", myCalc.getA(), myCalc.getSign(), myCalc.getB(), result);

            userInput.nextLine();
            do {
                System.out.print("\nХотите продолжить вычисления? [yes/no] ");
                userResponse = userInput.nextLine();
            } while (!userResponse.equals("yes") & !userResponse.equals("no"));
        }
    }
}



