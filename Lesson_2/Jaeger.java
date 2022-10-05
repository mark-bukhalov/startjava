public class Jaeger {
    String modelName = "Bracer Phoenix";
    String mark = "Mark-5";
    String origin = "USA";
    float height = 70.7f;
    float weight = 2.1f;
    int speed = 3;
    int strenght = 8;
    int armor = 9;

    boolean drift() {
        System.out.println("Вы пошли в дрифт");
        return true;
    }

    void move() {
        System.out.println("Вы прошли 5 шагов");
    }

    String scanKaiju() {
        return "nothing";
    }

    void useVortexCannon() {
        System.out.println("activated");
    }
}
