public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        byte age = 24;
        char gender = 'M';
        float height = 1.73f;
        String name = "Mark";
        if (age > 20) {
            System.out.println("Возраст более 20 лет");
        } else {
            System.out.println("Возраст мменьше или равен 20");
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
        byte num1 = 100;
        byte num2 = 77;
        if (num1 > num2) {
            System.out.println("max:" + num1 + '\t' + "min:" + num2);
        } else if (num2 > num1) {
            System.out.println("max:" + num2 + '\t' + "min:" + num1);
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n3. Работа с числом");
        int myNum = 60001;
        if (myNum == 0) {
            System.out.println("Число равно нулю");
        } else {
            if (myNum % 2 == 0) {
                System.out.println("Число чётное");
            } else {
                System.out.println("Число нечетное");
            }
            if (myNum > 0) {
                System.out.println("Число положительное");
            } else {
                System.out.println("Число отрицательное");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        short myNum1 = 121;
        short myNum2 = 321;
        String sameDigits;
        System.out.println(myNum1 + " " + myNum2);
        byte myNumOnes1 = (byte) (myNum1 % 10);
        byte myNumTens1 = (byte) ((myNum1 / 10) % 10);
        byte myNumHundreds1 = (byte) ((myNum1 / 100) % 10);
        byte myNumOnes2 = (byte) (myNum2 % 10);
        byte myNumTens2 = (byte) ((myNum2 / 10) % 10);
        byte myNumHundreds2 = (byte) ((myNum2 / 100) % 10);
        if (myNumOnes1 == myNumOnes2) {
            System.out.print(myNumOnes1);
        }
        if (myNumTens1 == myNumTens2) {
            System.out.print(myNumTens1);
        }
        if (myNumHundreds1 == myNumHundreds2) {
            System.out.print(myNumHundreds1);
        }
        System.out.println();
        if (myNumOnes1 == myNumOnes2) {
            System.out.print("1");
        }
        if (myNumTens1 == myNumTens2) {
            System.out.print("2");
        }
        if (myNumHundreds1 == myNumHundreds2) {
            System.out.print("3");
        }

        System.out.println("\n\n6. Определение суммы вклада и начисленных банком %");
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
        byte percentHistory = 59;
        byte percentProgramming = 91;
        byte scoreHistory;
        byte scoreProgramming;
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

        System.out.println("\n8. Подсчет количества банкнот");
        int reqAmount = 567;
        int numberOnes = reqAmount % 10;
        int numberTens = (reqAmount / 10) % 10;
        int numberHundreds = (reqAmount / 100) % 10;
        if (numberTens > 5) {
            numberOnes += (numberTens - 5) * 10;
            numberTens = 5;
        }
        int checkReqAmount = numberHundreds * 100 + numberTens * 10 + numberOnes;
        System.out.println("100 10 1");
        System.out.println(numberHundreds + " " + numberTens + " " + numberOnes);
        System.out.println(checkReqAmount);

    }
}
