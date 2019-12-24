package dec15_day27;
// VIDEO  03:35

public class MultiDimArry_MinLengthName_Practise {
    public static void main(String[] args) {

        String[] developersTeam = {"Vladislav", "Hasan", "Tolkun", "Abide"};
        String[] testersTeam = {"Zhibekchach", "Mohammed Sohrabi", "Nursultan"};
        String[] businessAnalysitsTeam = {"Lisa", "Ershad", "Naila", "Ana"};

        String[][] scrumTeam = {developersTeam, testersTeam, businessAnalysitsTeam};

//-------------------------------------------------------------- find the shortest string of text

        int minLength = scrumTeam[0][0].length();
        String shortestString = scrumTeam[0][0];
        String longestString = "";

        for (int i = 0; i < scrumTeam.length; i++) {
            for (int j = 0; j < scrumTeam[i].length; j++) {
                if (minLength > scrumTeam[i][j].length()) {
                    minLength = scrumTeam[i][j].length();
                    shortestString =scrumTeam[i][j];
                }
            }
        }

        System.out.println("min length : " + minLength);
        System.out.println("shortest string :  " +shortestString);









    }
}
