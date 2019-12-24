package November2019;

import java.util.Scanner;

public class Nov13 {
    public static void main(String[] args) {

        String todaysTopic = " Arithmetic Operator And Scanner ,  class duration is 3 hours";
        System.out.println("Topic and duration : \n " + todaysTopic);

       String productName = "Alexa";
       String  model = "Fire-HD";

       int Type1 = 12;
       byte price = 3;

        System.out.println(5 / 3);
        System.out.println(5 / 3.00000001f);

//

        // store above numbers in variables
        // and replace above statements with variables instead
        // dataType ressult1 = the calculation here
        //System.out.println(ressult1) ;
        // store above numbers in variables
        // and replace above statements with variables instead
        // dataType ressult1 = the calculation here
        //System.out.println(ressult1) ;
        int num1 = 5 ;
        double num2 = 3.0d ;
        float num3 = 3.0f ;
        double result1 = num1 + num2;
        double result2 = num1 - num2;
        double result3 = num1 * num2;
        double result4 = num1 / num2;
        float result5 =  num1 / num3;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

// -----------------------------------------
        // Converting Tempratures

        double fahrenheit = 28;
        double celsius ;

        celsius = (5.0 / 9) * (fahrenheit -32) ;

        System.out.println(fahrenheit + "F equals to " + celsius + "C.");


//----------------------------
        Scanner scan = new Scanner(System.in);

        // ask user to enter name
        System.out.println("Enter your first name please : ");

        // capture what user typed on keyboard in console
        String firstName =  scan.next();

        // print the result of what we saved from user input
        System.out.println("You have entered : " + firstName);








    }
}
