public class MyFirstGame {
    public static void main(String[] args) {
        int numberPc = 60;
        int numberUser = 99;
        int step = 10;
        boolean isWinner = false;

        while (isWinner != true) {
            if (numberUser > numberPc) {
                System.out.println("число " + numberUser + " больше того, что загадал компьютер");
                numberUser = numberUser - step;
            } else if (numberUser < numberPc) {
                System.out.println("число " + numberUser + " меньше того, что загадал компьютер");
                numberUser = numberUser + step;
            } else {
                System.out.println("Вы победили!");
                isWinner = true;
            }
            if (step > 1) {
                step--;
            }
            ;
        }
    }
}

