package exercise;

import java.util.Scanner;

public class CitizenTaxCalTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CitizenTaxCal myCal = new CitizenTaxCal();

        String acctNo;
        int startBalance;
        int creditTotalItemCharges;
        int totalOfCreditApplied;
        int allowedCredit;

        char cont = 'y';
        while(cont != 'n'){
            System.out.println("Enter the customer account number: ");
            acctNo = scanner.next();

            startBalance = requestInput("Enter start balance for the customer account: " + acctNo + ": ", scanner);

            creditTotalItemCharges = requestInput("Enter total monthly charges for the customer account: " + acctNo + ": ", scanner);

            totalOfCreditApplied = requestInput("Enter total monthly credit applied for the customer account: " +acctNo + ": ", scanner);

            allowedCredit = requestInput("Enter credit limit account: " + acctNo + ": ", scanner);

            myCal.setAccountDetails(acctNo, startBalance, creditTotalItemCharges, totalOfCreditApplied, allowedCredit);

            System.out.printf("CREDIT INFORMATION FOR %s\n", acctNo);

            System.out.println("Starting balance: " + myCal.getStartBalance());
            System.out.println("Credit limit: " + myCal.getAllowedCredit());
            System.out.println("Total charges:" + myCal.getCreditTotalItemCharges());
            System.out.println("Total credit: " + myCal.getTotalOfCreditApplied());
            System.out.println();
            System.out.println("New Balance: " + myCal.getNewBalance());

            if(myCal.creditExceeded())
                System.out.println("Credit limit exceeded: " + myCal.creditExceeded());

            System.out.println("Calculate credit for another account? (y/n): ");
            cont = scanner.next().charAt(0);
        }
    }

    private static int requestInput(String input, Scanner scanner)  {
        System.out.println(input);
        return scanner.nextInt();
    }
}
