package November2019;

import java.util.Scanner;

public class Nov27_NameChecker {
    public static void main(String[] args) {

        /*  check name length
        *   if so print short name
        *   if it is within 4-11
        *   if so print medium name
        *   if its more than 11
        *    print longer name
        * ----------------------
        *   check if the name has character a or e
        *   if so -- name contains a  or e
        *   if not -- i dont have both a or e in my name
        * */

        Scanner input = new Scanner((System.in));
        System.out.println(" Hey! What is your name ?");
        String name1 = input.next();
        int lengthOfName1 = name1.length();


        if (lengthOfName1 <=5){
            System.out.println("Your name is short length");
        }if (lengthOfName1 >= 9){
            System.out.println("Your name is medium length");
        }if (lengthOfName1 >= 11){
            System.out.println("Your name is long length");
        }

        System.out.println("Uppercase version of Name1 is: ");
        System.out.println("Length of name1 is : " + lengthOfName1);
       // String makeUpperName1 = name1.toUpperCase();  // making the Upper Case of the name
        //String makeLowerName1 = name1.toLowerCase();  // // making the Lower Case of the name
        System.out.println(name1.toUpperCase().contains("KA"));  // this method combines the both action
        System.out.println(name1.toLowerCase().contains("ka"));   // this method combines the both action




//        System.out.println(" ENTER YOUR NAME :");
//        String mybabeName = input.next();
//        int lengthOfbabeName= mybabeName.length();
//        System.out.println("Length of name is : " + lengthOfbabeName);
//
//        if(lengthOfbabeName <4)
//        { System.out.println("Short Name :");
//        }else if (lengthOfbabeName <=11){
//            System.out.println("Medium name :");
//        }else {
//            System.out.println("Longer name");
//        }

    // true || false  >>> true






}}
