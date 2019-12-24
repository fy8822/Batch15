package dec07;

public class WakeUpTask1_NamePrinter {
    public static void main(String[] args) {

//        String myName = "Istanbul";
//        for(int x = 0; x <= myName.length()-1; x++) {
//            if( x == myName.length()-1) {
//                System.out.println(myName.charAt(x));
//            } else {
//                System.out.print(myName.charAt(x) + "->");
//            }

//            String name = "Turkiye";
//            int lastCharIndex = name.length() - 1;
//
//            System.out.println("GETTING 2 CHARACTER ");
//            for (int y = 0; y <= lastCharIndex - 1; y++) {
//                System.out.println(name.substring(y, y + 2));
//            }
//
//            System.out.println("GETTING 3 CHARACTER ");
//            for (int y = 0; y <= lastCharIndex - 2; y++) {
//
//                System.out.println(name.substring(y, y + 3));
//
//            }


        //               012345678901234567890(21 Character)
        String myName = "My name is Gulsum Kir";
        System.out.println(myName);

        int charCount = myName.length();
        System.out.println("Char Count :" + charCount);

        int lastCharIndex = charCount - 1;
        System.out.println("Last Char Index :" + lastCharIndex);

        for (int x = 0; x < charCount - 2; x++) {
            System.out.println(myName.substring(x, x + 1) + "-> ");
        }

        for (int x = 0; x <= lastCharIndex; x++) {
            System.out.print(myName.substring(x, x + 1) + "-> ");


        }
    }
}
