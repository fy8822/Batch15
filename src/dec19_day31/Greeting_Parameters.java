package dec19_day31;

public class Greeting_Parameters {

    public static void main(String[] args) {

        sayHelloTo("Batch 15");        //  -->>  print Hello Batch 15
        sayHelloTo("Boys & Girls");            //  -->>  print Hello Kids
        sayHelloTo("Study Hard");
    }
    //       (String blabla) this is called method parameter
    //        it's used to tell caller of this method ,
    //        it's expecting this type of data when being called

    public static void sayHelloTo(String blabla) {

        System.out.println("Hello " + blabla);


    }
}
