package dec08_day22;

public class LoopingThroughAnArray {
    public static void main(String[] args) {

        // creating an array object with empty slot
        int[] scores = new int[4];

        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;

        int itemCount = scores.length;                              // array object has a property,  called length
        int lastItemIndex = itemCount -1;                          // !!! Getting the " Last Index "  NOT Last Count !!!!
        System.out.println(lastItemIndex);
                                                                   //      for (int x = 0;    x <= lastItemIndex ;   x++) {
                                                                   //      for (int x = 0;    x <= itemCount-1 ;     x++) {
        for (int x = 0;    x <  itemCount;        x++) {

            System.out.println(scores[x]);

        }

        // print this array in reverse order

        // accessing the elements inside array one by one
//        System.out.println(scores[0]);
//        System.out.println(scores[1]);
//        System.out.println(scores[2]);
//        System.out.println(scores[3]);


        String name = "Jon Snow";
        int charCount = name.length();             // how do we get the char count of a String
        System.out.println(" Char Count :" + charCount);




    }
}
