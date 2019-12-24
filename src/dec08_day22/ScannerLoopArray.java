package dec08_day22;

import java.util.Scanner;

public class ScannerLoopArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[10];                                // creating int array with capacity 10
        for (int x = 0; x < numbers.length; x++) {                  // and assigning it to numbers variable
            System.out.println("Enter your number " + (x + 1 ));
            numbers[x] = scan.nextInt();                           // filling up the array value with scanner
        }
//        for (int x = 0; x < numbers.length; x++) {
//            System.out.print(numbers[x] + " ");                    // printing out what's inside the array
//        }






    }
}
