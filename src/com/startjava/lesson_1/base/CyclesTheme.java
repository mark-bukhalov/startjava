package com.startjava.lesson_1.base;

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
        int maxNum = num1;
        int minNum = num2;
        if (num2 > maxNum) {
            maxNum = num2;
        }
        if (num3 > maxNum) {
            maxNum = num3;
        }
        if (num2 < minNum) {
            minNum = num2;
        }
        if (num3 < minNum) {
            minNum = num3;
        }
        maxNum--;
        for (; maxNum > minNum; maxNum--) {
            System.out.print(maxNum + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int sumDigits = 0;
        while (number > 0) {
            int digit = number % 10;
            System.out.print(digit);
            sumDigits += digit;
            number /= 10;
        }
        System.out.println("\n" + sumDigits);

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
        number = 3141591;
        int copyNumber = number;
        int countOnes = 0;
        while (number > 0) {
            int digit = number % 10;
            number /= 10;
            if (digit == 1) {
                countOnes++;
            }
        }
        String numInfo = "нечетное";
        if (countOnes % 2 == 0) {
            numInfo = "четное";
        }
        System.out.println("число " + copyNumber + " содержит " + numInfo + " количество единиц");

        System.out.println("\n6.Отображение фигур в консоли");
        int row = 0;
        int column = 0;
        for (; row < 5; row++) {
            column = 0;
            for (; column < 10; column++) {
                System.out.print('*');
            }
            System.out.println();
        }

        row = 0;
        int maxColumn = 5;
        while (row < 5) {
            column = 0;
            while (column < maxColumn) {
                System.out.print('#');
                column++;
            }
            System.out.println();
            maxColumn--;
            row++;
        }

        row = 0;
        maxColumn = 0;
        do {
            if (row < 3) {
                maxColumn++;
            } else {
                maxColumn--;
            }
            column = 0;
            do {
                System.out.print('$');
                column++;
            } while (column < maxColumn);
            System.out.println();
            row++;
        } while (row < 5);

        System.out.println("\n7.Отображение ASCII-символов");
        System.out.println("Dec\t\tChar");
        for (i = 1; i < 48; i += 2) {
            System.out.printf("%2s\t\t%1c\n", i, i);
        }
        for (i = 98; i < 123; i += 2) {
            System.out.printf("%3s\t\t%1c\n", i, i);
        }

        System.out.println("\n8.Проверка, является ли число палиндромом");
        number = 1234321;
        copyNumber = number;
        int reverseNumber = 0;
        while (number > 0) {
            int digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number /= 10;
        }
        numInfo = " не является";
        if (copyNumber == reverseNumber) {
            numInfo = " является";
        }
        System.out.println("Число " + copyNumber + numInfo + " палиндромом");

        System.out.println("\n9.Определение, является ли число счастливым");
        number = 12345678;
        copyNumber = number;
        int countDigits = 0;
        while (number > 0) {
            countDigits++;
            number /= 10;
        }
        num1 = num2 = 0;
        int sumDigits1 = 0;
        int sumDigits2 = 0;
        number = copyNumber;
        for (i = 1; i <= countDigits; i++) {
            int digit = number % 10;
            if (i <= (countDigits / 2)) {
                sumDigits1 += digit;
                num1 = num1 * 10 + digit;
            } else {
                sumDigits2 += digit;
                num2 = num2 * 10 + digit;
            }
            number /= 10;
        }
        System.out.println("Сумма цифр " + num1 + " = " + sumDigits1);
        System.out.println("Сумма цифр " + num2 + " = " + sumDigits2);
        if (sumDigits1 == sumDigits2) {
            System.out.println("Число является счастливым");
        } else {
            System.out.println("Число не является счастливым");
        }

        System.out.println("\n10.Вывод таблицы умножения Пифагора");
        for (row = 1; row < 10; row++) {
            if (row == 2) {
                System.out.println(" ——|—————————————————————————");
            }
            for (column = 1; column < 10; column++) {
                if (column == 2) {
                    System.out.print("|");
                }
                if (row == 1 && column == 1) {
                    System.out.printf("%3c", ' ');
                } else {
                    System.out.printf("%3s", row * column);
                }
            }
            System.out.println();
        }
    }
}