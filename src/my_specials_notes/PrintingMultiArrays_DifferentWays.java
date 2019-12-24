package my_specials_notes;

import javax.crypto.spec.PSource;

public class PrintingMultiArrays_DifferentWays {
    public static void main(String[] args) {


//----------------------------------------------PRINTING SINGLE LINE - NO BRACKETS --------------------------
        int[][] nums2 = {
                            {11, 21, 31},
                            {61, 71, 81, 91}
                        };

        for (int i = 0; i < nums2.length;      i++)
        for (int j = 0; j < nums2[i].length;   j++)
           System.out.print (nums2[i][j] + " "    );

        System.out.println();
        System.out.println(nums2.length);         // printing qty o arryas
        System.out.println("");                          // Printing emty line

//---------------------------------------------PRINTING ROWS & COLUMS -----------------------------------
        int[][] nums3 = {
                          {1, 2, 3},
                          {4, 5, 6, 7}
                        };

        for (int i = 0; i < nums3.length; i++)        {
        for (int j = 0; j < nums3[i].length; j++)     {
            System.out.print(nums3[i][j] + " ");
        }
            System.out.println("");
        }
            System.out.println();
// -----------------------------PRINTING SINGLE LINE  VS ARRAYS LIKE A TABLE ------------------

        int[][] nums4 = {
                             {1, 2, 3},
                             {4, 5, 6},
                             {7, 8, 9, 0},
                             {7, 8, 9, 0},
                             {7, 8, 9, 0},
                        };

        for (int i = 0; i < nums4.length;     i++)
            for (int j = 0; j < nums4[i].length;  j++)
                System.out.print( nums4[i][j] +" ");
            System.out.println("");


        System.out.println();


        for (int i = 0; i < nums4.length;     i++) {
        for (int j = 0; j < nums4[i].length;  j++) {
            System.out.print( nums4[i][j] +" ");
        }
            System.out.println("");

        }
        System.out.println();

// -----------------------pulling and printing all elements within multi array---------------------

        int[][] arr2D = {{10, 20, 30}, {40, 50, 60, 70, 80, 90, 100}};
        //                    0                  1

        for (int[] each1DArray : arr2D) {
            for (int eachElement   : each1DArray)
            {
                System.out.print(eachElement + " ");
            }
        }
        System.out.println();
        System.out.println();
// --------------------------------------------------------------Tatbikat------------------
        int[][] arr2Dxxx = {{11, 22, 33}, {44, 55, 66, 77}};
        for ( int[] each1D : arr2Dxxx){
        for( int elementsin1D : each1D )
        {
            System.out.print(elementsin1D + " ");
        }
    }
        System.out.println();





















    }
}
