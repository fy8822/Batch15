package dec11_day25;
// VIDEO  01: 51

import java.util.Arrays;

public class String_Split_Method {
    public static void main(String[] args) {

//-----------------------------------------------------------------------------------------------------
        String xxx = "I Love Java";
        String[] allWordsOfxxx = xxx.split(" ");                        // you can split by anyhting !

        System.out.println("allWords = " + Arrays.toString(allWordsOfxxx));
        System.out.println("How many word do I have in this sentence ? : " + allWordsOfxxx.length);

        System.out.println("Last word in this sentence is " + allWordsOfxxx[allWordsOfxxx.length - 1]);

 // ------------------------------------------------------------------------------------------------------
        String yyy = "Everything is Awesome!!!";

        String[] yyy_splitBy_e = yyy.split("e");
        System.out.println("splitBy_e_Arr = " + Arrays.toString(yyy_splitBy_e));

        for (String piecesOf_yyy : yyy_splitBy_e) {                                  // using for each loop to iterate over the resulting array
            System.out.println("eachPiece = "+ piecesOf_yyy );
        }


 // -------------------------------------------------------------------------------------------------------



        // split this sentence by is and print out your result


        // WHAT DOES IT DO ?
        // split(bySomething) is a method of String that split string into multiple part
        // DO I NEED TO PROVIDE EXTRA DATA WHILE CALLING THE METHOD ?
        // Yes , we need to tell what do we use while splitting , in this example space
        // WHAT DO I GET OUT OF IT ?
        // We get out String array





    }
}
