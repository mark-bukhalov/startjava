package com.startjava.lesson_2_3.robot;
public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private int speed;

    public Jaeger() {

    }

    public Jaeger(String modelName, String mark, String origin, int speed) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.speed = speed;
    }

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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    boolean drift() {
        System.out.println("\nВы пошли в дрифт");
        return true;
    }

    void move() {
        System.out.println("\nВы прошли 5 шагов");
    }

    String scanKaiju() {
        return "\nnothing";
    }

    void useVortexCannon() {
        System.out.println("\nactivated");
    }
}
