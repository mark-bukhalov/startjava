import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String userResponse = "yes";
        Calculator myCalc = new Calculator();
        Scanner console = new Scanner(System.in);
        while (userResponse.equals("yes")) {
            System.out.print("Введите первое число: ");
            myCalc.setA(console.nextInt());
            boolean validSign = false;
            while (validSign != true) {
                System.out.print("Введите знак математической операции: ");
                validSign = myCalc.setSign(console.next().charAt(0));
            }

            System.out.print("Введите второе число: ");
            myCalc.setB(console.nextInt());
            int result = myCalc.calculate();
            System.out.printf("%d %c %d = %d", myCalc.getA(), myCalc.getSign(), myCalc.getB(), result);

            console.nextLine();
            do {
                System.out.print("\nХотите продолжить вычисления? [yes/no] ");
                userResponse = console.nextLine();
            } while (!userResponse.equals("yes") && !userResponse.equals("no"));
        }
    }
}



