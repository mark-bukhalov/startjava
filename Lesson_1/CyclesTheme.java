public class CyclesTheme {
    public static void main(String[] args) {

        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int i = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (i % 2 == 0) {
                sumEven++;
            } else {
                sumOdd++;
            }
            i++;
        } while (i <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int maxNum;
        int minNum;
        if (num1 > num2) {
            if (num1 > num3) {
                maxNum = num1;
            } else {
                maxNum = num3;
            }
        } else if (num2 > num3) {
            maxNum = num2;
        } else {
            maxNum = num3;
        }
        if (num1 < num2) {
            if (num1 < num3) {
                minNum = num1;
            } else {
                minNum = num3;
            }
        } else if (num2 < num3) {
            minNum = num2;
        } else {
            minNum = num3;
        }
        maxNum--;
        for (; maxNum > minNum; maxNum--) {
            System.out.println(maxNum);
        }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int numberReverse = 0;
        int nubmerRemaind = 0;
        int sumDigit = 0;
        while (number > 0) {
            nubmerRemaind = number % 10;
            numberReverse = numberReverse * 10 + nubmerRemaind;
            sumDigit += nubmerRemaind;
            number = number / 10;
        }
        System.out.println(numberReverse);
        System.out.println(sumDigit);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        i = 1;
        int countSym = 0;
        for (; i < 24; i += 2) {
            if (countSym == 5) {
                System.out.println();
                countSym = 0;
            }
            System.out.printf("%3s", i);
            countSym++;
        }
        for (; countSym < 5; countSym++) {
            System.out.printf("%3s", 0);
        }

        System.out.println("\n\n5. Проверка количества единиц на четность");
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
        int maxColumn = 5;
        while (row < 5) {
            column = 0;
            while (column < maxColumn) {
                System.out.print(symbol);
                column++;
            }
            System.out.println();
            maxColumn--;
            row++;
        }
        symbol = '$';
        row = 0;
        column = 0;
        maxColumn = 0;
        do {
            if (row < 3) {
                maxColumn++;
            } else {
                maxColumn--;
            }
            column = 0;
            do {
                System.out.print(symbol);
                column++;
            } while (column < maxColumn);
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
        numberReverse = 0;
        nubmerRemaind = 0;
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
        int sumDigit1 = 0;
        int sumDigit2 = 0;
        for (i = 0; i < 6; i++) {
            if (i < 3) {
                sumDigit1 = sumDigit1 + number % 10;
                num1 = num1 * 10 + number % 10;
            } else {
                sumDigit2 = sumDigit2 + number % 10;
                num2 = num2 * 10 + number % 10;
            }
            number = number / 10;
        }
        System.out.println("Сумма цифр " + num1 + " = " + sumDigit1);
        System.out.println("Сумма цифр " + num2 + " = " + sumDigit2);
        if (sumDigit1 == sumDigit2) {
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