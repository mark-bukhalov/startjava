import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun == true) {
            Calculator myCalc = new Calculator();

            System.out.print("Введите первое число: ");
            Scanner userInput = new Scanner(System.in);
            int a = userInput.nextInt();
            myCalc.setA(a);

            while (myCalc.signIsSet() != true) {
                System.out.print("Введите знак математической операции: ");
                char sign = userInput.next().charAt(0);
                myCalc.setSign(sign);
            }

            System.out.print("Введите второе число: ");
            int b = userInput.nextInt();
            myCalc.setB(b);
            int result = myCalc.calculate();
            System.out.printf("%d %c %d = %d", myCalc.getA(), myCalc.getSign(), myCalc.getB(), result);

            String userResponse;
            userInput.nextLine();
            do {
                System.out.print("\nХотите продолжить вычисления? [yes/no] ");
                userResponse = userInput.nextLine();
                if (userResponse.equals("no")) {
                    isRun = false;
                }
            } while (!userResponse.equals("yes") & !userResponse.equals("no"));
        }
    }
}



