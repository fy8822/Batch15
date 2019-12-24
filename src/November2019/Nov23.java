package November2019;

public class Nov23 {
    public static void main(String[] args) {

// combining multiple condition together
// in java there is no range check directly like math
// for example   int x = 70
// in math  :     60 < x < 100   -->>  true < 100
// in Java  :      x > 60  && x <100
// && 2 ampersand  & 1 ampersand   -->> Logical AND operator
        // This is used to check both conditions are true at the same time
// Think about login example
// only when your username is right and your password is right at the same time
// then you will be able to login
/*
                     true       true
* int x = 70 ;    x > 60  && x <100 ;  true
*
                    false      true
* int x = 10 ;    x > 60  && x <100 ;  false
*
                    true       false
 *int x = 110 ;   x > 60  && x <100 ;  false
 *
                    true       true
 *int x = 99 ;    x > 60  && x <100 ;  true
 *
 *
* */
/*
 ||  2 pipe  or  | 1 pipe is used for compiling 2 conditions  : Logical  OR Operator
        If you have 2 conditions to check
        When will this be true  :  As long as one side is true , whole result will be true
// think about buying milk from 2 stores :
        As long as you found the milk in one store , you got the milk then you get out !
                How do I type  pile character on keyboard   |   —>> shift \
        As long as one side is true   whole result will be true
                / *
        true             false
        int x = 70 ;     x>10   ||   x < 5      —>> true
        false.      false
        int x = 7 ;     x>10   ||   x < 5      —>> false
        true.      false
        int x = 17 ;     x>10   ||   x < 5      —>> true
        false        true
        int x = -8 ;     x>10   ||   x < 5      —>> true

       */

        //  System.out.println( "TRUTH TABLE &&");

        System.out.println("1  " + (true && true));
        System.out.println("2  " + (false && true));
        System.out.println("3  " + (true && false));
        System.out.println("4  " + (false && false));

        System.out.println("RESULT OF true && true  is " + (true && true));
        System.out.println("RESULT OF false && true  is " + (false && true));
        System.out.println("RESULT OF true && false  is " + (true && false));
        System.out.println("RESULT OF false && false  is " + (false && false));
        System.out.println("TRUTH TABLE ||");

        System.out.println("RESULT OF true || true  is " + (true || true));
        System.out.println("RESULT OF false || true  is " + (false || true));
        System.out.println("RESULT OF true || false  is " + (true || false));
        System.out.println("RESULT OF false || false  is " + (false || false));


//        System.out.println( x >100 || x < 10);
//        System.out.println( x >100 && x < 10);
//
//        System.out.println( true || false || false);
//        System.out.println( true && true && false);
//        System.out.println( x==50 || x==51 || x==55);
//        System.out.println( x>50 && x!=52 || x==57);

        // == check equality     != check inequality

/*
        int x =5;  // This was not clear, try to understand the difference
        System.out.println( x==4 & x==5 & x==6);  // false
        System.out.println( x==4 && x==5 && x==6);  //false
        System.out.println( x==4 | x==5 | x==6);  //true
        System.out.println( x==4 || x==5 || x==6);  //true
        System.out.println(" reversed number sequence");
        System.out.println( x==6 & x==5 & x==4);  // false
        System.out.println( x==6 && x==5 && x==4);  //false
        System.out.println( x==6 | x==5 | x==4);  //true
        System.out.println( x==6 || x==5 || x==4);  //true
        */


// SCORE CHECKER *********************************
/*
        int score = 99;

        if (score<0 || score>100) {
            System.out.println("invalid");

        }else if (score==100){
            System.out.println("perfect");

        }else if (score>=70 && score<=99){
            System.out.println("you have passed");
        }

*/
        // STRING EQUALITY

//        String myName = "Akbar";
//        String yourName = new String("Akbar");
//
//        System.out.println(" Do we have same name?");
//        System.out.println(myName.equals(yourName));
//
//        if ( myName.equals("fatih")){
//            System.out.println(" NICE NAME");
//        }else{
//            System.out.println(" your name");


//        String name = "Akbar";
//        String wname = new String("Akbar");
//
//        System.out.println(" Is your name matches mine?");
//        System.out.println(name.equals(wname));
//        if (name.equals(wname)) {
//            System.out.println(" Nice Name");
//        } else {
//            System.out.println(" we dont have same name");
//
//
//            String nameFruit = "APPLE";
//            String nameVeggie = new String("SEA-APPLE");
//
//            System.out.println(" do you have APPLE in the basket?");
//            if (nameFruit.equals(nameVeggie)) {
//                System.out.println(" Green APPLE is very Healty");
//            } else {
//                System.out.println(" Eat your SEA-APPLE " +
//                        "Veggitables");


//                String asianCoffee = "INDONESSIAN";
//                String africanCoffee = new String("INDONESSIAN");
//                if (asianCoffee.equals(africanCoffee)) {
//                    System.out.println("THIS IS A GREAT COFFEE");
//                } else {
//                    System.out.println(" YOU ARE DRINKING AFRICAN COFFEE");


//                    String myCar = " MERCEDES";
//                    String yourCar = new String("BMW");
//                    System.out.println("WHAT KIND OF CAR DO YOU HAVE");
//                    if (myCar.equals(yourCar)){
//                        System.out.println(" WE BOTH HAVE MERCEDES, WOOOW!");
//                    }else{
//                        System.out.println(" YOU MUST BE DRIVING BMW !");
//                }
//
//
//







            }}

