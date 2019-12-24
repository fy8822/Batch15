package November2019;

public class Nov27_ReplaceMethod {
    public static void main(String[] args) {

        String message1 = " I love Pumpkin, Pumpkin is Delicious";
        message1 = message1.replace("Pumpkin", "Java");
        System.out.println(message1);

        // Happy Thanks Giving to everybody
        // replace space : Happy ThanksGiving to everybody.
        String message2 = " Happy Thanks giving to all";
        message2 = message2.replace("Thanks giving", "Thanksgiving");

        // Print   soutv
        System.out.println("message2 = " + message2 );
        // Print   sout
        System.out.println(message2);

        // removing all the space >> replace space " " with ""
        message2 = message2.replace(" ", "");
        System.out.println(message2);


        String message3 = "        Tomorrow is Off No!.      ";
        // How to Remove < No! >
        System.out.println(message3.replace(" No!", "."));

        System.out.println(message3.stripLeading());











    }
}
