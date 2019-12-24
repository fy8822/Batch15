package dec14_day26;

public class ToCharArray_foreach_fori_while_doWhile_practise {
    public static void main(String[] args) {


        String xxx = "Happy Holidays";
        char[] xxxChars = xxx.toCharArray();

        for (char each : xxxChars) {                             // <<< for each loop example
            System.out.println("foreach method : " + each);
        }
//----------------------------------------------------------------------------------------------------------------
        for (int i = 0; i < xxxChars.length; i++) {
            System.out.println("fori method : " + xxxChars[i]);
        }
//---------------------------------------------------------------------------------
        int x = 0;
        while (x < xxxChars.length) {
            System.out.println("while method : " + xxxChars[x]);
            x++;
        }
//---------------------------------------------------------------------------------
        int y = 0;
        do {
            System.out.println("do-while method : " + xxxChars[y]);
            y++;
        }
        while (y < xxxChars.length);
//---------------------------------------------------------------------------------














    }
}
