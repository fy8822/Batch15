package dec02_day18;

import java.util.Scanner;

public class SmartLockOpener {
    public static void main(String[] args) {
        // Smart door has password
        // correct password is B15
        // ask user the pasowrd

        Scanner input = new Scanner(System.in);
        System.out.println("Knock - Knock");
        System.out.println("Enter the Passcode");

        String password = input.next();

        while (! password.equals("B15")){
            System.out.println(" Wrong password, try again");
            password = input.next();           // asking again within the loop is very important
        }

            System.out.println(" Welcome, please come in");








    }
}
