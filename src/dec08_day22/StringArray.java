package dec08_day22;

import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {

        // create an String array with size that you define
        // and store all your household member names
        String[] lovedOnes = new String[5];
        lovedOnes[0] = "Ned Stark";
        lovedOnes[1] = "Catlyn Stark";
        lovedOnes[2] = "Sansa Stark";
        lovedOnes[3] = "Arya Stark";
        lovedOnes[4] = "Rob Stark";

        System.out.println(lovedOnes[0]);
        System.out.println(lovedOnes[1]);
        System.out.println(lovedOnes[2]);
        System.out.println(lovedOnes[3]);
        System.out.println(lovedOnes[4]);

        // Above is the Course Example *********************************





        String[] familyMembers = new String [2];

        familyMembers[0] = "Fatih Yazici";
        familyMembers[1] = "Gulsum Kir";
        System.out.println("family Members = " + familyMembers[0] + " & " +familyMembers[1]);


        String[] fruitNames = new String[12];

        fruitNames[0]= "Apple";
        fruitNames[1]= "Orange";
        fruitNames[2]= "Fig";
        fruitNames[3]= "Peach";
        fruitNames[4]= "Grape";
        fruitNames[5]= "Kiwi";
        fruitNames[6]= "Guava";
        fruitNames[7]= "Banana";
        fruitNames[8]= "Plum";
        fruitNames[9]= "Dates";
        fruitNames[10]= "Mandarin";
        fruitNames[11]= "Pear";

        System.out.println("My Favorite Fruit  " +fruitNames[2]);


        String[] states = new String[4];

        states[0]= "New York";
        states[1]= "New Jersey";
        states[2]= "New Haven";
        states[3]= "New Mexico";

        System.out.println("My Favorite Sates is  " + states[0]);



        String[] teas = new String[3];

        teas[0] = "Black Tea";
        teas[1] = "Green Tea";
        teas[2] = "Herbal Tea";

        System.out.println(" My Favorite tea is " + teas[1]);


        String[] numbers = new String[5];

        numbers[0] = " 101";
        numbers[1] = " 111";
        numbers[2] = " 11";
        numbers[3] = " 011";
        numbers[4] = " 001";

        System.out.println(" My favorite number is " + numbers[0]);

        String[] cars = new String[3];

        cars[0] = "BMW";
        cars[1] = "MERCEDES";
        cars[2] = "VOLKWAGEN";

        System.out.println("My favorite car is " +cars[1]);

        int[] ages = new int[]{23, 34, 45, 56, 67};
        int agesLength = ages.length;
        System.out.print("agesLength = " + agesLength);
        System.out.println(" And the Numbers are :" + Arrays.toString(ages));

        //  ************************************

        int[] areaCodes = new int[]{ 203, 201, 917};
        int areaCodesLength = areaCodes.length;
        System.out.print(" Qty of Area Codes :" +areaCodesLength);
        System.out.println(" List of Area Codes : " + Arrays.toString(areaCodes));

        // ***************************************
        String [] colors = new String[]{" Black", " White", " Blue"};
        int lengthOfColors = colors.length;
        System.out.println(" Qty of Colors :" + lengthOfColors);
        System.out.println( " List of Colors : " + Arrays.toString(colors));

        //  **************************************

        String[] seasons = new String[]{"Winter", "Summer" , "Fall", "Spring"};
        int lengthOfSeasons = seasons.length;
        System.out.println("Qty of Seasons :" + lengthOfSeasons);
        System.out.println(" Names of Sesons :" + Arrays.toString(seasons));

        // ******************
        String[] trees = new String[3];
        trees [0]= "Beech";
        trees [1]= "Walnut";
        trees [2]= "Oak";

        System.out.println( " Array '0'  :" + trees[0]);
        System.out.println( "Print all trees :" + Arrays.toString(trees));

        // ********************

        int [] roads = new int[4];
        roads [0] = 80;
        roads [1] = 4;
        roads [2] = 97;
        roads [3] = 21;
        int lngthOfRoads = roads.length;
        System.out.println( " Qty of Roads :" + lngthOfRoads);
        System.out.println( " Names of Roads ( with braces) :" + Arrays.toString(roads));
        System.out.println(" Names of Roads :" + roads[0] + " " + roads[1] + " " +roads[2]+ " " +roads[3]);

        // ***************

        String [] womanNames = new String[] { "Gulsum", " Esma" , " Firdevs", " Neriman"};
        int lngthofwomanNames = womanNames.length;
        System.out.println(" Qty of womans names :" + lngthofwomanNames);
        System.out.println( " List of Womans Names : " + womanNames[0] + " " + womanNames[1]);


        String[] mensNames = new String[5];
        mensNames [0] = "Yunus";
        mensNames [1] = "Rahmi";
        mensNames [2] = "Orhan";
        mensNames [3] = "Fatih";
        mensNames [4] = "Yunus";
        int lengthOfMensNames = mensNames.length;
        System.out.println( " Qty of Mens Names :" + lengthOfMensNames);
        System.out.println( " List of Mens Names : " + Arrays.toString(mensNames));




    }
}
