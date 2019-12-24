package November2019;
// DAY 15
public class Nov27_SubString {
    public static void main(String[] args) {

        // Getting part of a String "out of " another String
               //       0123456789012345
        String movie = "Lord Of The Ring";

        String wordOf = movie.substring(5,7);
        System.out.println("wordof :" + wordOf);

        String wordThe = movie.substring(8,11);
        System.out.println("word The :" + wordThe);

        String secondWordTillEndWord = movie.substring(5,16);   // Method 1 : Of The Ring
        System.out.println(secondWordTillEndWord);

        String secondWordTillEndWord2 = movie.substring(5);     // Method 2 : Of The Ring  ! Better-Shorter Method
        System.out.println(secondWordTillEndWord2);

        // TURN: Lord of The Ring >> Ring Of The Ring
        //                0123456789012345
        //String movie = "Lord Of The Ring";

                String wordRing= movie.substring(12);
                String wordOfThe= movie.substring(4,12);
                String wordLord= movie.substring(0,4);
                System.out.println(wordRing + wordOfThe + wordLord);  //Ring Of The Lord

    //   "Lord Of The JAVA Ring";  << If you want to add a word
        System.out.println(wordRing + wordOfThe + "JAVA " + wordLord);









    }
}
