public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (counter % 2 == 0) {
                sumEven++;
            } else {
                sumOdd++;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int maxNum = num1;
        int minNum = num2;
        if (maxNum < num2) {
            maxNum = num2;
        } else if (maxNum < num3) {
            maxNum = num3;
        }
        if (minNum > num2) {
            minNum = num2;
        } else if (minNum > num3) {
            minNum = num3;
        }
        maxNum--;
        for (; maxNum > minNum; maxNum--) {
            System.out.print(maxNum + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int sumDigit = 0;
        while (number > 0) {
            int digit = number % 10;
            System.out.print(digit);
            sumDigit += digit;
            number /= 10;
        }
        System.out.println("\n" + sumDigit);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        counter = 1;
        int countSym = 0;
        for (; counter < 24; counter += 2) {
            if (countSym == 5) {
                System.out.println();
                countSym = 0;
            }
            System.out.printf("%3s", counter);
            countSym++;
        }
        for (; countSym < 5; countSym++) {
            System.out.printf("%3s", 0);
        }

        System.out.println("\n\n5. Проверка количества единиц на четность");
        int countOnes = 0;
        number = 3141591;
        int copyNumber = number;
        while (number > 0) {
            num1 = number % 10;
            number /= 10;
            if (num1 == 1) {
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
        System.out.println();
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
        System.out.println();
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
        for (counter = 1; counter < 48; counter += 2) {
            System.out.printf("%2s\t\t%1c\n", counter, counter);
        }
        for (counter = 98; counter < 123; counter += 2) {
            System.out.printf("%3s\t\t%1c\n", counter, counter);
        }

        System.out.println("\n8.Проверка, является ли число палиндромом");
        number = 1234321;
        copyNumber = number;
        int numberReverse = 0;
        while (number > 0) {
            int digit = number % 10;
            numberReverse = numberReverse * 10 + digit;
            number /= 10;
        }
        if (copyNumber == numberReverse) {
            numInfo = " является";
        } else {
            numInfo = " не является";
        }
        System.out.println("Число " + copyNumber + numInfo + " палиндромом");

        System.out.println("\n9.Определение, является ли число счастливым");
        number = 12345678;
        copyNumber = number;
        int countDigit = 0;
        while (number > 0) {
            countDigit++;
            number /= 10;
        }
        num1 = num2 = 0;
        int sumDigit1 = 0;
        int sumDigit2 = 0;
        number = copyNumber;
        for (counter = 1; counter <= countDigit; counter++) {
            if (counter <= (countDigit / 2)) {
                sumDigit1 = sumDigit1 + number % 10;
                num1 = num1 * 10 + number % 10;
            } else {
                sumDigit2 = sumDigit2 + number % 10;
                num2 = num2 * 10 + number % 10;
            }
            number /= 10;
        }
        System.out.println("Сумма цифр " + num1 + " = " + sumDigit1);
        System.out.println("Сумма цифр " + num2 + " = " + sumDigit2);
        if (sumDigit1 == sumDigit2) {
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