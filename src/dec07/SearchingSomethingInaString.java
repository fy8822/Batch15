package dec07;

public class SearchingSomethingInaString {
    public static void main(String[] args) {

//        String myName = "My name is Ramazan";
//        System.out.println(myName);
//        int charCount = myName.length();
//        System.out.println("Char Count :" + charCount);
//
//        int lastCharIndex = charCount - 1;
//        System.out.println("Last Char Index :" + lastCharIndex);


        // find out index of all the letter a in cases insensitive
        // go through each and every character of the String
        //     for each character   substring (0,1)
        //                          0 to last index   loop it
        // check equality of a or A
        //       currentCharacter.equalsIgnoreCase("a")
        // if it is what I am looking for print it otherwise move on
        //

//        System.out.println(" ----  3 char -----");
//        for (int x = 0; x <= lastCharIndex -3; x++) {
//            String currentChar = myName.substring(x, x + 3);
//            if (currentChar.equalsIgnoreCase("Ram")) {
//                System.out.println("The Index of Ram is " + x);
//            }
//
//                }






        int sum = 0;

        for(int x=1; x <=10; x++){
            System.out.println("Current Sum is: " + sum);
            System.out.println(" If I add " + x + " Dollar, It would be " + (sum + x));
        if(sum + x > 40){
            break;
        }
     sum = sum + x;{
                System.out.println( " sum = " + sum);
            }









            }


        }}
