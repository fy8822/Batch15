package November2019;

import java.util.Scanner;

public class Nov14 {
    public static void main(String[] args) {

        // 8 Primitives
        /*
        whole numbers      : byte, short, int, long
        fractional numbers : float, double
        logical            :  boolean (true, false)
        character          : char - single char w/ singe quotes
        String              : text
         */

        // Age calculator
        int birthYear = 1971;
        int currentYear = 2019;
        int age = currentYear - birthYear;
        System.out.println("I was born in year 1971, and I am 48 years old");
        System.out.println(" I was born in year  " + birthYear + "  and I am 48 ..." );
        System.out.println(" I was born in year  " + birthYear + "  and I am  " + ( currentYear - birthYear) );
        System.out.println( "I was born in year  " + birthYear + "  and I am " + age);
// SPEEDING
        int speedLimit = 65;
        int currentSpeed = 75;
        int overSpeed = 10;
        int overSpeedNbr = currentSpeed - speedLimit;
        System.out.println("I am going over speed limit " + overSpeedNbr);
// Scanner Example
        // ask  name?
        // capture answer!
        //print: your name is:
               // ask birth year
               // capture: birth year
               //print age
        // ask height
        // capture: height
        // print: height
      //  Scanner scan = new Scanner(System.in);
        //Getting single word as String                —> scan.next() ;
        //Getting single number as int                  —> scan.nextInt() ;
        //Getting single fractional number as double    —> scan.nextDouble() ;
        //Getting single fractional number as float     —> scan.nextFloat() ;
        //Getting single true or false as boolean       —> scan.nextBoolean() ;
/*
        System.out.println("Your name?");
        String yourName = scan.next();
        System.out.println(" Your name is: " + yourName);


        System.out.println("what is your Birth Year?");
       int currentYr = 2019;
       int yourBirthYear = scan.nextInt();
       int hisAgeIs = currentYear-yourBirthYear;
       System.out.println("Your age is :  " + hisAgeIs);

       System.out.println("Your height?");
       float yourFloat = scan.nextFloat();
       System.out.println("Your height is:  " + yourFloat);
 */
        // TEMPRATURE ------------
        System.out.println(" TEMPRATURE");
                float temperature;
             //   Scanner in = new Scanner(System.in);
/*
                System.out.println("Enter temperature in Fahrenheit");
                temperature = in.nextInt();
                temperature = ((temperature - 32)*5)/9;
                System.out.println("temperature in Celsius = " + temperature);
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the temperature in F ? ");
        double fahrenheit = scan.nextDouble();
        double celsius =   (5.0 / 9) * (fahrenheit - 32);
        // fahrenheit  80 is  23 in celsius
        System.out.println( "fahrenheit " + fahrenheit + " is " + celsius + " in celsius");
    }
}
