public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль");
        byte numCorse = 2;
        short ram = 8;
        int ssd = 128;
        long batteryCap = 4400;
        float monitor = 21.5f;
        double cpu_freq = 2.5d;
        char cpu_version = 'U';
        boolean wifi = true;
        System.out.println("Количестов ядер:" + " " + numCorse);
        System.out.println("Оперативная память(Гб):" + " " + ram);
        System.out.println("Объем диска(Гб):" + " " + ssd);
        System.out.println("Ёмкость батареи(мА*ч):" + " " + batteryCap);
        System.out.println("Диагональ монитора(Дюйм):" + " " + monitor);
        System.out.println("Тактовая частота процессора(ГГц):" + " " + cpu_freq);
        System.out.println("Версия процессора:" + " " + cpu_version);
        System.out.println("Наличие wifi:" + " " + wifi + '\n');

        System.out.println("2. Расчет стоимости товара со скидкой");
        short penPrice = 100;
        short bookPrice = 200;
        short sumPrice = (short) (penPrice + bookPrice);
        float discountSum = sumPrice * 0.11f;
        float totalPrice = sumPrice - discountSum;
        System.out.println(discountSum);
        System.out.println(totalPrice + "\n");

        System.out.println("3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a\n");

        System.out.println("4. Отображение min и max значений числовых типов данных");
        byte byte_max = 127;
        short short_max = 32767;
        int int_max = 2147483647;
        long long_max = 9223372036854775807L;
        System.out.println(byte_max);
        byte_max++;
        System.out.println(byte_max);
        byte_max--;
        System.out.println(byte_max);
        System.out.println(short_max);
        short_max++;
        System.out.println(short_max);
        short_max--;
        System.out.println(short_max);
        System.out.println(int_max);
        int_max++;
        System.out.println(int_max);
        int_max--;
        System.out.println(int_max);
        System.out.println(long_max);
        long_max++;
        System.out.println(long_max);
        long_max--;
        System.out.println(long_max + "\n");

        System.out.println("5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        int num_temp;
        System.out.println("5.1 с помощью третьей переменной");
        System.out.println("num1 = " + num1 + "\t num2 = " + num2);
        num_temp = num1;
        num1 = num2;
        num2 = num_temp;
        System.out.println("num1 = " + num1 + "\t num2 = " + num2);
        System.out.println("5.2 с помощью арифметических операций");
        System.out.println("num1 = " + num1 + "\t num2 = " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("num1 = " + num1 + "\t num2 = " + num2);
        System.out.println("5.2 с помощью побитовой операции ^");
        System.out.println("num1 = " + num1 + "\t num2 = " + num2);
        num1 = num1 ^ num2;
        num2 = num2 ^ num1;
        num1 = num1 ^ num2;
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
        byte number = 123;
        byte numberOnes = (byte) (number % 10);
        byte numberTens = (byte) ((number / 10) % 10);
        byte numberHundreds = (byte) ((number / 100) % 10);
        System.out.println("Число N содержит:");
        System.out.println(numberHundreds + " сотен");
        System.out.println(numberTens + " десятков");
        System.out.println(numberOnes + " единиц\n");

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
        numberOnes = (byte) (originalNum % 10);
        numberTens = (byte) ((originalNum / 10) % 10);
        numberHundreds = (byte) ((originalNum / 100) % 10);
        byte digetSum = (byte) (numberOnes + numberTens + numberHundreds);
        byte digetProd = (byte) (numberOnes * numberTens * numberHundreds);
        System.out.println("сумма цифр числа " + originalNum + " = " + digetSum);
        System.out.println("произведение цифр числа " + originalNum + " = " + digetProd + '\n');

        System.out.println("10. Преобразование секунд");
        int seconds = 86399;
        byte hours = (byte) (seconds / 3600);
        seconds -= hours * 3600;
        byte minutes = (byte) (seconds / 60);
        seconds -= minutes * 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);

    }
}
