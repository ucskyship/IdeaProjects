package phoneBook;

import java.util.Scanner;

public class PhoneBookMain {
    private static final PhoneBook myPhoneBook = new PhoneBook();
    public static void main(String[] args) throws UserInfoException {
        Scanner input = new Scanner(System.in);
        int endApp = 0;
        char cont = 'y';

        System.out.println("""
                 -------------------------------------------
                         WELCOME TO THIS PHONEBOOK -
                         
                 1. Create a new user
                 2. Login
                 
                  0. Cancel
                -------------------------------------------
                 """);
        int userResponse = input.nextInt();
        switch (userResponse) {
            case 1: {
                System.out.println("Enter username for this user: ");
                String username = input.nextLine();
                input.nextLine();
                System.out.println("Enter password for this user: ");
                String password = input.nextLine();
            }
            case 2: {
                while (endApp != -1) {
                    System.out.println("""
                            1. Create a new contact
                            2. Edit contact
                            3. Search contactName
                            4. View all contacts
                            5. Delete contact
                                                        
                            0. Logout -
                            """);
                    userResponse = input.nextInt();
                    input.nextLine();
                    switch (userResponse) {
                        case 1 -> {
                            while (cont != 'n') {
                                System.out.println("Create new contact -\n");
                                System.out.println("Enter contact name: ");
                                String name = input.next();

                                System.out.println("Enter contact telephone: ");
                                String telephone = input.next();

                                UserInfo userInfo = new UserInfo(name, telephone);
                                myPhoneBook .addUserInfo(userInfo);

                                System.out.printf("""

                                        Contact created successfully
                                        contact information - \n%s

                                        Do you want to add another contact (y/n)
                                        """, myPhoneBook.getContact(name));
                                cont = input.next().charAt(0);
                            }
                        }
                        case 2 -> {
                            System.out.println("sorry, service is unavailable we working on it, kindly try again later");
                        }
                        case 3 -> {
                            System.out.println("Enter contact name to search: ");
                            String contactName = input.next();
                            UserInfo userInfo = myPhoneBook.getContact(contactName);
                            System.out.println(userInfo);
                            System.out.println("0. Back");
                            int userInput = input.nextInt();
                            if (userInput == 0) {

                            }
                        }
                        case 4 -> {
                            System.out.println("this service is unavailable we working on it, kindly try again later");
                        }
                        case 5 -> {
                            System.out.println("Enter contact name to delete: ");
                            String deleteName = input.next();
//                            UserInfo userInfo = myPhoneBook.removeUserInfo(deleteName);
                        }
                    }
                }
            }
        }
    }
}
