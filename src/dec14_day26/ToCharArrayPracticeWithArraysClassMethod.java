package dec14_day26;

import java.util.Arrays;

public class ToCharArrayPracticeWithArraysClassMethod {
    public static void main(String[] args) {

// -------toCharArray ------ Arrays.sort ----------------------

        String city = "Istanbul is a beatiful city";

        char[] cityChar = city.toCharArray();
        System.out.println("to Char Array " + Arrays.toString(cityChar));

        Arrays.sort(cityChar);
        System.out.println("Arrays Sort : " + Arrays.toString(cityChar));

 // -----------------------------------------------------------

        String city2 = "New York";

        char [] city2Char = city2.toCharArray();
        System.out.println(Arrays.toString(city2Char));












    }
}
