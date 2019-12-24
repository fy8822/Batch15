package dec09_day23;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        long[] salaries = new long[]{100000L, 200000L, 150000L, 115000L, 60000L};

        for (long eachSalary : salaries) {
            System.out.println("Each Salary = " + eachSalary );
        }

//      ----------------------------------------------------------------------------
        for (long empSalary : salaries) {
            if( empSalary > 100000 ){
                System.out.println("salary = " + empSalary);
            }
//      ----------------------------------------------------------------------------


            if (empSalary <= 100000) {                          // skip example
                continue;
            }
            System.out.println("salary = " + empSalary);

        }








        /*
         * create a long array or 5 items called salaries
         * put your salary amounts that ok for your offer
         *
         * use for each loop to iterate over them
         * and print them out
         *
         * OPTIONALLY : use different for each loop to
         * print only the salary more than 100000
         *
         * Optionally :
         * use for each loop to find the max
         * use for each loop to find the sum
         *

         * */




    }
}
