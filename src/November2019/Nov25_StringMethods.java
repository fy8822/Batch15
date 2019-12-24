package November2019;
public class Nov25_StringMethods {
    public static void main(String[] args) {

        // String is immutable. it is permanent
        // to change the string use this  name = name.toUpperCase(); method
        //string actions that we know as of today

        String s1 = "Hello";

        System.out.println(s1.equals("abc"));
         System.out.println(s1.equalsIgnoreCase("HELLO") + "\n");

         System.out.println(s1);
        System.out.println(s1.toUpperCase());
         System.out.println(s1.toLowerCase()+ "\n");

         String sss2 = "FatihYazici";
        System.out.println(sss2.endsWith("FaithYazici")+ "\n");
        System.out.println(sss2.equalsIgnoreCase("FATIHyAZICi")+ "\n");
//
//    // we can use length method to count string chacter
//
//        System.out.println(  s1.length() + "\n");
//
//        int lengthOfStr =  s1.length();  // we use int because variable that we are seeking is int!
//
//        if (lengthOfStr > 4){
//            System.out.println("More than 4 character");
//        }else{
//            System.out.println("less than 4 character");
        //******************************************************************
            String exStr1 = "Today is Tuesday";
            System.out.println(exStr1);
            int lenghthOfexStr1 = exStr1.length();
            System.out.println(lenghthOfexStr1);

            String test123 = "Gulsum is going to scholl";
        System.out.println(test123);
        int lengthOftest123 = test123.length();
        System.out.println(lengthOftest123 + "\n");

        String test1234 = "This is going to be good InshaAllah";
        System.out.println(test1234);
        int lengthOftest1234 = test1234.length();
        System.out.println(lengthOftest1234+ "\n");


        //   M O R E    P R A C T I S E S * * * * * * *

        String name = "Gulsum_to_Upper_Case";
        System.out.println( name);
        name = "Gulsum Kir";               // <<<<  ReAssigning a value ! Over writes
        name.toUpperCase();             // Not strong method
        System.out.println(name);
        System.out.println( name.toUpperCase());  // Temporary Changing the Var

        name = name.toUpperCase();    // <<< this is how you Change the Original name var
        System.out.println( name+ "\n");

        String makingUpperCase = "Fatih_Yazici";
        System.out.println(makingUpperCase);
        makingUpperCase = "Victor_Yazici";
        makingUpperCase.toUpperCase();
        System.out.println(makingUpperCase+ "\n");
        makingUpperCase = makingUpperCase.toUpperCase();
        System.out.println(makingUpperCase+ "\n");

        String companyName = "Jet_Paper";
        System.out.println(companyName);
        companyName.toUpperCase();
        System.out.println(companyName);
        companyName = companyName.toUpperCase();
        System.out.println(companyName);
        System.out.println(companyName.equalsIgnoreCase("JET_PAPER"));


////  more ..............................................

        String momName = "Neriman";
        System.out.println(   momName.startsWith("Ne"));
        System.out.println( momName.startsWith("ne"));
        System.out.println( momName.startsWith("Fe"));

        System.out.println( momName.endsWith("k")+ "\n");

        String babesName = "Gulsum";
        System.out.println(babesName);
        System.out.println(babesName.startsWith("G"));
        System.out.println(babesName.startsWith("K"));
        System.out.println(babesName.endsWith("m"));
        System.out.println(babesName.endsWith("M"));







    }
}
