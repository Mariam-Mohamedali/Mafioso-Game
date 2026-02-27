import java.util.InputMismatchException;
import java.util.Scanner;
public class CrimeGame{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===== Crime 1 =====
        Suspect c1s1 = new Suspect(
                "Sarah",
                "Wants to inherit the fortune",
                "She was sleeping ",
                true);

        Suspect c1s2 = new Suspect(
                "Mahmoud",
                "Business conflict",
                "Online meeting recorded",
                false);

        Suspect c1s3 = new Suspect(
                "Mariam",
                "Was fired recently",
                "Was in the garden",
                false);

        Crime crime1 = new Crime(
                "Murder at the Mansion",
                "A wealthy businessman was found dead in his mansion.",
                new Suspect[]{c1s1, c1s2, c1s3}
        );

        // ===== Crime 2 =====
        Suspect c2s1 = new Suspect(
                "Saged",
                "Has debts",
                "Was in the storage room",
                false);

        Suspect c2s2 = new Suspect(
                "Mohamed",
                "Collector of rare items",
                "Was looking at paintings",
                false);

        Suspect c2s3 = new Suspect(
                "Shaza",
                "Needs money",
                "Said cameras were working",
                true);

        Crime crime2 = new Crime(
                "Diamond Theft",
                "A rare diamond was stolen from the museum.",
                new Suspect[]{c2s1, c2s2, c2s3}
        );

        boolean running = true;

        while (running) {
            System.out.println("\n=== Welcome to Mafioso Game 🕵️‍♀️ ===");
            System.out.println("Choose a Case :");
            System.out.println("1- Murder");
            System.out.println("2- Theft");
            System.out.println("3- Exit");

            int choice;
            try {
                 choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number.");
                sc.next(); // clears the bad input from buffer
                continue;  // restart the loop
            }

            switch (choice) {

                case 1:
                    investigateCrime(crime1, sc);
                    break;

                case 2:
                    investigateCrime(crime2, sc);
                    break;

                case 3:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        System.out.println("Game Over.");
        sc.close();
    }

    // ===== Method  =====
    public static void investigateCrime(Crime crime, Scanner sc) {

        crime.showDetails();

        boolean investigating = true;

        while (investigating) {

            System.out.println("\n1- View Suspects");
            System.out.println("2- View Clues");
            System.out.println("3- Choose the criminal");
            System.out.println("4- Back");

            int option;

            try {
                option = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number.");
                sc.next(); // clears the bad input from buffer
                continue;  // restart the loop
            }

            switch (option) {

                case 1:
                    crime.showSuspects();
                    break;

                case 2:
                    System.out.println("Choose suspect number:");
                    int num = sc.nextInt();
                    if (num >= 1 && num <= crime.suspects.length) {
                        crime.suspects[num - 1].interrogate();
                    } else {
                        System.out.println("Invalid number.");
                    }
                    break;

                case 3:
                    System.out.println("Who is the criminal?");
                    int accuse = sc.nextInt();
                  if(accuse >= 1 && accuse <= crime.suspects.length){
                    if (crime.suspects[accuse - 1].isGuilty) {
                        System.out.println("Correct! You solved the case 🕵️‍♀️");
                    } else {
                        System.out.println("Wrong! The criminal escaped 🚨");
                    }
                    investigating = false;
                  }else{
                      System.out.println("Invalid number.");
                  }

                    break;

                case 4:
                    investigating = false;
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}