package CustomerFeedbackPortal;

import java.io.*;
import java.util.Scanner;

public class FeedbackPortal {

    static String[] names = new String[5];
    static int[] ratings = new int[5];
    static String[] comments = new String[100];
    static int count = 0;
    static Scanner sc = new Scanner(System.in);

    static void showMenu() {
        System.out.println("\n===== CUSTOMER FEEDBACK PORTAL =====");
        System.out.println("1. Add feedback");
        System.out.println("2. Show all feedback");
        System.out.println("3. Show average rating");
        System.out.println("4. Search by rating");
        System.out.println("5. Delete feedback");
        System.out.println("6. Save to file");
        System.out.println("7. Save and exit");
        System.out.print("Choose: ");
    }

    static void addFeedback(int rating) throws IOException {
        if (rating >= 1 && rating <= 5) {
            System.out.println("Enter your name: ");
            String name = sc.nextLine();

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
        if (count == 0) {
            System.out.println("No feedback available.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(names[i] + "|" + ratings[i] + "|" + comments[i]);
        }
    }

    static void showAverage() {
        if (count == 0) {
            System.out.println("No feedback available to calculate average.");
            return;
        }

        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += ratings[i];
        }
        
        double avg = (double) sum / count;
        System.out.println("Average Rating: " + avg);
    }

    static void searchByRating(int rate) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (ratings[i] == rate) {
                System.out.println(names[i] + "|" + ratings[i] + "|" + comments[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No feedback found with rating " + rate);
        }
    }

    static void deleteFeedback() {
        if (count == 0) {
            System.out.println("No feedback to delete.");
            return;
        }
        showAll();
        
        try {
            System.out.print("Enter the index of the feedback to delete (0 to " + (count - 1) + "): ");
            int index = Integer.parseInt(sc.nextLine());

            if (index >= 0 && index < count) {
                for (int i = index; i < count - 1; i++) {
                    names[i] = names[i + 1];
                    ratings[i] = ratings[i + 1];
                    comments[i] = comments[i + 1];
                }
                count--;
                System.out.println("Feedback deleted successfully!");
            } else {
                System.out.println("Error: Invalid index.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid integer for the index.");
        }
    }

    static void saveFeedback() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("feedback.txt"))) {
            for (int i = 0; i < count; i++) {
                writer.write(names[i] + "|" + ratings[i] + "|" + comments[i]);
                writer.newLine();
            }
            System.out.println("Feedback saved to file successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void loadFeedback() {
        try (BufferedReader reader = new BufferedReader(new FileReader("feedback.txt"))) {
            count = 0;
            String line;
            boolean hasContent = false;
            
            System.out.println("\n--- Feedback Loaded From File ---");
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 3) {
                    names[count] = parts[0];
                    ratings[count] = Integer.parseInt(parts[1]); // Can throw NumberFormatException
                    comments[count] = parts[2];
                    
                    System.out.println(names[count] + "|" + ratings[count] + "|" + comments[count]);
                    
                    count++;
                    hasContent = true;
                }
            }
            
            if (!hasContent) {
                System.out.println("No feedback found in the file.");
            }
            
            System.out.println("Feedback loaded from file successfully.");
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
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
                        System.out.println("Enter your rating (choose from 1 to 5):");
                        int rating = Integer.parseInt(sc.nextLine());
                        addFeedback(rating);
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Please enter a valid integer for the rating.");
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
                    try {
                        System.out.println("Enter rating to search:");
                        int rate = Integer.parseInt(sc.nextLine());
                        searchByRating(rate);
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Please enter a valid integer for the rating.");
                    }
                    break;
                case "5":
                    deleteFeedback();
                    break;
                case "6":
                    saveFeedback();
                    loadFeedback();
                    break;
                case "7":
                    saveFeedback();
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