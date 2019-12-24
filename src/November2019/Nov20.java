package November2019;

import java.util.Scanner;

public class Nov20 {
    public static void main(String[] args) {

        //*****************  A N S W E R ********************

// At the McDonald Drive thru
        System.out.println("Welcome to McDonald , what can I get for you");
        /*
         * 11, Burger
         * 5, French Fry
         * 8, Nuggets
         * 35, Ice Cream
         * */
        String order = "";
        int itemNumber = 35;
        if (itemNumber == 11) {
            System.out.println("You have selected 11");
            order = "Burger";
        } else if (itemNumber == 5) {
            System.out.println("You have selected 5");
            order = "French Fry";
        } else if (itemNumber == 8) {
            System.out.println("You have selected 8");
            order = "Nuggets";
        } else if (itemNumber == 35) {
            System.out.println("You have selected 35");
            System.out.println("YAY!!! YUM!!! ");
            System.out.println("ENJOY!   IF ELSE IF STATEMENT ");
            order = "Ice Cream";
        } else {
            System.out.println("YOU HAVE SELECTED UNKNOWn ITEM NUMBER@!!");
            order = "Unknown";
        }
        System.out.println("Your order is " + order + "\n\n\n");

        // ***  SAME TASK WITH >>>  SWITCH STATEMENT *****

        /*
         * 11, Burger
         * 5, French Fry
         * 8, Nuggets
         * 35, Ice Cream
         * */
        String userorder = "";
        int itemNumberS = 99;
        // what data type of variable I can use her e
        // byte , short , int , char , String
        switch (itemNumberS) {
            case 11:
                System.out.println("You have selected 11");
                userorder = "Burger";
                break;
            case 5:
                System.out.println("You have selected 5");
                userorder = "French Fry";
                break;
            case 8:
                System.out.println("You have selected 8");
                userorder = "Nuggets";
                break;
            case 35:
                System.out.println("You have selected 35");
                System.out.println("YAY!!! YUM!!! ");
                System.out.println("ENJOY!!!! ");
                userorder = "Ice Cream";
                break;
            default:
                System.out.println("YOU HAVE SELECTED Unknown" + "\n ITEM NUMBER@!!" + "\n\n" + "This is a switch statement");
                userorder = "Unknown";
                break;
        }
        System.out.println("Your order is " + order);


// BAKERY MENU *****************************

        // 11-Baguette
        // 12-Bagel
        // 13-Baklava
        // 14-Cannoli
        // 15-Eggette

        Scanner userInput = new Scanner(System.in);
        System.out.println(" Please select your Bread \n# :");
        int userChoise = userInput.nextInt();
        String yorder = "";

        if (userChoise == 11) {
            System.out.println("You have selected Baguette");
            yorder = "11-baguette";
        } else if (userChoise == 12) {
            System.out.println("You have selected Bagel");
            yorder = "12-Bagel";
        } else if (userChoise == 13) {
            System.out.println("You have selected Baguette");
            yorder = "13-Baklava";
        } else if (userChoise == 14) {
            System.out.println("You have selected Baguette");
            yorder = "14-Cannoli";
        } else if (userChoise == 15) {
            System.out.println("You have selected Baguette");
            yorder = "15-Eggette";
        } else {
            System.out.println(" Invalid Selection, Try again.");
        }

        // SAME BAKERY MENU   WITH SWITH STATEMENT ****

        // 11-Baguette
        // 12-Bagel
        // 13-Baklava
        // 14-Cannoli
        // 15-Eggette

        Scanner userInputSW = new Scanner(System.in);
        System.out.println(" THIS IS SWITCH: \nPlease select your Bread \n# :");
        int userChoiseSW = userInputSW.nextInt();

        String yorderSW = "";
        switch (userChoiseSW) {
            case 11:
                System.out.println("You have selected Baguette");
                yorderSW = "11-Baguette";
                break;
            case 12:
                System.out.println("You have selected Bagel");
                yorderSW = "12-Bagel";
                break;
            case 13:
                System.out.println("You have selected Baklava");
                yorderSW = "13-Baklava";
                break;
            case 14:
                System.out.println("You have selected Cannoli");
                yorderSW = "14-Cannoli";
                break;
            case 15:
                System.out.println("You have selected Eggette");
                yorderSW = "15-Eggette";
                break; }

//   Season Practise  ******************

        Scanner scan = new Scanner(System.in);
        System.out.println(" What season do you like?");
        String season = scan.next();
        // Fall
        // Summer

        switch (season){
            case "Fall":
            case "fall":
                System.out.println(" Fall is Beatifull");
            case "Summer":
                System.out.println(" Summer is Hot.");
            default:
                System.out.println(" Winter & Autum not listed");

        }



    }
}
