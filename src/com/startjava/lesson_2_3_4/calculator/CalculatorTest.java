package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String userResponse = "yes";
        Scanner console = new Scanner(System.in);
        while (userResponse.equals("yes")) {
            String mathExpression;
            boolean successInput;
            int result = 0;
            System.out.print("Введите математическое выражение: ");
            do {
                mathExpression = console.nextLine();
                try {
                    result = Calculator.calculate(mathExpression);
                    successInput = true;
                } catch (Exception e) {
                    successInput = false;
                    System.out.println("Ошибка: " + e.getMessage());
                    System.out.print("Введите корректное значение:");
                }
            } while (!successInput);
            System.out.printf("%s = %d", mathExpression, result);
            do {
                System.out.print("\nХотите продолжить вычисления? [yes/no] ");
                userResponse = console.nextLine();
            } while (!userResponse.equals("yes") && !userResponse.equals("no"));
        }
    }
}


