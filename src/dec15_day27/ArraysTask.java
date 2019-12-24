package dec15_day27;

public class ArraysTask {
    public static void main(String[] args) {
    /*............. Task01:
                write a program that can find the smallest number for an array
                    DO NOT use sort method
                 write a program that can find the second smallest number for an array
                    DO NOT use sort method
                write a program that can find the third smallest number for an array
                     DO NOT use sort method
     */
 //------------------------------------------------------------------------------------------
        int[] scores = {1, 2, 3, 2000, 1000};
        int   min = scores[0];

        for (int i = 0; i < scores.length; i++) {
            if (min > scores[i])
                { min = scores[i]; }
        }
        System.out.println("smallest number: " + min);

 //--------------------------------------------------------------------------------------
        int secondSmallestNumber = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (secondSmallestNumber > scores[i] && scores[i] != min) {
                secondSmallestNumber = scores[i];
            }
                                                                             /*         if(scores[i] == min ){
                                                                                        continue;
                                                                                        }
                                                                              */
        }
        System.out.println("second smallest number is: " + secondSmallestNumber);

 // -------------------------------------------------------------------------------------------------
        int thirdSmallestNumber = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (thirdSmallestNumber > scores[i] && scores[i] != min && scores[i] != secondSmallestNumber) {
                thirdSmallestNumber = scores[i];
            }
                                                           /*     if(scores[i] == min || scores[i] ==secondMin){
                                                                  continue;
                                                                       }
                                                            */
        }
        System.out.println("third minimum number is: " + thirdSmallestNumber);






















    }


}
