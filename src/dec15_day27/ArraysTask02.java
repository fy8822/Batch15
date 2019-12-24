package dec15_day27;

public class ArraysTask02 {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};
        int   max  = nums [0];

        for ( int i =0;  i < nums.length;  i++){
            if ( max < nums[i]){
                max = nums[i];
            }
        }
        System.out.println(" max 1 : " + max);
        //--------------------------------------------------------

        int max2 = nums [0];
        for ( int i = 0;  i < nums.length;  i++){
            if ( max2 < nums [i]  &&  nums [i] !=max){
                max2 = nums[i];

            }
        }
        System.out.println( " max 2 : " + max2);






    }

}
