package exercise;

import java.util.Scanner;

public class SalesCommissionMain {
    public static void main(String[] args) {
        SalesCommission myCal = new SalesCommission();
        Scanner input = new Scanner(System.in);

        System.out.println("""
                                WELCOME TO THIS CALCULATOR
                1. To Continue
                """);
        int userInput = input.nextInt();
        int counter = 1;
        int totalPrice = 0;
        int quantity = 0;
        char response = 'y';
        if (userInput == 1){
            while(response != 'n'){
                System.out.println("Enter item name: ");
                String name = input.next();

                System.out.println("Enter item price: ");
                int price = input.nextInt();
                quantity = counter++;
                totalPrice += price;

                System.out.println("\nItem name is: " + name);
                System.out.println("Item price is: " + price);
                System.out.println("No of items is: " + quantity);
                System.out.println("--------------------");
                System.out.println("Total sales is: " + price);

                System.out.println("\nAdd more items to the list (y/n): ");
                response = input.next().charAt(0);
            }
            System.out.println("\n***********************");
            System.out.println("    COMBINING LIST -");
            System.out.println("\nTotal price is: " + totalPrice);
            System.out.println("Total item count is: " + quantity);
            System.out.println("Total commission is: " + myCal.total(totalPrice));
            System.out.println("***********************");

        }
    }
}
