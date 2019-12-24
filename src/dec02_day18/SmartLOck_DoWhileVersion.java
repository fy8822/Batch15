package dec02_day18;

import java.util.Scanner;

public class SmartLOck_DoWhileVersion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String passcode;
        do { System.out.println("Enter Passcode: ");
             passcode = input.next();
        }while ( !passcode.equals("101010"));
        System.out.println("Please come in");



    }
}
