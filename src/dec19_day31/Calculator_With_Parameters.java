package dec19_day31;

public class Calculator_With_Parameters {

    public static void main(String[] args) {

                           // add static method accepts 2 numbers
                          // add static method accepts 3 numbers
                          // It will print all. It will act like a loop.
        add (1, 2);
        add (3, 4);
        add (5, 6);

        add3Numbers (10, 10, 11);
        add3Numbers (20, 20, 21);

    }
    public static void add(int num1, int num2) {
        System.out.println("addition result " + (num1 + num2));
    }

    public static void add3Numbers(int num1, int num2, int num3) {
        System.out.println("add 3 numbers result " + (num1 + num2 + num3));

        //System.out.println(num1);




    }
}
