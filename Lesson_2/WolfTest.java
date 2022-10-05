public class WolfTest {
    public static void main(String[] args) {
        Wolf myWolf = new Wolf();
        myWolf.gender = "Мужской";
        myWolf.name = "Белый клык";
        myWolf.weight = 40;
        myWolf.age = 3;
        myWolf.color = "Серый";
        System.out.println("gender = " + myWolf.gender);
        System.out.println("name = " + myWolf.name);
        System.out.println("weight = " + myWolf.weight);
        System.out.println("age = " + myWolf.age);
        System.out.println("color = " + myWolf.color);
        myWolf.go();
        myWolf.sit();
        myWolf.run();
        myWolf.howl();
        myWolf.hunt();
    }
}