package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String userResponse = "yes";
        Calculator calculator = new Calculator();
        Scanner console = new Scanner(System.in);
        while (userResponse.equals("yes")) {
            System.out.print("Введите математическое выражение: ");
            String mathExpression = console.nextLine();
            int result = calculator.calculate(mathExpression);
            System.out.printf("%s = %d", mathExpression, result);
            do {
                System.out.print("\nХотите продолжить вычисления? [yes/no] ");
                userResponse = console.nextLine();
            } while (!userResponse.equals("yes") && !userResponse.equals("no"));
        }
    }
}


