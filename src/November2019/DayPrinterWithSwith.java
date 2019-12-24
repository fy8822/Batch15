package November2019;

import java.util.Scanner;

public class DayPrinterWithSwith {
    public static void main(String[] args) {

        /*
        *  Scanner scanner = new Scanner(System.in);
        int languageCode = scanner.nextInt();
        String language = " ";
        *
        * */

        Scanner keyboardinput = new Scanner(System.in);

        System.out.println("WHAT IS YOUR FAV DAY");
        int yourFavDay = keyboardinput.nextInt();
        System.out.println(" YOU TYPED : " + yourFavDay);
        switch (yourFavDay) {
            case 1 :
                System.out.println("TODAY  IS MONDAY");
                break;

            case 2 :
                System.out.println("TODAY  IS TUESDAY");
                break;

            case 3 :
                System.out.println("TODAY  IS WEDNESDAY");
                break;

            case 4 :
                System.out.println("TODAY  IS THURSDAY");
                break;

            case 5 :
                System.out.println("TODAY  IS FRIDAY");
                break;

            case 6 :
                System.out.println("TODAY  IS SATURDAY");
                break;

            case 7 :
                System.out.println("TODAY  IS SUNDAY");
                break;

            default:
                System.out.println(" UNFORTUNATLY, TODAY IS EVERYDAY ");
        }






    }
}
