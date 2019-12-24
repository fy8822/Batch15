package dec10_day24;

import java.util.Arrays;

public class ArrayMethodSorting {
    public static void main(String[] args) {

//        int[] scores = {99, 44, 66, 23, 19, 55};                               // items in Array
//        System.out.println(Arrays.toString(scores));
//        System.out.println("original first item value :   " + scores[0]);
//
//        Arrays.sort(scores);                                                     // !!! if Arrays sorted, original order changed permanently.
//        System.out.println(Arrays.toString(scores));
//        System.out.println("After Sorting > new first item value :   " + scores[0]);
//
//        System.out.println("---------- character sorting ------------");         // low>high order for character() is decided by it's ascii table value
//                                                                                 // special characters comes first , number , uppercase then lowercase
        char[] nameChars = {'G', ' ', 'd', 'Z', '9', 'A'};
        System.out.println("before sorting nameChars = " + Arrays.toString(nameChars));
        Arrays.sort(nameChars);
        System.out.println("after sorting nameChars = " + Arrays.toString(nameChars));

        System.out.println("---------- String sorting ------------");
                                                                                // ONLY FIRST CHARACTER of String  MATTER WHEN SORTING
        String[] superHeros = {"Superman", "Batman", "Wonder Woman", "Aquaman", "Cyborg", "Flash", "100", "9", "09"};
        System.out.println("before sorting superHeros = " + Arrays.toString(superHeros));
        Arrays.sort(superHeros);
        System.out.println("after sorting superHeros = " + Arrays.toString(superHeros));

        System.out.println("---------- boolean sorting -----SORT METHOD DOES NOT WORK FOR BOOLEAN ARRAY-------");
        boolean[] fiveSwitchOnOffs = {true, false, false, true, true};
        System.out.println("fiveSwitchOnOffs = " + Arrays.toString(fiveSwitchOnOffs));

        //Arrays.sort(fiveSwitchOnOffs); DOES NOT WORK FOR BOOLEAN ARRAY !!

        // Arrays.sort(arrObject) does not return a value that we can store
        // it only takes action to reshuffle the index of original array object to keep it in sorted order






















    }
}
