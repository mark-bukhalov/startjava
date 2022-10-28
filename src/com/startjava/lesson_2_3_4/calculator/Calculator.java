package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private static int a;
    private static int b;
    private static char sign;

    public static int calculate(String mathExpression) {
        parseMathExpression(mathExpression);
        return switch (sign) {
            case '+' -> Math.addExact(a, b);
            case '-' -> a - b;
            case '*' -> Math.multiplyExact(a, b);
            case '/' -> Math.floorDiv(a, b);
            case '^' -> (int) Math.pow(a, b);
            case '%' -> Math.floorMod(a, b);
            default -> throw new IllegalStateException("Ошибочный знак операции");
        };
    }

    private static void parseMathExpression(String mathExpression) {
        String[] partsExpression = mathExpression.split(" ");
        validateNum(partsExpression);
        a = Integer.parseInt(partsExpression[0]);
        b = Integer.parseInt(partsExpression[2]);
        sign = partsExpression[1].charAt(0);
    }

    private static void validateNum(String[] validationData) {
        if (!validationData[0].matches("\\d+") || !validationData[2].matches("\\d+")) {
            throw new IllegalStateException
                    ("Возможен ввод только целых, положительных чисел");
        }
    }