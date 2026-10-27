package CustomerFeedbackPortal;

import java.io.*;
import java.util.Scanner;

public class FeedbackPortal {

    static String[] names = new String[5];
    static int[] ratings = new int[5];;
    static String[] comments = new String[100];
    static int count = 0;
    static Scanner sc = new Scanner(System.in);
    static BufferedWriter writer;
    static BufferedReader reader;

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

    static void addFeedback(int rating) throws IOException {
        if (rating >= 1 && rating <= 5) {
            System.out.println("Enter your name: ");
            String name = sc.nextLine();
            sc.nextLine();

            System.out.println("Enter your comment: ");
            String comment = sc.nextLine();

            names[count] = name;
            ratings[count] = rating;
            comments[count] = comment;
            count++;

            System.out.println("Feedback added successfully!");
        } else {
            System.out.println("Error: Rating must be between 1 and 5");
        }
    }

    static void showAll() {
        for (int i = 0; i <= count; i++) {
            System.out.println(names[i] + "|" + ratings[i] + "|" + comments[i]);
        }
    }

    static void showAverage() {
        int sum = 0;
        for (int i = 0; i < ratings.length; i++) {
            sum += i;
        }

        System.out.println("Average Rating: " + (sum / ratings.length));
    }

    static void searchByRating(int rate){
        for(int i=0; i<count; i++){
            if(ratings[i] == rate){
                System.out.println(names[i] + "|" + ratings[i] + "|" + comments[i]);
            }
        }
    }

    public static void main(String[] args) {

        boolean stop = false;

        while (!stop) {
            showMenu();
            String option = sc.nextLine();

            switch (option) {
                case "1":
                    try {
                        System.out.println("Enter your rating(choose from 1 to 5)");
                        int rating = sc.nextInt();
                        addFeedback(rating);
                    } catch (IOException e) {
                        System.out.println("Error:\n" + e.getMessage());
                    }
                    break;
                case "2":
                    showAll();
                    break;
                case "3":
                    showAverage();
                    break;
                case "4":
                    System.out.println("Enter rating to search");
                    int rate = sc.nextInt();
                    searchByRating(rate);
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
