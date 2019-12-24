package dec08_day22;

public class ArrayINtro1 {
    public static void main(String[] args) {

        int num1 = 10;
        System.out.println("num1 = " + num1);

        num1 = 100;
        System.out.println("num1 = " + num1);

        // syntax for creating variable to store multiple items & values
        //  dataType [] variableName = new dataType[ count of item ] ;
        // this array can hold 4 items , it's also known as array size

        int[] scores = new int[4];
        // assigning value to each index
        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;

        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);
                                                     // updating the value at certain index
        scores[1] = 99;                              // Array size can NOT be changed once created.
        System.out.println(scores[1]);               // Create new Array Object & it will be default value

        int[] numbers = new int[3];
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        System.out.println("\n");

        byte[] data = new byte[4];
        data[0] = 10;
        data[1] = 20;
        data[2] = 30;
        data[3] = 40;

        System.out.println("data 0 = " + data[0]);
        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);

        data[3] = 127;                            // This is how you change the value of index
        System.out.println(data[3]);              // this is how you print it out.

        System.out.println(" \n");

     // ******************************************************
        int[] sayilar = new int[5];

        sayilar[0] = 1;
        sayilar[1] = 2;
        sayilar[2] = 3;
        sayilar[3] = 4;
        sayilar[4] = 5;

        System.out.println("Sayi 0 : " +sayilar[0] + " "  +   "Sayi 1 : " +sayilar[1] +  "   Bunlarin Toplami : " + ((sayilar[0])  + (sayilar[1])));


    }
}
