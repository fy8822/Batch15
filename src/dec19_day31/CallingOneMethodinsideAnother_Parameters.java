package dec19_day31;

public class CallingOneMethodinsideAnother_Parameters {

    public static void main(String[] args) {

        finallyAwake();
        drinkCoffee();

    }
    public static void finallyAwake() {

        wakeUp();
        drinkCoffee();
    }

    public static void wakeUp() {
        System.out.println("Alarm goes off");
        System.out.println("Wake Up 6:00 a.m.");
        System.out.println("Wash Face");
        System.out.println("-----------------");
    }

    public static void drinkCoffee() {
        System.out.println("Grind Coffee");
        System.out.println("Make Coffee");
        System.out.println("-----------------");


    }
}
