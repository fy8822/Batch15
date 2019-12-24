package dec15_day27;

import java.util.Arrays;

public class ArrayTask_MyPractise {
    public static void main(String[] args) {


      int [] xxx = {5,4,3,2,1,0};
      int smallest = xxx [0];

        for (int i = 0; i < xxx.length; i++) {
            if( smallest > xxx[i]){
                smallest = xxx[i];
            }
        }
        System.out.println("first : "+ smallest);
 //----------------------------------------------------------
        int smallest2 = xxx [0];
        for ( int i =0; i < xxx.length; i++) {
            if (smallest2 > xxx[i] && xxx [i] != smallest) {
                smallest2 = xxx[i];
            }
        }
        System.out.println("second : " + smallest2);
//---------------------------------------------------------------
        int smallest3 = xxx [0];

        for (int i = 0; i < xxx.length; i++) {
            if (smallest3 > xxx[i] && xxx[i] != smallest2 && xxx[i] != smallest ) {
                smallest3 = xxx[i];
            }

        }
        System.out.println("third :" + smallest3);





//-----------------------------------------------------------------


    }
}
