package exercise;

import java.util.Scanner;

public class LargestNumberMain {
    public static void main(String[] args) {
        LargestNumber myLargeNum = new LargestNumber();

        int counter = 1;
        int number;
        int largest=0;
        Scanner input = new Scanner(System.in);

        while (counter <= 10){
            System.out.println("LET GET THE HIGHEST SALES UNIT  FOR YOU -");
            System.out.println("-------------------------------------------\n");
            System.out.println("Enter your total unit: ");
            number = input.nextInt();
            for (int i = 1; i <= 10; i++) {
                if (number > i){
                    largest = myLargeNum.totalUnits(number);
                }
            }
            System.out.println("The largest unit sales is: " + largest);
        }
    }
}
