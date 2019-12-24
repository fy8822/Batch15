package dec15_day27;

import java.util.Arrays;

public class Multi_Dimensional_Arrays {
    public static void main(String[] args) {

         /*
                    int[] arr     = {1, 2, 3};                     Single dimensional array
                    int[][] arr2D = { {1,2,3 } , {4, 5, 6 } }       Multi-dimensional array: an Array that can contain array(s)
                                                                    N dimesional Array MUST contains (N-1) demesional arrays
                                                                    ex: 2 dimesional array: conatins 1 dimesional arrays
     */
     // -----------------------------------------------------------------------------------------
        int[] arr1D = {1, 2, 3};
        System.out.println(Arrays.toString(arr1D));

        //                0  1  2    0   1   2
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}};
        //                   0          1

        System.out.println(arr2D.length);
        System.out.println();
        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println();
        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println();

        System.out.println(arr2D[1][1]);

        // Arrays.deepToString(multi-D Arrays):
        System.out.println(" deep:  " + Arrays.deepToString(arr2D));
        System.out.println();

//-----------------------------------------------------------------------------
            int[][] nums2 = {
                                {11, 21, 31},
                                {61, 71, 81},
                                {22, 33, 44},
                            };

        for (int i = 0; i < nums2.length;    i++) {
            for (int j = 0; j < nums2[i].length; j++) {
                System.out.print(nums2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


        //System.out.println(nums2.length);  // printing qty o arrays

//------------------------- TATBIKAT ---------------------------

        int [][] www = {{9,8,7,}, {6,5,4,3} };

        System.out.println(Arrays.toString(www[0]));
        System.out.println(" www 0 1 : " + www[0][1]);




        //-------------------- interntte buldugum bir yontem
        for (int[] mmm : www) {
            if (mmm != null)
                for (int kkk : mmm)
                    System.out.print(kkk + " ");

            System.out.println();
        }
























    }
}
