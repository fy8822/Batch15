package November2019;

public class Nov26_Password_Validator {
    public static void main(String[] args) {

//        //  PASSWORD VALIDATOR
//
//        // MINIMUM 8 CHAR MAX 16 CHAR
//        // IT MUST CONTAINS _ OR $
//        // IT MUST NOT CONTAINS SPACE
//        // IT MUST START Ab
//
//        // if any of above condition does not match say INVALID PASSWORD
//        // else say  GOOD PASSWORD !
//        String password = "Ab_12321$12csa";
//        // MINIMUM 8 CHAR MAX 16 CHAR
//        boolean min8max16 = password.length() >= 8 && password.length() <= 16;
//
//        // IT MUST CONTAINS _ OR $
//        boolean mustContains_or$ = password.contains("_") || password.contains("$");
//        //
//
//        // IT MUST NOT CONTAINS SPACE
//        boolean mustNotContainsSpace = !password.contains(" ");
//        //
//
//        // IT MUST START Ab
//        boolean mustStartsWithAb = password.startsWith("Ab");
//        //
//
//        if (min8max16 && mustContains_or$ && mustNotContainsSpace && mustStartsWithAb) {
//            System.out.println("VALID PASSWORD");
//        } else {
//            System.out.println("INVALID PASSWORD");


        String myPassword = "Fat1h@Cyber";

        boolean lengthOfPass13 = myPassword.length() <= 13;
        boolean mustStart = !myPassword.startsWith("%") && myPassword.startsWith("%");
        boolean mustNotContain = myPassword.contains(" ");
        boolean mustNotContain2 = !myPassword.contains(" ");
        if (lengthOfPass13 && mustStart && mustNotContain && mustNotContain2){
        System.out.println(" good password");}else{
            System.out.println(" TRY AGAIN");
        }



            //(" You have created good password");

        }

    }


