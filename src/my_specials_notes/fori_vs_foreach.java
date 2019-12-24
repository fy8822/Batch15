package my_specials_notes;

public class fori_vs_foreach {
    public static void main(String[] args) {

        String[] cars = {"opel", "GTI", "TESLA"};

        for ( String carsinforeach : cars) {         // foreach method
            System.out.println(carsinforeach);
        }

        for (int i = 0; i < cars.length; i++) {      // fori method
            System.out.println(cars[i]);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

    }
}
