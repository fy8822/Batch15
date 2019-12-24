package dec03;

import java.util.Scanner;

public class SpeedUp_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter START & END Speed: ");
        int start = scan.nextInt();  // 15 ;
        int end = scan.nextInt();  // 29 ;


        if (start < end) {
            System.out.println("INCREASING THE SPEED ");
            // i will increase the speed till i reach ending speed
            for (int i = start; i <= end; i++) {
                System.out.print(i + ",");
            }
        } else if (start > end) {
            System.out.println("DECREASING THE SPEED ");
            // i will decrease the speed till i reach ending speed
            for (int x = start; x >= end; x--) {
                System.out.print(x + ",");
            }

        } else {
            System.out.println("NO ACTION NEEDED!!! SAME SPEED!!!!");
        }

    }
}
