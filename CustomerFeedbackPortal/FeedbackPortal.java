package CustomerFeedbackPortal;

import java.util.Scanner;

public class FeedbackPortal {

    static void showMenu() {
        System.out.println("\n===== CUSTOMER FEEDBACK PORTAL =====");
        System.out.println("1. Add feedback");
        System.out.println("2. Show all feedback");
        System.out.println("3. Show average rating");
        System.out.println("4. Search by rating");
        System.out.println("5. Delete feedback");
        System.out.println("6. Save to file");
        System.out.println("7 Save and exit");
        System.out.print("Chose: ");
    }

    static String[] names;
    static int[] ratings = new int[5];;
    static String[] comments = new String[100];
    static int count = 0; 

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean stop = false;

        while (!stop) {
            showMenu();
            String option = sc.nextLine();

            switch (option) {
                case "1":

                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;
                case "5":

                    break;
                case "6":

                    break;
                case "7":
                    stop = true;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
        sc.close();

    }
}
