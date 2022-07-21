package exercise;

import java.util.Scanner;

public class TaxCalculatorMain {
    public static void main(String[] args) {
        TaxCalculator myTaxCal = new TaxCalculator();

        Scanner input = new Scanner(System.in);

        System.out.println("""
                WELCOME TO THE TAX CALCULATOR
                
                1. Proceed to calculate tax
                """);
        int choice = input.nextInt();
        char response = 'y';
        if (choice == 1 ) {
            while (response != 'n'){
                System.out.println("Enter citizen's name: ");
                String name = input.next();

                System.out.println("Enter your earning: ");
                int earning = input.nextInt();

                int result = myTaxCal.taxPercentage(earning);
                System.out.printf("Dear %s, your total tax is: $%s\n\n", name, result);

                System.out.println("Add more earning? (y/n)");
                response = input.next().charAt(0);
            }
        }
        System.out.println("""
                    Thank you for using the tax calculator
                    """);
    }
}
