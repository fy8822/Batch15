package dec04_day20;

public class FindDogInASentence {
    public static void main(String[] args) {

//        String msg = "I like Dog , Dogs are cute , Dogs are friendly";
//        int lastCharIndex = msg.length() - 1;
//
//        for (int x = 0; x <= lastCharIndex - 2; x++) {
//            String current3chars = msg.substring(x, x + 3);
//
//            if (current3chars.equals("Dog")) {
//                System.out.println("BINGO !!!! AT " + x);
//            }
//        }

            String memleket = "Uyy Trabizon, Trabizon, ici kalayli kazon";
            int lastCharIndx = memleket.length() - 1;

            for ( int indx = 0; indx <= lastCharIndx -2; indx ++){
                String trabizon3 = memleket.substring( indx, indx + 3);

          //  }if (lastCharIndx.equals ("zon")){
            System.out.println( "You have found it" + lastCharIndx);
        }

            //System.out.println(x + " :  " +  current3chars   );
            // given sentence , find out the location of the dog

            // our approach is
            // doing through the sentence 3 character at a time
            // then if 3 characters happen to be a dog , we print out the index

    /*
      0123456789012345678901234567890123456789012345
    * I like Dog , Dogs are cute , Dogs are friendly
    * I l
    *  li
    * lik
    *
    *
    * */



    }
}









