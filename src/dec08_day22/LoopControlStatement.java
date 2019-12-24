package dec08_day22;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class LoopControlStatement {
    public static void main(String[] args) {


        String msg = "Java is Awesome!";
        System.out.println(msg);
        int charCount = msg.length();
        System.out.println("Character Count = " + charCount);
        String allCharacters = msg.substring(0, charCount - 1);


//  *   *   *   PRINTING INDEX NUMBER WITH CHARACTER


//        for (int index1 = 0;    index1 < charCount     ; index1++) {
//          System.out.println(index1 +":"+ msg.charAt(index1));
//                    }


        //  *   *   *   PRINTING INDEX NUMBER WITH CHARACTER - VERSION 2


//
//        for (int idx = 0;    idx <=charCount-1;   idx++)                 // << LOOK AT THE DIFFERENCE
//       // System.out.println(idx + ":" + msg.substring(idx , idx+1)  );  // This is anotherway of doing it.
//        { System.out.println(idx + ":"  + msg.charAt(idx));
//        }
//


//  *   *   *   *  BREAKING WITH A     " LETTER "  EXAMPLE


//        for (int index = 0; index < charCount ; index++)
//            // System.out.println( index +":" + msg.charAt(index));
//            if (allCharacters.equalsIgnoreCase("A"))
//                break;{
//                System.out.println("You have Chosed letter 'A'  !");
//            }


//  *   *   *   *   IF EVEN INDEX CHARACTER > SKIP &  "CONTINUE"  METHOD


        for (int idx3 = 0; idx3 < charCount; idx3++) {
            if (idx3 % 2 == 1)
            continue;{
                System.out.println(idx3 + ":"+msg.charAt(idx3));




            }
        }
    }
}