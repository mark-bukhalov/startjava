public class CyclesTheme {
    public static void main(String[] args) {

        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int i = -10;
        int evenSum = 0;
        int oddSum = 0;
        do {
            if (i % 2 == 0) {
                evenSum++;
            } else {
                oddSum++;
            }
            i++;
        } while (i <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + evenSum + ", а нечетных = " + oddSum);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int numMax;
        int numMin;
        if (num1 > num2) {
            if (num1 > num3) {
                numMax = num1;
            } else {
                numMax = num3;
            }
        } else if (num2 > num3) {
            numMax = num2;
        } else {
            numMax = num3;
        }
        if (num1 < num2) {
            if (num1 < num3) {
                numMin = num1;
            } else {
                numMin = num3;
            }
        } else if (num2 < num3) {
            numMin = num2;
        } else {
            numMin = num3;
        }
        numMax--;
        for (; numMax > numMin; numMax--) {
            System.out.println(numMax);
        }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int num4 = 0;
        i = 1;
        while (i < 5) {
            if (i == 1) {
                num1 = (number % 10);
                number = number / 10;
            } else if (i == 2) {
                num2 = (number % 10);
                number = number / 10;
            } else if (i == 3) {
                num3 = (number % 10);
                number = number / 10;
            } else if ((i == 4)) {
                num4 = (number % 10);
                number = number / 10;
            }
            i++;
        }
        System.out.println("" + num1 + num2 + num3 + num4);
        System.out.println(num1 + num2 + num3 + num4);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        i = 1;
        int symCount = 0;
        for (; i < 24; i += 2) {
            if (symCount == 5) {
                System.out.println();
                symCount = 0;
            }
            System.out.printf("%3s", i);
            symCount++;
        }
        for (; symCount < 5; symCount++) {
            System.out.printf("%3s", 0);
        }

        System.out.println("\n\n4. Проверка количества единиц на четность");
        int oneCounter = 0;
        String numInfo;
        number = 3141591;
        int numberSave = number;
        while (number > 0) {
            num1 = number % 10;
            number = number / 10;
            if (num1 == 1) {
                oneCounter++;
            }
        }
        if (oneCounter % 2 == 0) {
            numInfo = "четное";
        } else {
            numInfo = "нечетное";
        }
        System.out.println("число " + numberSave + " содержит " + numInfo + " количество единиц");

        System.out.println("\n6.Отображение фигур в консоли");
        int row = 0;
        int column = 0;
        char symbol = '*';
        for (; row < 5; row++) {
            column = 0;
            for (; column < 10; column++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
        row = 0;
        column = 0;
        symbol = '#';
        int columnMax = 5;
        while (row < 5) {
            column = 0;
            while (column < columnMax) {
                System.out.print(symbol);
                column++;
            }
            System.out.println();
            columnMax--;
            row++;
        }
        symbol = '$';
        row = 0;
        column = 0;
        columnMax = 0;
        do {
            if (row < 3) {
                columnMax++;
            } else {
                columnMax--;
            }
            column = 0;
            do {
                System.out.print(symbol);
                column++;
            } while (column < columnMax);
            System.out.println();
            row++;
        } while (row < 5);

        System.out.println("\n7.Отображение ASCII-символов");
        for (i = 1; i < 48; i += 2) {
            symbol = (char) i;
            System.out.printf("%2s %1s\n", i, symbol);
        }
        for (i = 98; i < 123; i += 2) {
            symbol = (char) i;
            System.out.printf("%3s %1s\n", i, symbol);
        }

        System.out.println("\n8.Проверка, является ли число палиндромом");
        number = 1234321;
        numberSave = number;
        int numberReverse = 0;
        int nubmerRemaind = 0;
        while (number > 0) {
            nubmerRemaind = number % 10;
            numberReverse = numberReverse * 10 + nubmerRemaind;
            number = number / 10;
        }
        if (numberSave == numberReverse) {
            numInfo = " является";
        } else {
            numInfo = " не является";
        }
        System.out.println("Число " + numberSave + numInfo + " палиндромом");

        System.out.println("\n9.Определение, является ли число счастливым");
        number = 123231;
        num1 = num2 = 0;
        for (i = 0; i < 6; i++) {
            if (i < 3) {
                num1 = num1 + number % 10;
            } else {
                num2 = num2 + number % 10;
            }
            number = number / 10;
        }
        if (num1 == num2) {
            System.out.println("Число является счастливым");
        } else {
            System.out.println("Число не является счастливым");
        }

        System.out.println("\n10.Определение, является ли число счастливым");
        for (row = 1; row < 10; row++) {
            if (row == 2) {
                System.out.println(" ——|—————————————————————————");
            }
            for (column = 1; column < 10; column++) {
                if (column == 2) {
                    System.out.print("|");
                }
                System.out.printf("%3s", row * column);
            }
            System.out.println();
        }
    }
}