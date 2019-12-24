package dec07;

public class NameBreaker {
    public static void main(String[] args) {

        String name1 = " Istanbul";

        for( int x = 0; x < name1.length(); x++){
            System.out.println(name1.charAt(x));

            if(name1.charAt(x) == 'b' ){
                System.out.println("Found it !");
                break;
            }
        }
// check on github another version by Akbar






    }
}
