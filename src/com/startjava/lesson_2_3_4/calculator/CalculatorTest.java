package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String userResponse = "yes";
        Scanner console = new Scanner(System.in);
        while (userResponse.equals("yes")) {
            String mathExpression;
            int result;
            System.out.print("Введите математическое выражение: ");

            while (true) {
                mathExpression = console.nextLine();
                try {
                    result = Calculator.calculate(mathExpression);
                    break;
                } catch (IllegalStateException e) {
                    System.out.println("Ошибка: " + e.getMessage() + "\nВведите корректное значение:");
                }
            }

            System.out.printf("%s = %d", mathExpression, result);
            do {
                System.out.print("\nХотите продолжить вычисления? [yes/no] ");
                userResponse = console.nextLine();
            } while (!userResponse.equals("yes") && !userResponse.equals("no"));
        }
    }
}


