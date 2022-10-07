public class Jaeger {
    private String modelName = "Bracer Phoenix";
    private String mark = "Mark-5";
    private String origin = "USA";
    private float height = 70.7f;
    private float weight = 2.1f;
    private int speed = 3;
    private int strenght = 8;
    private int armor = 9;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

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
