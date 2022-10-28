package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf myWolf = new Wolf();
        myWolf.setGender("Мужской");
        myWolf.setName("Белый клык");
        myWolf.setWeight(40);
        myWolf.setAge(10);
        myWolf.setAge(5);
        myWolf.setColor("Серый");
        System.out.println("gender = " + myWolf.getGender());
        System.out.println("name = " + myWolf.getName());
        System.out.println("weight = " + myWolf.getWeight());
        System.out.println("age = " + myWolf.getAge());
        System.out.println("color = " + myWolf.getColor());
        myWolf.go();
        myWolf.sit();
        myWolf.run();
        myWolf.howl();
        myWolf.hunt();
    }
}