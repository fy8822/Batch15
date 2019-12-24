package dec11_day25;

import java.util.Arrays;

public class FindLongestWordInASentence {
    public static void main(String[] args) {
//  VIDEO 02:15

        // first create a String variable longestWord to store my result
        //  also create maxCharCount variable to store my longest char count
        // I want to go through each and every word in string array
        // and check whether the length of current word is more than longestWord
        // if it's I will assign the longest word value to current word i am looking at

        // assume the first word is the longest word before checking


        String sentence = "We Love Java Coding intensively";

        String[] sentenceSplitinwords = sentence.split(" ");
            System.out.println("allWords = " + Arrays.toString(sentenceSplitinwords));

        String longestWordinSentence = sentenceSplitinwords[0];

        for (String currentWord : sentenceSplitinwords) {
            System.out.println("currentWord = " + currentWord);

            if (currentWord.length() > longestWordinSentence.length()) {
                longestWordinSentence = currentWord;
            }

      }
        System.out.println("longestWord = " + longestWordinSentence);

//-----------------------------------------------------------------------------


        String favCity = "Istanbul is a beatiful city";
        String[] favCitySplitted = favCity.split(" ");
        System.out.println("favCitySplitted" + Arrays.toString(favCitySplitted));

        String longestWordinfavCity = favCitySplitted[0];

        for (String currentWord   :  favCitySplitted  ) {
            System.out.println("currentWord = " + currentWord);

        if (currentWord.length() > longestWordinfavCity.length()) {
            longestWordinfavCity = currentWord;
        }
        }
        System.out.println("Longest Word = " + longestWordinfavCity);
























































    }
}
