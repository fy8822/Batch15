package dec11_day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot2 {
    public static void main(String[] args) {

        //int[] nums = {13,31,8,5,21,2} ;

        // CREATE A VARIABLE CALLED isSortedAlready and assign value of true ;
        // I ASSUME THE ARRAY IS ALREADY SORTED
        // AND IF IT'S NOT THEN I CHANGE the value of isSortedAlready to FALSE
        //boolean isSortedAlready = true;



//        int[] nums = {1, 7, 3, 8, 5, 9};
//        System.out.println("num s = " + Arrays.toString(nums));
//
//
//        for (int x = 0; x < nums.length-1; x++) {
//            //System.out.println(nums[x] + "......... " + nums[x+1]);
//            // pick first item & compare with next followed item, repeat till end.
//
//            // print if item1 is less than item 2
//           System.out.println(" is " + nums[x] + " less than  " + nums[x + 1] + " ? " + (nums[x] < nums[x + 1]));
//
//
//            if (!(nums[x] < nums[x + 1])) {
//                System.out.println("ARRAY IS NOT SORTED , NO POINT CHECKING THE REST");
//                //isSortedAlready = false;
//                break;
//            }
//        }

        //System.out.println("isSortedAlready = " + isSortedAlready);






// .......... My Exercises ........................................................

        int[] numex = { 101, 303, 209, 505, 777, 666, 543};
        System.out.println(" NUMEX NUMBERS :" + Arrays.toString(numex));

        for (int i = 0; i < numex.length-1; i++){
           // System.out.println( numex[i] + "" + numex[i+1]);

            if ( numex[i] < numex[i+1]){

            }System.out.println("ARRAY IS NOT SORTED");
            break;

        }

















































































    }
}
