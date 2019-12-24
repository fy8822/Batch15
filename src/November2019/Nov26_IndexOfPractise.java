package November2019;

public class Nov26_IndexOfPractise {
    public static void main(String[] args) {

        // indexOf -->>
        // find out index of another String inside This String
        //             012345678901
        String name = "Game of Java"; // length is 12 , last char index is 11
        // find out the location of Java

        System.out.println("find out the location of Java");
        System.out.println(name.indexOf("Java"));
        // find out the location of letter o

        System.out.println("find out the location of o");
        System.out.println(name.indexOf("o"));
        // if the location is not found , we get minus number
        System.out.println("find out the location of uppercase O");
        System.out.println(name.indexOf("O"));

        // find out the location of first space
        System.out.println("find out the location of first space  ");
        System.out.println(name.indexOf(" "));


        String indexofMyName = "Fatih Yazici";
        System.out.println(" This is Index of my First Name: ");
        System.out.println(indexofMyName.indexOf("fatih"));


        String babesName = "Gulsum";

        System.out.println("What is Index of Gulsum" );
        System.out.println(babesName.indexOf("G"));


        // LAST INDEX OF  !!!!!!!!!!!!!!!!!!!!!!!!!

        //             012345678901
        //  name iki defa kullanildigi icin mute yaptim  !!!
       // String name = "Game of Java"; // length is 12 , last char index is 11

        // find out last location the letter a shows up
        System.out.println("find out last location the letter a shows up");
        System.out.println(name.lastIndexOf("a"));

        // find out last location the character space shows up
        System.out.println("find out last location the character space shows up");
        System.out.println(name.lastIndexOf(" "));
        // find out last location the letter Ga shows up
        System.out.println("find out last location the letter Ga shows up");
        System.out.println(name.lastIndexOf("Ga"));
        // find out last location the letter Kawa shows up
        System.out.println("find out last location the letter Kawa shows up");
        System.out.println(name.lastIndexOf("Kawa"));

        //  if i DONT USE contains method , what would be my condition to check
        // whether we have Kawa in this String , either using indexOf or lastIndex

        if (name.indexOf("Kawa") > -1) {
            System.out.println(" KAWA FOUND!!!");
        } else {
            System.out.println("NO KAWA - NO PUMPKIN");
        }

        System.out.println("What is the Last Index of 'u' ");
        System.out.println(babesName.lastIndexOf("u"));

        System.out.println("What is the Last Index of 'k' ");
        System.out.println(babesName.lastIndexOf("k"));
        if (babesName.indexOf("k") >-1);
        System.out.println("Your name does not contain letter 'k' .");

        if (babesName.indexOf("G") >0);
        System.out.println("Your name contains letter 'G' .");



    }
    }

