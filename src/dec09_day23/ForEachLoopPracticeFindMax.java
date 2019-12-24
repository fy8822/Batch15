package dec09_day23;

public class ForEachLoopPracticeFindMax {
    public static void main(String[] args) {

//  ------------------------------------------------------------------------------------------------------
        long[] salaries = new long[]{101500, 195650, 145550, 116750, 75560};
        long max = salaries[0];
        long sum = 0;

        for (long salary : salaries) {          // shortcut: iter  shortest way to write a loop !!!!!
            if (salary > max) {                 // if the current salary checking: more than max (#) "becames the " salary " !!!!!!!!
                max = salary;                   // ! so replace the existing value of max with current larger salary (#)
            }
                sum += salary;                   //sum = sum + salary;    !getting sum is always straightforward
        }

        System.out.println("maxSalary = " + max);
        System.out.println("sum = " + sum);

//  ------------------------------------------------------------------------------------------------------




        long[] salaries2 = new long[]{-100000L, -200000L, -150000L, -115000L, -60000L};
        long max2 =salaries[0] ;

        long max3 = 0;
        // max3 : You can not pick a arbitrary # and compare it within the array.








        /*
         * create a long array or 5 items called salaries and add salaries
         *
         * use for each loop to iterate over them & print them
         *
         * OPTIONALLY : use different for each loop to &&& print only the salary more than 100000
         *
         * Optionally :
         * use for each loop to find the max
         * use for each loop to find the sum
         * */

        // I need to pick up an item from this array so I can compare with other items
        // since first one is right there , I just decided to pick it up  and make it temporarily the max value
        // can I pick 2nd or 3rd instead -->>> YES YOU CAN !!!
        /*
         * plain english logic to find max salary
         *
         *  write down the first number as temporarily max salary on a paper
         *  then go through each number and compare the number
         *   if the number you are comparing is more than what is on the paper
         *      delete that number and replace with bigger number
         *    keep doing this until you dont have any more number left.
         * */
    }
}
