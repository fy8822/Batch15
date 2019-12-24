package dec18_day30;
import java.util.Arrays;
public class Car_Inventory_manyItems {
    public static void main(String[] args) {

  String[] cars = {"Acura-NSX", "Chevrolet-Corvette", "Chevrolet-Cavalier", "BMW-3 Series", "Pontiac-LeMans",
                   "Oldsmobile-Achieva", "Honda-Civic", "Lexus-SC", "Volvo-S70", "Infiniti-QX", "Oldsmobile-Silhouette",
                   "Aston Martin-Rapide", "Honda-S2000", "Isuzu-i-Series", "Acura-MDX", "Infiniti-QX", "Ford-Edge"
                  };

                                                                 // we can use contains , startWith , endWith to get same result
 //-----------------------------------------------------Task1 : count Chevrolet and civic---------------------
        System.out.println("TASK----------------1");
        int chevyCNT = 0;
        int civicCNT = 0;

        for (int x = 0; x < cars.length; x++) {
                                                               //System.out.println( cars[x]   );
            if (cars[x].contains("Chevrolet")) {
                chevyCNT++;
            }
            if (cars[x].contains("Civic")) {
                civicCNT++;
            }
        }
        System.out.println("chevyCNT = " + chevyCNT);
        System.out.println("civicCNT = " + civicCNT);

 //--------------------------------------------------------- TASK 2 : PRINT ALL LOCATION OF Honda-Civic in this array
        System.out.println("TASK----------------2");
        for (int x = 0; x < cars.length; x++) {
                                                                 //if( cars[x].contains("Civic") ){
            if (cars[x].equals("Honda-Civic")) {
                System.out.println("Civic found at location : " + x);
            }
        }
//---------------------------------------------------------- TASK 3 : PRINT Make and Model separately in this format
        //Honda-Civic  -->>
        // Car make:Honda   Model: Civic  >>>   Print: Honda  brands only.

                                                                        //  go through each and every car
                                                                        // we don't need index > !use > for each loop
        for (String eachCar : cars) {
                                                                         // we want to do this action only for one type of car brand
                                                                         // so we used start with method to check car brand
            if (eachCar.startsWith("Honda")) {
                                                                         // we used split method to separate brand and model
                String[] eachCarSplitted = eachCar.split("-");
                                                                          // first part is brand , second part is model
//      System.out.println("Car make is " + eachCarSplitted[0] +
//                        "Car Model is " + eachCarSplitted[1]);
            }
        }
        System.out.println("------ car with model has only 2 characters---  ");

//---------------------------------------------------------------------------------------------------
        System.out.println("TASK----------------3");
        // find all the car with model has only 2 characters
        //  print them out  & Get the Count

        int cntOf2CharModel = 0;
        for (String eachCar : cars) {

            String[] eachCarSplitted = eachCar.split("-", 2);
            String model = eachCarSplitted[1];
            // model is second item in splited array (at index 1)
            //if( eachCarSplitted[1].length() == 2  ) {
            if (model.length() == 2) {
                cntOf2CharModel++;
                System.out.println(eachCar);
            }
        }
        System.out.println("Count Of Cars with only 2 character in their model  = " + cntOf2CharModel);
        // Sorting entire Array
        Arrays.sort(cars);
        System.out.println("cars = " + Arrays.toString(cars));

    }
}
