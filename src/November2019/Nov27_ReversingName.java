package November2019;

import java.sql.SQLOutput;

public class Nov27_ReversingName {
    public static void main(String[] args) {

        // The Java String charAt() method returns the character at the specified index.
        // This is how you print name with " space " .  charAt will do it

        String myName = "Fatih";

        int cracterCountOfMyName = myName.length();
        int lastChracterIndex = cracterCountOfMyName -1 ;
        char lastCharacter = myName.charAt(lastChracterIndex);  //  !!!  char variable !!! very important
        System.out.println( " Last Charcter: " + lastCharacter);


        System.out.println(" Finding Last Character in One Shoot : " + myName.charAt(myName.length() -1));

        System.out.println(myName.charAt(0) + " " + myName.charAt(1)+ " " + myName.charAt(2)
                + " " + myName.charAt(3)+ " " + myName.charAt(4));


        // Printing the name in " Reverse " order. very simple

        System.out.println(myName.charAt(4) + " " + myName.charAt(3)+ " " + myName.charAt(2)
                + " " + myName.charAt(1)+ " " + myName.charAt(0));


        String nameOriginal = "Gulsum";
        System.out.println(nameOriginal);
        int length111 = nameOriginal.length();
        int lastIndex = length111 -1;
        char lastCharNameOriginal = nameOriginal.charAt(lastIndex);
        System.out.println("Last Character is : " + lastCharNameOriginal);

        System.out.println(nameOriginal.charAt(0) + " " +nameOriginal.charAt(1) + " " +
                nameOriginal.charAt(2) + " " +nameOriginal.charAt(3) + " " +
                nameOriginal.charAt(4) + " " + nameOriginal.charAt(5));



        String nameBaba = "Yunus";
        System.out.println(nameBaba);

        int lengthnameBaba = nameBaba.length();
        int lastIndexOfnameBabaEksi1 = lengthnameBaba -1;
        char lastCharOfnameBaba = nameBaba.charAt(lastIndexOfnameBabaEksi1);
        System.out.println("Last Charcter of nameBaba : " + lastIndexOfnameBabaEksi1);
        System.out.println(
                nameBaba.charAt(0) + " " +
                nameBaba.charAt(1) + " " +
                nameBaba.charAt(2) + " " +
                nameBaba.charAt(3) + " " +
                nameBaba.charAt(4) + "\n");


        String nameAnne = "Firdevs";
        System.out.println(nameAnne);
        int lengthnameAnne = nameAnne.length();
        int lastindexOfnameAnneEksi1 = lengthnameAnne -1;
        int onebeforeLastNameAnneEksi2 = lengthnameAnne -2;
        char lastCharofnameAnne = nameAnne.charAt(lastindexOfnameAnneEksi1);
        char onebeforeLastCharnameAnne = nameAnne.charAt(onebeforeLastNameAnneEksi2);
        System.out.println();
        System.out.println( "Last Character of Anne : " + lastCharofnameAnne );
        System.out.println( "One before Last Character of Anne : " + onebeforeLastCharnameAnne);
        System.out.println(nameAnne.charAt(0) + " " + nameAnne.charAt(2) + "\n"  );




        String cityName = "Istanbul";
        System.out.println(cityName);
        int lengthCityName = cityName.length();
        int lastIndexOfcityName = lengthCityName -1;
        char lastCharCityName = cityName.charAt(lastIndexOfcityName);
        System.out.println("Last Character of Istanbul : " + lastCharCityName );
        System.out.println(cityName.charAt(0) + " "+ cityName.charAt(1) + "\n");




        String countryName = "Turkiye";
        System.out.println(countryName);
        int lengthOfcountryName = countryName.length();
        System.out.println("Count of Character :" + lengthOfcountryName );
        int indexofcontryName =  lengthOfcountryName -1;
        char lastCharOfcountryName = countryName.charAt(indexofcontryName);
        System.out.println("Last Character of Istanbul : " + lastCharOfcountryName);
        System.out.println(countryName.charAt(0) + " " +
                        countryName.charAt(1) + " " +
                        countryName.charAt(2) + " " +
                        countryName.charAt(3) + " " +
                        countryName.charAt(4) + " " +
                        countryName.charAt(5) + " " +
                        countryName.charAt(6) + "\n");


        String yeniDunya = "Amerika";
        System.out.println(yeniDunya);
        int lengthOfyeniDunya = yeniDunya.length();
        System.out.println("Total character count of Yeni Dunya: " +lengthOfyeniDunya );
        int lastIndexOfyeniDunya = lengthOfyeniDunya -1;
        char lastCharofyeniDunya = yeniDunya.charAt(lastIndexOfyeniDunya);
        System.out.println("Last Index is : " +lastCharofyeniDunya );






    }
}
