package dec16_day28;

import java.util.Arrays;

public class ExcelVisualizer2 {

    public static void main(String[] args) {

        int[][] myExcel = {
                {10, 27, 88, 99},
                {87, 100},
                {90, 45, 65}
        };
        // what does deepToString method do :
        // it takes an multiD array and turn it into a String with all items
        // what external data do we provide
        // the multiD array object or the multiD array variable
        // what do i get out of it
        //  --->> String representation of multiD array object

        System.out.println(Arrays.deepToString(myExcel));  // .deepToString used only to see whats inside.

        System.out.println();


        for (int[] eachRow : myExcel)  {
        for (int  eachCell : eachRow)     {

                System.out.print(eachCell + " ");
            }
            System.out.println();
        }


















    }
}
