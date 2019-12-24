package dec17_day29;

public class HeroIdentity {
    public static void main(String[] args) {

        //  1.   Name of the Hero must be changeable >>> "Superman-Clark J Kent";
        //  2.   End resuld must be hide the name    >>> "Superman-************";

        // 3.   String with Hero Code & Name separated by  " - "
        // 4.   Turn String into Hero Code and  *  with same length as Hero Name
        //
        // Plain English Logic for Action :
        // 1.  split String  by   " -  " get the Hero Code &  Full Name
        // 2.  get the length of full name
        // 3.  generate stars with same length as full name character count
        // 4.  concatenate herocode with dash and stars and save it
        // 5.  OR replace full name with Stars
//--------------------------------------------------------------------------------------

        String hero1 = "Superman-Clark J Kent";

        String[] heroSplitted = hero1.split("-");
        String heroCode = heroSplitted[0];
        String fullName = heroSplitted[1];

        int nameCharCount = fullName.length();
        String stars = "";
        for (int i = 0; i < nameCharCount; i++) {
            stars += "*";
        }
        System.out.println(fullName);
        System.out.println(stars);

        String heroX = heroCode + "-" + stars;

        System.out.println("hero1 = " + hero1);
        System.out.println("heroX = " + heroX);


//-------------------------------------------------------------------------------------

        String hero2 = "Superman-Clark J Kent";
        String[] heroSplitted2 = hero1.split("-");
        String heroCode2 = heroSplitted[0];
        String fullName2 = heroSplitted[1];
        String heroXXX = heroCode2 + "-"+ fullName2;  // This is how you replace back the name


        String stars2 = "";
        for (int i = 1; i <= fullName.length(); i++) {
            stars2 += "*";
        }
        System.out.println();




    }

}