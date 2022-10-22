package com.startjava.lesson_2_3.calculator;

public class Calculator {
    private int a;
    private int b;
    private char sign;

    public void preparetMathExpression(String mathExpression) {
        String[] mathArr;
        mathArr = mathExpression.split(" ");
        setA(Integer.parseInt(mathArr[0]));
        setSign(mathArr[1].charAt(0));
        setB(Integer.parseInt(mathArr[2]));
    }


    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public boolean setSign(char sign) {
        if (sign == '+' || sign == '-' || sign == '*' || sign == '/' || sign == '^' || sign == '%') {
            this.sign = sign;
            return true;
        }
        return false;
    }

    public int calculate(String mathExpression) {
        preparetMathExpression(mathExpression);
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