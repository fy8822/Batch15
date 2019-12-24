package dec14_day26;

public class SwappingValue {
    public static void main(String[] args) {

//--------------------------------------------------------------------------
        String name1 = "Emma";
        String name2 = "Jason";

        String tempContainer = name1;
        name1 = name2;
        name2 = tempContainer;

        System.out.println( "Name 1 : " +name1+ "\n" + "Name 2 : " +name2 );

//--------------------------------------------------------------------------
        int[] numbers = {11, 22, 33, 44, 55};

        int temp = numbers[0];
        numbers [0] = numbers[3];
        numbers [3] = temp;

        System.out.println( "Number 0 : " +numbers[0] + "\n" + "Number 3 : " +numbers[3] );

//--------------------------------------------------------------------------



    }
}
