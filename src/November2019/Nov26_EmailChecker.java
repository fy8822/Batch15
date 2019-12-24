package November2019;

public class Nov26_EmailChecker {
    public static void main(String[] args) {

        //        Create a class called EmailChecker with main method:
//        create a variable called email
//        check for below conditions
//        if it does not contain character @  say invalid email
//        if it contain space say invalid email
//        if it endsWith @gmail.com  -->> print gmail
//        if it endsWith @yahoo.com  -->> print yahoo email
//        if it endsWith @mail.ru  -->> print russian email

//        String email = "abc@ gmail.com";
//
//        if (!email.contains("@") || email.contains(" ")) {
//            System.out.println("invalid email - 1");
//
//        } else if (email.endsWith("@gmail.com")) {
//            System.out.println("Google Mail ");
//
//        } else if (email.endsWith("@yahoo.com")) {
//            System.out.println("Yahoo Mail");
//
//        } else if (email.endsWith("@mail.ru")) {
//            System.out.println("Russian mail");
//        }


        String pickEmail = "f!atih@yahoo.com";
        // System.out.println(pickEmail);

        if (pickEmail.contains("!")  || pickEmail.contains("*")) {
            System.out.println("YOU HAVE USED WRONG CHARACTER");

        } else if (pickEmail.endsWith("gmail.com")) {
            System.out.println(" You have created a gmail account");
        } else if (pickEmail.endsWith("yahoo.com")) {
            System.out.println(" You have created a yahoo account");

        }
    }
}

