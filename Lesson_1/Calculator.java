public class Calculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 1;
        char sign = '^';
        int result = 0;

        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            result = a / b;
        } else if (sign == '^') {
            result = 1;
            for (int i = b; i > 0; i--) {
                result = result * a;
            }
        } else {
            result = a % b;
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}
