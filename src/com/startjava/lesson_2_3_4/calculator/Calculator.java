package com.startjava.lesson_2_3.calculator;

public class Calculator {
    private static int a;
    private static int b;
    private static char sign;

    private static void parseMathExpression(String mathExpression) throws Exception {
        String[] partsExpression = mathExpression.split(" ");
        ValidateNum(partsExpression);
        a = Integer.parseInt(partsExpression[0]);
        b = Integer.parseInt(partsExpression[2]);
        sign = partsExpression[1].charAt(0);
    }

    private static void ValidateNum(String[] vaildationData) throws Exception {
        if (!vaildationData[0].matches("\\d+") || !vaildationData[2].matches("\\d+")) {
            throw new Exception("Возможен ввод только целых, положительных чисел");
        }
    }

    public static int calculate(String mathExpression) throws Exception {
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
}