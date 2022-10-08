public class GuessNumber {
    private int pcNum;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        GenerateNewNumber();
    }

    public void GenerateNewNumber() {
        pcNum = (int) (1 + Math.random() * 101);
    }

    private boolean CheckPlayer(Player player) {
        if (player.getNumber() == pcNum) {
            System.out.printf("Игрок %s победил!", player.getName());
            return true;
        } else {
            if (player.getNumber() > pcNum) {
                System.out.printf("Число %d больше того, что загадал компьютер", player.getNumber());
            } else {
                System.out.printf("Число %d меньше того, что загадал компьютер", player.getNumber());
            }
            return false;
        }
    }

    public boolean CheckPlayer1() {
        return CheckPlayer(player1);
    }

    public boolean CheckPlayer2() {
        return CheckPlayer(player2);
    }
}
