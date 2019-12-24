package dec15_day27;

public class MultiDimArry_LongestLengthName_Practise {
    public static void main(String[] args) {

// ------F I N D    L O N G E S T   N A M E --->>>  Using Fori Method -----------------------

//        String[] developTeam = {"Vladislav", "Hasan", "Tolkun", "Abide"};
//        String[] testersTeam = {"Zhibekchach", "Mohammed Sohrabi", "Nursultan"};
//        String[] bizAnlysTeam = {"Lisa", "Ershad", "Naila"};
//
//        String [][] allTeams = { developTeam, testersTeam,bizAnlysTeam };
//        int maxNumberInName = allTeams[0][0].length();
//        String maxLngthName = "";

//            for ( int i = 0; i < allTeams.length;     i++)       {
//            for ( int j = 0; j < allTeams[i].length;  j++)        {
//                if ( maxNumberInName < allTeams[i][j].length())     {
//                     maxNumberInName = allTeams[i][j].length();
//                     maxLngthName    = allTeams[i][j];
//                }
//            }
//        }
//
//        System.out.println(" max length number in a name : " + maxNumberInName);
//        System.out.println(" max length name : " + maxLngthName);
//

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






//------------------------------------------------------------------------------------------------------------





















    }
}
