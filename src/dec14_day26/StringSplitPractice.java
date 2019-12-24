package dec14_day26;

import java.util.Arrays;

public class StringSplitPractice {
    public static void main(String[] args) {

// ----------- R E P L A C E   ME T H O D ------------------------------------

        String students = "Abbos, Zulyar,Zhibek,Hasan,Muge, Orhan,Susan";

        System.out.println("\n"+ "students = " + students );

        students = students.replace(" ", "");
        students = students.replace("hi", "i");
        System.out.println("\n"+ "students = " + students + "\n");

        String[] namesArrays = students.split(",");

        System.out.println(Arrays.toString(namesArrays));
        System.out.println("length of namesArrays is " + namesArrays.length + "\n");
        int studentCount = namesArrays.length;


        for (int x = 0; x < studentCount; x++) {
            String name = namesArrays[x];                         // Abbos // A-b-b-o-s-
            System.out.print("Spelling " + name + " : \t ");      // for nicer output

            for (int i = 0; i < name.length(); i++) {
                System.out.print(name.charAt(i) + "-");
            }
            System.out.println();
        }

        int [] nums = {11,22,33};

        for (int i = 0; i < nums.length ; i++) {

        }





        // This is how we do it for one String and we are repeating this for all String items in array
//        String name = namesArrays[0] ;  // Abbos // A-b-b-o-s-
//
//        for (int i = 0; i < name.length(); i++) {
//
//            System.out.print( name.charAt(i) + "-" );
//
//        }
//        System.out.println();
//
//
//
//        String name1 = namesArrays[1] ;  // Zulyar
//        for (int i = 0; i < name1.length(); i++) {
//
//            System.out.print( name1.charAt(i) + "-" );
//
//        }
//        System.out.println();
//
//        String name2 = namesArrays[2] ;  //
//        for (int i = 0; i < name2.length(); i++) {
//
//            System.out.print( name2.charAt(i) + "-" );
//
//        }
//        System.out.println();
//


        // first get all the name into String array called namesArray

        // Spell the name of each person in this format
        // exclude space if you get space in names
        // A-b-b-o-s-  .....
        // Z-u-l-y-a-r-  .....


        // Optionally count a from each name and print















    }
}
