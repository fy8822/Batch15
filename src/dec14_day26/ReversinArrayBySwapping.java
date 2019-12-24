package dec14_day26;

import java.util.Arrays;

public class ReversinArrayBySwapping {
    public static void main(String[] args) {

        int[] myNumbers1 = new int[]{5, 3, 21, 13, 55, 66, 44};
        int size1 = myNumbers1.length;
        int lastIndex1 = size1 - 1;
        int middleIndex1 = size1 / 2; // 3

        System.out.println(myNumbers1[0] + " --- " + myNumbers1[lastIndex1 - 0]);
        System.out.println(myNumbers1[1] + " --- " + myNumbers1[lastIndex1 - 1]);
        System.out.println(myNumbers1[2] + " --- " + myNumbers1[lastIndex1 - 2]);
        System.out.println("myNumbers1 : " + Arrays.toString(myNumbers1));


        System.out.println("------ loop here ---------");





        int[] myNumbers = new int[]{5, 3, 21, 13, 55, 66, 44};
        int lengthOfmyNumbers = myNumbers.length;
        int lastIndex = lengthOfmyNumbers - 1;
        int middleIndex = lengthOfmyNumbers / 2; // 3


        for (int x = 0; x < middleIndex; x++) {

            System.out.println(myNumbers[x] + " --- " + myNumbers[lastIndex - x]);

            int temp = myNumbers[x];

            myNumbers[x] = myNumbers[lastIndex - x];

            myNumbers[lastIndex - x] = temp;



        }
        System.out.println("After swap complete " + Arrays.toString(myNumbers));







    }
}
