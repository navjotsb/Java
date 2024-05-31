import java.util.Scanner;

public class IVRDemo {
    public static void main(String[] args) {

        char c;
        do {
            System.out.println("**************************");
            System.out.println("Welcome to Rogers/Bell");
            System.out.println("**************************");

            System.out.println("1. Press 1 for english");
            System.out.println("2. Other lang option");

            System.out.println("Enter the Language ");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();


            if (choice == 1) {

                System.out.println("Enter your choice ");
                System.out.println("Press 1 Customer Support");
                System.out.println("Press 2 Billing");
                System.out.println("Press 3 Escalation");
                System.out.println("Press 4 xyz");
                System.out.println("Press 5 Exit");
                System.out.println("Press 0 main menu");
                int option = scanner.nextInt();


                switch (option) {

                    case 0:
                        break;

                    case 1:

                        if (false) {
                            System.out.println("Welcome to Rogers My name .....");
                            if (true) {

                            }
                        } else {
                            System.out.println("No customer support available after 8 PM");
                        }
                        break;

                    case 2:
                        break;

                    case 3:
                        break;

                    case 4:
                        break;

                    case 5:
                        break;

                }

            } else {
                System.out.println("French");

            }
            System.out.println("do you want to continue? (y/n)");
            c = scanner.next().charAt(0);
        } while (c == 'y');

    }
}

        /*switch (choice) {
            case 1:

                System.out.println("English");

                int moreChoice = 1;

                if( moreChoice == 1 ){

                    System.out.println("Tech support..");
                    System.out.println("Do you want to talk to tech support or automatic response ");
                    System.out.println("Press 1 for Tech support and 2 for automatic response ");
                    int response = 1;
                    if(response == 1) {
                        System.out.println("Tech support online..");
                    }else{
                        System.out.println("Automatic response. ");
                    }
                }
                else if (moreChoice == 2){

                }
                else if (moreChoice ==3) {


                }
                else {
                    System.out.println("Invalid input...");
                }

                break;

            case 2 :

                break;
        }
*/





// Press 1 : English
// Telecom : Billing, Cancellation,  Tech Support, Customer
// Billing -- pay your bill, make a payment arrangement
// Press 2 : French