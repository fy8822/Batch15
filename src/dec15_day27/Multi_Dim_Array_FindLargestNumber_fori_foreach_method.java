package dec15_day27;

public class Multi_Dim_Array_FindLargestNumber_fori_foreach_method {
    public static void main(String[] args) {

        int[][] numbers = {{12, 11, 10}, {19, 20, 15}, {100, 90, 89, 788}, {900, 801, 600, 505}};
        //                        0              1              2                    3

        int max = numbers[0][0];

        for (int i = 0; i < numbers.length; i++) {                     // checks each single dimensional array
            for (int j = 0; j < numbers[i].length; j++) {              // check each elemnts in the single dimesional array
                if (max < numbers[i][j]) {                             // compares index 0 of the array with each indexes
                    max = numbers[i][j];                               // assigns the maximum number
                }
            }
        }
        System.out.println(" Max NUmber (fori method)  : " + max);

//-------------------------------------------------  for each method ----------------------------
        int max2 = numbers[0][0];
        for (int[] each1DArray : numbers) {                           // each1DArray represents each single dimensional array in numbers
            for (int eachInt : each1DArray) {
                if (max2 < eachInt) {
                    max2 = eachInt;
                }
            }
        }
        System.out.println(" Max Number (foreach method )  : " + max);


//-----------------------------------------  finding the minimum number ---------------------------------------------
        int min = numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (min > numbers[i][j]) {
                    min = numbers[i][j];
                }
            }

        }

        System.out.println("min number : " + min);
















    }
}
