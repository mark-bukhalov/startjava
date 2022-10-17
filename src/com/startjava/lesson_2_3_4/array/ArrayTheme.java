package com.startjava.lesson_2_3.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {3, 2, 1, 7, 6, 5, 4};
        int len = intArr.length - 1;
        printIntArr(intArr);
        for (int i = 0; i <= len / 2; i++, len--) {
            int temp = intArr[i];
            intArr[i] = intArr[len];
            intArr[len] = temp;
        }
        System.out.println();
        printIntArr(intArr);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        intArr = new int[10];
        len = intArr.length;
        for (int i = 0; i < len; i++) {
            intArr[i] = i;
        }
        int prodDigit = 1;
        for (int i = 1; i < 9; i++) {
            prodDigit *= intArr[i];
            System.out.print(intArr[i] + (i != len - 2 ? " * " : " = " + prodDigit));
        }
        System.out.println("\n" + intArr[0] + " и " + intArr[9]);

        System.out.println("\n3.Удаление элементов массива");
        double[] doubleArr = new double[15];
        len = doubleArr.length;
        for (int i = 0; i < len; i++) {
            doubleArr[i] = Math.random();
        }
        System.out.println("Исходный массив:");
        printDoubleArr(doubleArr);
        int countReset = 0;
        double middleNum = doubleArr[(len / 2) + 1];
        for (int i = 0; i < len; i++) {
            if (doubleArr[i] > middleNum) {
                doubleArr[i] = 0;
                countReset++;
            }
        }
        System.out.println("\nИзменённый массив:");
        printDoubleArr(doubleArr);
        System.out.println("\nКоличество обнулений: " + countReset);

        System.out.print("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] charArr = new char[26];
        len = charArr.length;
        char symbol = 'A';
        for (int i = 0; i < len; i++) {
            charArr[i] = symbol;
            symbol++;
        }
        for (int i = len; i >= 0; i--) {
            for (int j = len - 1; j >= i; j--) {
                System.out.print(charArr[j]);
            }
            System.out.println();
        }

        System.out.print("\n5. Генерация уникальных чисел");
        intArr = new int[30];
        len = intArr.length;
        for (int i = 0; i < len; i++) {
            int randomNum;
            do {
                randomNum = generateRandomNum(60, 100);
            } while (numbIsUnigue(intArr, randomNum) != true);
            intArr[i] = randomNum;
        }
        Arrays.sort(intArr);
        for (int i = 0; i < len; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.printf("%3d", intArr[i]);
        }

        System.out.print("\n\n6. Сдвиг элементов массива\n");
        String[] stringArr1 = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int countNotBlank = 0;
        for (String element : stringArr1) {
            if (!element.isBlank()) {
                countNotBlank++;
            }
        }
        String[] stringArr2 = new String[countNotBlank];
        int start1 = 0;
        int start2 = 0;
        len = 0;
        for (int i = 0; i < stringArr1.length; i++) {
            if (stringArr1[i].isBlank()) {
                System.arraycopy(stringArr1, start1, stringArr2, start2, len);
                start1 = i + 1;
                start2 += len;
                len = 0;
            } else {
                len++;
            }
        }
        System.out.println("Исходный массив:");
        printStringArr(stringArr1);
        System.out.print("\nНовый массив:\n");
        printStringArr(stringArr2);
    }

    private static void printIntArr(int[] intArr) {
        for (int number : intArr) {
            System.out.print(number + " ");
        }
    }

    private static void printDoubleArr(double[] doubleArr) {
        for (int i = 0; i < doubleArr.length; i++) {
            if (i == 8) {
                System.out.println();
            }
            System.out.printf("%6.3f", doubleArr[i]);
        }
    }

    private static int generateRandomNum(int from, int to) {
        return (int) (from + (Math.random() * (to - from)));
    }

    private static boolean numbIsUnigue(int[] intArr, int num) {
        for (int element : intArr) {
            if (num == element) {
                return false;
            }
        }
        return true;
    }

    private static void printStringArr(String[] stringArr) {
        for (String element : stringArr) {
            System.out.printf("[%s] ", element);
        }
    }
}