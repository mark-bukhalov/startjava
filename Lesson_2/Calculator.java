public class Calculator {
    int a;
    int b;
    char sign = ' ';

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        if (sign == '+' || sign == '-' || sign == '*' || sign == '/' || sign == '^' || sign == '%') {
            this.sign = sign;
        }
    }

    public boolean signIsSet() {
        if (sign != ' ') {
            return true;
        }
        return false;
    }

    public int calculate() {
        int result = 0;
        switch (sign) {
            case ('+'):
                result = a + b;
                break;
            case ('-'):
                result = a - b;
                break;
            case ('*'):
                result = a * b;
                break;
            case ('/'):
                result = a / b;
                break;
            case ('^'):
                result = 1;
                for (int i = b; i > 0; i--) {
                    result *= a;
                }
                break;
            case ('%'):
                result = a % b;
                break;
        }
        return result;
    }
}