package com.startjava.lesson_1.base;
public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль");
        byte numCpuCorse = 2;
        short volumeRam = 8;
        int volumeSsd = 128;
        long batteryCap = 4400;
        float monitorDiagonal = 21.5f;
        double cpuFreq = 2.5d;
        char cpuVersion = 'U';
        boolean wifi = true;
        System.out.println("Количество ядер:" + " " + numCpuCorse);
        System.out.println("Оперативная память(Гб):" + " " + volumeRam);
        System.out.println("Объем диска(Гб):" + " " + volumeSsd);
        System.out.println("Ёмкость батареи(мА*ч):" + " " + batteryCap);
        System.out.println("Диагональ монитора(Дюйм):" + " " + monitorDiagonal);
        System.out.println("Тактовая частота процессора(ГГц):" + " " + cpuFreq);
        System.out.println("Версия процессора:" + " " + cpuVersion);
        System.out.println("Наличие wifi:" + " " + wifi + '\n');

        System.out.println("2. Расчет стоимости товара со скидкой");
        short penPrice = 100;
        short bookPrice = 200;
        short sumPrice = (short) (penPrice + bookPrice);
        float discountSum = sumPrice * 0.11f;
        float discountPrice = sumPrice - discountSum;
        System.out.println(discountSum);
        System.out.println(discountPrice + "\n");

        System.out.println("3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a\n");

        System.out.println("4. Отображение min и max значений числовых типов данных");
        byte byteMax = 127;
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807L;
        System.out.println(byteMax);
        System.out.println(++byteMax);
        System.out.println(--byteMax);
        System.out.println(shortMax);
        System.out.println(++shortMax);
        System.out.println(--shortMax);
        System.out.println(intMax);
        System.out.println(++intMax);
        System.out.println(--intMax);
        System.out.println(longMax);
        System.out.println(++longMax);
        System.out.println(--longMax + "\n");

        System.out.println("5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        int numTemp;
        System.out.println("5.1 с помощью третьей переменной");
        System.out.println("num1 = " + num1 + "\t num2 = " + num2);
        numTemp = num1;
        num1 = num2;
        num2 = numTemp;
        System.out.println("num1 = " + num1 + "\t num2 = " + num2);
        System.out.println("5.2 с помощью арифметических операций");
        System.out.println("num1 = " + num1 + "\t num2 = " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("num1 = " + num1 + "\t num2 = " + num2);
        System.out.println("5.2 с помощью побитовой операции ^");
        System.out.println("num1 = " + num1 + "\t num2 = " + num2);
        num1 ^=  num2;
        num2 ^=  num1;
        num1 ^=  num2;
        System.out.println("num1 = " + num1 + "\t num2 = " + num2 + "\n");

        System.out.println("6. Вывод символов и их кодов");
        char symbol1 = 35;
        char symbol2 = 38;
        char symbol3 = 64;
        char symbol4 = 94;
        char symbol5 = 95;
        System.out.println((int) symbol1 + " " + symbol1);
        System.out.println((int) symbol2 + " " + symbol2);
        System.out.println((int) symbol3 + " " + symbol3);
        System.out.println((int) symbol4 + " " + symbol4);
        System.out.println((int) symbol5 + " " + symbol5 + "\n");

        System.out.println("7. Отображение количества сотен, десятков и единиц числа");
        int number = 123;
        int ones = number % 10;
        int tens = (number / 10) % 10;
        int hundreds = (number / 100) % 10;
        System.out.println("Число N содержит:\n" + hundreds + " сотен\n" + tens + " десятков\n" + ones + " единиц\n");

        System.out.println("8. Вывод на консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char space = ' ';
        char underscore = '_';
        char openParant = '(';
        char closeParant = ')';
        System.out.println("" + space + space + space + space + slash + backSlash);
        System.out.println("" + space + space + space + slash + space + space + backSlash);
        System.out.println("" + space + space + slash + underscore + openParant + space + closeParant + backSlash);
        System.out.println("" + space + slash + space + space + space + space + space + space + backSlash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash + backSlash +
                underscore + underscore + backSlash + '\n');

        System.out.println("9. Произведение и сумма цифр числа");
        short originalNum = 345;
        ones = originalNum % 10;
        tens = (originalNum / 10) % 10;
        hundreds = (originalNum / 100) % 10;
        int sumDigits = ones + tens + hundreds;
        int prodDigits = ones * tens * hundreds;
        System.out.println("сумма цифр числа " + originalNum + " = " + sumDigits);
        System.out.println("произведение цифр числа " + originalNum + " = " + prodDigits + '\n');

        System.out.println("10. Преобразование секунд");
        int seconds = 86399;
        byte hours = (byte) (seconds / 3600);
        byte minutes = (byte) (seconds % 3600 / 60 );
        seconds = (byte) (seconds % 60 );
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
