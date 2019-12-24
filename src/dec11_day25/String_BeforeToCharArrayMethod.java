package dec11_day25;

import java.util.Arrays;
// VIDEO  01:07

public class String_BeforeToCharArrayMethod {
    public static void main(String[] args) {

 // ------------------------------------ SIMPLE METHOD >  CHAR TO ARRAYS --------------------
        String name = "Anna";
        char[] namesChars = new char[4];

        namesChars[0] = name.charAt(0);
        namesChars[1] = name.charAt(1);
        namesChars[2] = name.charAt(2);
        namesChars[3] = name.charAt(3);

        System.out.println(" Name Chars = " + Arrays.toString(namesChars));

// ------------------------------------------------------with Fori Method------------------------------

        String name2 = "David";

        char[] namesChars2 = new char[5];

        for (int x = 0; x < namesChars2.length; x++) {
            namesChars2[x] = name2.charAt(x);
        }
        System.out.println("namesChars 2 = " + Arrays.toString(namesChars2));

// -----------------------------------------------------.toCharArray Method--------------

        String name3 = "Dennis";

        char[] namesChars3 = name3.toCharArray();
        System.out.println("namesChars3 = " + Arrays.toString(namesChars3));


// -------------------------------------------------------------------------------


    }
}
