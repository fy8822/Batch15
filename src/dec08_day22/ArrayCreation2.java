package dec08_day22;
import java.util.Arrays;
public class ArrayCreation2 {
    public static void main(String[] args) {


        int num;
            num = 10;

        int[] ages;
              ages = new int[]{3, 5, 11, 33, 57, 18};     // if this style choosen;information needs to be within same line!

        int itemCount = ages.length;
        System.out.println("itemCount = " + itemCount);

        System.out.println("ages = " + Arrays.toString(ages));

        for (int x = 0; x < itemCount; x++) {
            System.out.println(ages[x]);
        }




        int[] areaCodes = new int[]{703, 300, 954, 665};

        for (int x = 0; x < areaCodes.length; x++) {
            System.out.print(areaCodes[x] + " ");
        }







        
    }
}
