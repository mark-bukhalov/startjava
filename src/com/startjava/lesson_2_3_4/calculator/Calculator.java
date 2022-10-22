package com.startjava.lesson_2_3.calculator;

public class Calculator {
    private int a;
    private int b;
    private char sign;

    public void parseMathExpression(String mathExpression) {
        String[] partsExpression = mathExpression.split(" ");
        a = Integer.parseInt(partsExpression[0]);
        setSign(partsExpression[1].charAt(0));
        b = Integer.parseInt(partsExpression[2]);
    }

    public boolean setSign(char sign) {
        if (sign == '+' || sign == '-' || sign == '*' || sign == '/' || sign == '^' || sign == '%') {
            this.sign = sign;
            return true;
        }
        return false;
    }

    public int calculate(String mathExpression) {
        parseMathExpression(mathExpression);
        switch (sign) {
            case '+':
                return Math.addExact(a, b);
            case '-':
                return a - b;
            case '*':
                return Math.multiplyExact(a, b);
            case '/':
                return Math.floorDiv(a, b);
            case '^':
                return (int) Math.pow(a, b);
            case '%':
                return Math.floorMod(a, b);
        }
        return 0;
    }
}