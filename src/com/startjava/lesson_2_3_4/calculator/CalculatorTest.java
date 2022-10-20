package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String userResponse = "yes";
        Calculator myCalc = new Calculator();
        Scanner console = new Scanner(System.in);
        while (userResponse.equals("yes")) {
            System.out.print("Введите математическое выражение: ");
            myCalc.inputMathExpression(console.nextLine());
            int result = myCalc.calculate();
            System.out.printf("%d %c %d = %d", myCalc.getA(), myCalc.getSign(), myCalc.getB(), result);
            do {
                System.out.print("\nХотите продолжить вычисления? [yes/no] ");
                userResponse = console.nextLine();
            } while (!userResponse.equals("yes") && !userResponse.equals("no"));
        }
    }
}


