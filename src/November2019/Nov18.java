package November2019;

import java.util.Scanner;

public class Nov18 {
    public static void main(String[] args) {
/*
        /* VOTING ELIGIBILITY PROGRAM
        create variable called age int
        check age if more than 18 or equal
        if yes > print " ready to vote
        if not > print : wait until you are 18
        */

//        int age = 18;
//        System.out.println( age>18);
//        if (age>=18) {
//            System.out.println(" You are eligible");
//        } else {
//            System.out.println(" Wait until your are 18");
//        }

        /* Program to guess your favorite number
        create variable called myFavoriteNumber as int
        ask user to guess favorite number
        if user guess right pring: BINGO
        if not print > TRY LATER
         */

//        Scanner scaner = new Scanner(System.in);
//        System.out.println("GUESS MY NUMBER");
//        int myfavNumber = scaner.nextInt();
//        if(myfavNumber == 300) {
//            System.out.println("BINGO");
//        } else {
//            System.out.println("YOU ARE NOT WINNER");
//        }


//        int speedlmt = 60;
//        int yourcurrentSpeed = 75;
//        boolean Iamspeeding = yourcurrentSpeed > speedlmt;
//        if ( Iamspeeding) {
//                System.out.println("get pulled over by the police");
//                System.out.println("given ticket by the police");
//                System.out.println("taken away some points on your license");
//                System.out.println("go to court");
//            }else {
//                System.out.println("go shopping !!");
//                System.out.println("Buy IceCream !!");
//                System.out.println("Enjoy your Day !!");
//        }
//        System.out.println(" THE END");
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("what is your speed");
//        int yourspeed = scan.nextInt();
//        System.out.println("what is speed limit?");
//        int speedLimit = scan.nextInt();
//        {
//            if (yourspeed >= speedLimit) ;
//
//            System.out.println("get pulled over by the police");
//            System.out.println("given ticket by the police");
//            System.out.println("taken away some points on your license");
//            System.out.println("go to court");
//        }

        // PSEUDO CODE
        /*************************************
        * GIVE YOUR : CURRENT SPEED, SPEED LIMIT
        * IS CURRENT SPEED MORE THAN 90 -->> JAIL
         *      MORE THAN 65  --->> POINT TAKEN
        *      MORE THAN 80 LESS THAN 90-->> TICKET
        *      MORE THAN 70 LESS THAN 80-->> WARNING
        * IF NOT SPEEDING, KEEP DRIVING.
        * *******************************************/

        Scanner scan = new Scanner(System.in);
        System.out.println(" WHAT IS YOUR SPEED");
        int yourSpeed = scan.nextInt();

        int speedLimit = 65;

        if (yourSpeed < speedLimit    ){
            System.out.println("YOU GOOO! ");
        }else if (yourSpeed > speedLimit){
            System.out.println(" YOU ARE SPEEDING !");
        }else{
            System.out.println("HAVE A GOOD ONE");
        }









    }
}
