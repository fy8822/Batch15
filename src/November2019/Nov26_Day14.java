package November2019;

public class Nov26_Day14 {
    public static void main(String[] args) {

        String str = "I like Pumpkin" ;
        //System.out.println(  str.equals("pumpkin")   );
        // contains :
        // it checks whether a string exists in another string'
        // and return true or false result
        System.out.println("Does it contains Pumpkin : ");
        System.out.println(   str.contains("Pumpkin")    );
        // true
        boolean gotPumpkin =  str.contains("Pumpkin") ;
        //shortcut to print variable value in nice format soutv + tab
        System.out.println("gotPumpkin = " + gotPumpkin);

        // startsWith  endsWith
        // check whether a string start with another string
        // check whether a string end with another string
        // and return true or false result

        boolean startedWithI = str.startsWith("I");
        System.out.println("started with I =" + startedWithI);
        boolean endWith = str.endsWith("n");
        System.out.println("ended with n =" + endWith);

        //  PASSWORD VALIDATOR
        // MINIMUM 8 CHAR MAX 16 CHAR
        // IT MUST CONTAINS _ OR $
        // IT MUST NOT CONTAINS SPACE
        // IT MUST START Ab
        // if any of above condition does not match say INVALID PASSWORD
        // else say  GOOD PASSWORD !
        String password = "Ab1234567901";
        // MINIMUM 8 CHAR MAX 16 CHAR
        boolean min8max16 = password.length() >= 8 && password.length() <= 16;
        boolean mustContains_or$ = password.contains("_") || password.contains("$");
        boolean mustNotContainsSpace = !password.contains(" ");
        boolean mustStartsWithAb = password.startsWith("Ab");

        if (min8max16 && mustContains_or$ && mustNotContainsSpace && mustStartsWithAb) {
            System.out.println("VALID PASSWORD");
        } else {
            System.out.println("INVALID PASSOWRD");
        }


        String passwordX="Ab12340$";
        System.out.println("TYPE YOUR PASSWORD");
        boolean length = passwordX.length()>=8 && passwordX.length()<=16;
        boolean containvalue = passwordX.contains("_")&& passwordX.contains("$");
        boolean notcontain=!passwordX.contains(" ");
        boolean startwith=passwordX.startsWith("Ab");

        if (length&&containvalue&&notcontain&&startwith){
            System.out.println("good password");
        }else {
            System.out.println("INVALID xxx");
        }
// EMAIL CHECKER
        String emailChecker = "a_$fatihyazici@gmail.com";
        System.out.println(" Type your email Fatih!");

        boolean emailLength = emailChecker.length() >5 && emailChecker.length() <=30;
        boolean emailContains = emailChecker.contains("_") || emailChecker.contains("&");
        boolean emailNotContains = !emailChecker.contains(" ");
        boolean emailStartsWith = emailChecker.startsWith("a");

        if (emailLength&&emailContains&&emailNotContains&&emailStartsWith){
            System.out.println(" Thanks for creating an Email");
        }else{
            System.out.println(" Noo, it does not look good");
        }

//   email checker if If else If

        String email = "moses@gmail.com";
        if (email.contains(" ")) {
            System.out.println("Invalid");
        }else if (!email.contains("@")){
            System.out.println("Invalid");
        } else if (email.endsWith("gmail.com")){
            System.out.println("Gmail");
        }else if (email.endsWith("yahoo.com")){
            System.out.println("Yahoo Mail");
        }else if (email.endsWith("mail.ru")){
            System.out.println("Russian Email");
        }else {
            System.out.println("Email Not Found");
        }













    }
}
