package November2019;

import java.util.Scanner;

public class LoginTest_Vers2 {
    public static void main(String[] args) {
//
//        String userName = "aBc123" ;
//
//        boolean userNameCorrect = userName.equals("ABC123");
//        System.out.println(  userNameCorrect );
//
//        boolean  nameCheckIgnoreCase = userName.equalsIgnoreCase("ABC123");
//        System.out.println( nameCheckIgnoreCase );



//        String name = "Emre" ;
//
//        boolean nameequalswithoutCase = name.equalsIgnoreCase("emre");
//        System.out.println(" Does this name has same character without caring about the case");
//        System.out.println(nameequalswithoutCase);
//
//        System.out.println(name.equalsIgnoreCase("eMrE"));



        //  SEASON ***  ignoring Lower & Upper case sensitivity *****
        
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter your Season");
        String season =scan.next();

        if ( season.equalsIgnoreCase("spring")) {
            System.out.println(" Hiking, Biking.......");
        }else if( season.equalsIgnoreCase("summer")) {
            System.out.println(" Water, Travel.......");

        }else if( season.equalsIgnoreCase("fall")) {
            System.out.println(" Water, Travel.......");

        }else if( season.equalsIgnoreCase("winter")) {
            System.out.println(" Water, Travel.......");
        }else{
            System.out.println(" Not Valid Season");
        }

//        int month = 12;
//
//        if (month>12  || month<1){
//            System.out.println(" invalid month");
//
//        }else if (month>=1 && month<=12){
//            System.out.println("winter");
//
//        }else if (month>=2 && month<6){
//            System.out.println("spring");
//
//        }else if (month>5 && month<10){
//            System.out.println("summer");
//
//        }else if (month>9 && month<12){
//            System.out.println("fall");












    }}
