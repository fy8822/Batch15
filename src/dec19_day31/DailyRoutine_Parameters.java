package dec19_day31;

public class DailyRoutine_Parameters {
    public static void main(String[] args) {

                 drinkCoffee();
        wakeUp();
        prepareKidsForSchool();
        takeThemToSchool();
        studyJava();
        sayILoveJava300Times();
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

    public static void prepareKidsForSchool() {

        System.out.println("Kiss Kids");
        System.out.println("Wake up Kids");
        System.out.println("Breakfast for Kids");
        System.out.println("Eat with Kids");
        System.out.println("-----------------");

    }

    public static void takeThemToSchool() {

        System.out.println("Take Kids to Bus");
        System.out.println("Say By-By");
        System.out.println("-----------------");
    }

    public static void studyJava() {

        System.out.println("Think about java waking up ");
        System.out.println("Think about java drinking Coffee ");
        System.out.println("Think about java preparing Kids ForSchool ");
        System.out.println("Think about java taking Them To School ");
        System.out.println("Eventually sit down and study java , practice practice!!!");
        System.out.println("Review Last classes , come ready for the class");
        System.out.println("-----------------");

    }

    public static void sayILoveJava300Times() {

        for (int i = 1; i <= 300; i++) {
            System.out.print("I Love Java | ");
        }
        System.out.println();
    }


        /*
         * wakeUp
         * drinkCoffee
         * prepareKidsForSchool
         * takeThemToSchool
         * goToWork
         * groceryShopping
         * cooking
         * studyJava
         * goToSleep
         * */

}