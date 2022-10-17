package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger strikerEureka = new Jaeger();
        strikerEureka.setModelName("Striker Eureka");
        strikerEureka.setMark("Mark-5");
        strikerEureka.setOrigin("Australia");
        strikerEureka.setSpeed(70);
        System.out.printf("Информация о %s%n", strikerEureka.getModelName());
        System.out.printf("Mark : %s%nOrigin: %s%nSpeed: %d",
                strikerEureka.getMark(), strikerEureka.getOrigin(), strikerEureka.getSpeed());
        strikerEureka.drift();
        System.out.printf("%nИзменим скорость");
        strikerEureka.setSpeed(90);
        System.out.printf("%nИнформация о %s%n", strikerEureka.getModelName());
        System.out.printf("Mark : %s%nOrigin: %s%nSpeed: %d",
                strikerEureka.getMark(), strikerEureka.getOrigin(), strikerEureka.getSpeed());

        Jaeger brawlerYukon = new Jaeger("Brawler Yukon", "Mark-1",
                "United States of America", 60);
        System.out.printf("%n%nИнформация о %s%n", brawlerYukon.getModelName());
        System.out.printf("Mark : %s%nOrigin: %s%nSpeed: %d",
                brawlerYukon.getMark(), brawlerYukon.getOrigin(), brawlerYukon.getSpeed());
        brawlerYukon.drift();

        System.out.println();
        if (strikerEureka.getSpeed() > brawlerYukon.getSpeed()) {
            System.out.printf("%s быстрее чем %s", strikerEureka.getModelName(), brawlerYukon.getModelName());
        } else if (strikerEureka.getSpeed() < brawlerYukon.getSpeed()) {
            System.out.printf("%s медленнее чем %s", strikerEureka.getModelName(), brawlerYukon.getModelName());
        } else {
            System.out.printf("%s и %s имеют равную скорость",
                    strikerEureka.getModelName(), brawlerYukon.getModelName());
        }
    }
}
