package exercise;

import java.util.Scanner;

public class GasMilageMain {
    public static void main(String[] args) {
        GasMileage myCal = new GasMileage();
        int mileDriven, milePerGallon;

        System.out.println("""

                WELCOME TO MILLAGE CALCULATOR

                     1. To proceed
                """);
        Scanner sc = new Scanner(System.in);
        char cont = 'y';
        int userResponse = sc.nextInt();
        if (userResponse == 1){
            while (cont != 'n' && userResponse != -1) {
                System.out.println("Enter mile driven (-1 to endApp): ");
                mileDriven = sc.nextInt();

                if (mileDriven != -1) {
                    System.out.println("Enter gallon driven (-1 to endApp): ");
                    milePerGallon = sc.nextInt();
                } else break;

                System.out.printf("Total miles per gallon for this trip is %.3f\n\n", myCal.totalMilesPerGallon(mileDriven, milePerGallon));
                System.out.println("Would you like to add another trip to this? (y/n): ");
                cont = sc.next().charAt(0);
            }

            System.out.println("COMBINING TOTAL STAT FOR TRIP(s) -");
            System.out.println("Total miles: " + myCal.getAllMMileDriven());
            System.out.println("Total gallons: " + myCal.getAllGallonPerMiles());
            System.out.println("Total combined MPG: " + myCal.allMilesDriven());
        }
    }
}
