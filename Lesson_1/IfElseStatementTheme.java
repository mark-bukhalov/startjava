public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 24;
        char gender = 'M';
        float height = 1.73f;
        String name = "Mark";
        if (age > 20) {
            System.out.println("Возраст более 20 лет");
        } else {
            System.out.println("Возраст меньше или равен 20");
        }
        if (gender != 'M') {
            System.out.println("Пол женский");
        } else {
            System.out.println("Пол мужской");
        }
        if (height < 1.80) {
            System.out.println("Рост меньше чем 1.80");
        } else {
            System.out.println("Рост больше или равен 1.80");
        }
        char firstCharName = name.charAt(0);
        if (firstCharName == 'M') {
            System.out.println("Возможно вас зовут Марк");
        } else if (firstCharName == 'I') {
            System.out.println("Возможно вас зовут Игорь");
        } else {
            System.out.println("Не знаю как вас зовут но точно не Марк или Игорь");
        }

        System.out.println("\n2. Поиск max и min числа");
        int num1 = 100;
        int num2 = 77;
        if (num1 > num2) {
            System.out.println("max:" + num1 + '\t' + "min:" + num2);
        } else if (num2 > num1) {
            System.out.println("max:" + num2 + '\t' + "min:" + num1);
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n3. Работа с числом");
        int srcNum = 60001;
        if (srcNum == 0) {
            System.out.println("Число равно нулю");
        } else {
            if (srcNum % 2 == 0) {
                System.out.println("Число чётное");
            } else {
                System.out.println("Число нечетное");
            }
            if (srcNum > 0) {
                System.out.println("Число положительное");
            } else {
                System.out.println("Число отрицательное");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int srcNum1 = 121;
        int srcNum2 = 321;
        int ones1 = srcNum1 % 10;
        int tens1 = (srcNum1 / 10) % 10;
        int hundreds1 = (srcNum1 / 100) % 10;
        int ones2 = srcNum2 % 10;
        int tens2 = (srcNum2 / 10) % 10;
        int hundreds2 = (srcNum2 / 100) % 10;
        System.out.println("Исходные числа: " + srcNum1 + " и " + srcNum2);
        if (ones1 == ones2) {
            System.out.println("Разряд 1, одинаковое число " + ones1);
        }
        if (tens1 == tens2) {
            System.out.println("Разряд 2, одинаковое число " + tens1);
        }
        if (hundreds1 == hundreds2) {
            System.out.println("Разряд 3, одинаковое число " + hundreds1);
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char symbol = '\u0057';
        System.out.print(symbol);
        if (symbol >= '0' && symbol <= '9') {
            System.out.println(" число");
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.println(" маленькая буква");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println(" большая буква");
        } else {
            System.out.println(" не буква и не число");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        int depositAmount = 300_000;
        float interestDeposit;
        if (depositAmount < 100_000) {
            interestDeposit = (float) (depositAmount * 0.05);
        } else if (depositAmount <= 300_000) {
            interestDeposit = (float) (depositAmount * 0.07);
        } else {
            interestDeposit = (float) (depositAmount * 0.1);
        }
        System.out.println(depositAmount + "\n" + interestDeposit + "\n" + (depositAmount + interestDeposit));

        System.out.println("\n7. Определение оценки по предметам");
        int percentHistory = 59;
        int percentProgramming = 91;
        int scoreHistory;
        int scoreProgramming;
        if (percentHistory > 91) {
            scoreHistory = 5;
        } else if (percentHistory > 73) {
            scoreHistory = 4;
        } else if (percentHistory > 60) {
            scoreHistory = 3;
        } else {
            scoreHistory = 2;
        }
        if (percentProgramming > 91) {
            scoreProgramming = 5;
        } else if (percentProgramming > 73) {
            scoreProgramming = 4;
        } else if (percentProgramming > 60) {
            scoreProgramming = 3;
        } else {
            scoreProgramming = 2;
        }
        System.out.println(scoreHistory + " История" + "\n" + scoreProgramming + " Программирование");
        System.out.println((scoreHistory + scoreProgramming) / 2);
        System.out.println((percentHistory + percentProgramming) / 2);

        System.out.println("\n8. Расчет прибыли");
        int annualProfit = (13_000 - 9_000 - 5_000) * 12;
        if (annualProfit > 0) {
            System.out.println("прибыль за год: +" + annualProfit + " руб.\n");
        } else {
            System.out.println("прибыль за год: " + annualProfit + " руб.\n");
        }

        System.out.println("9. Подсчет количества банкнот");
        int reqAmount = 567;
        int ones = reqAmount % 10;
        int tens = (reqAmount / 10) % 10;
        int hundreds = (reqAmount / 100) % 10;
        final int maxTensBanknot = 5;
        if (tens > maxTensBanknot) {
            ones += (tens - maxTensBanknot) * 10;
            tens = maxTensBanknot;
        }
        int checkReqAmount = hundreds * 100 + tens * 10 + ones;
        System.out.printf("Номинал: %3s\tКоличество: %2s\n", 1, ones);
        System.out.printf("Номинал: %3s\tКоличество: %2s\n", 10, tens);
        System.out.printf("Номинал: %3s\tКоличество: %2s\n", 100, hundreds);
        System.out.println("Проверочная сумма: " + checkReqAmount);
    }
}
