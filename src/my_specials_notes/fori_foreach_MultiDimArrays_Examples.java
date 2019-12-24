package my_specials_notes;

public class fori_foreach_MultiDimArrays_Examples {
    public static void main(String[] args) {

        // ------F I N D    L O N G E S T   N A M E --->>>  Using Fori Method -----------------------

        String[] teamXXX = {"Vladislav", "Hasan", "Tolkun", "Abide"};
        String[] teamYYY = {"Zhibekchach", "Mohammed Sohrabi", "Nursultan"};
        String[] teamZZZ = {"Lisa", "Ershad", "Naila"};

        String [][] allXYZ = { teamXXX, teamYYY, teamZZZ };
        int mxNumberInName = allXYZ[0][0].length();
        String mxLngthName = "";

            for ( int i = 0; i < allXYZ.length;     i++)       {
            for ( int j = 0; j < allXYZ[i].length;  j++)        {
                if ( mxNumberInName < allXYZ[i][j].length())     {
                     mxNumberInName = allXYZ[i][j].length();
                     mxLngthName    = allXYZ[i][j];
                }
            }
        }

        System.out.println(" max length number in a name : " + mxNumberInName);
        System.out.println(" max length name : " + mxLngthName);


// --------------- F I N D    L O N G E S T   N A M E --->>>  Using For Each ----------------------


        String[] developTeam =  {"Vladislav", "Hasan", "Tolkun", "Abide"};
        String[] testersTeam =  {"Zhibekchach","Mohammed Sohrabi", "Nursultan"};
        String[] bizAnlysTeam = {"Lisa","Ershad", "Naila"};

        String [][] allTeams = { developTeam, testersTeam, bizAnlysTeam };
        int     maxLength    = allTeams[0][0].length();
        String longestString = "";


        for (String[] each1DArray : allTeams) {
            for (String eachElement : each1DArray) {
                if (maxLength     < eachElement.length())  {              // to compare which string has the largest length
                    maxLength     = eachElement.length();                 //  to assign maximum string length
                    longestString = eachElement;
                }
            }
        }
        System.out.println(" max length number in a name : " + maxLength);
        System.out.println(" max length name : " + longestString);








    }
}
