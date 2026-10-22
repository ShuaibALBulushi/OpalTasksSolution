import java.util.Scanner;

public class ATMProject {

    static Scanner sc = new Scanner(System.in);

    static double balance = 1000.00;
    static int pin = 1234;
    static boolean isLogged = false;
    static double depositCounter = 0;
    static double withdrawCounter = 0;
    static double depositeTotal = 0;
    static double withdrawTotal = 0;

    static void login() {
        int count = 0;
        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        while (count < 3) {
            if (enteredPin == pin) {
                System.out.println("Welcome !");
                isLogged = true;
                break;
            } else {
                count++;
                System.out.println((3 - count) + " attempts remaining.");
                if (count == 3) {
                    System.out.println("Card locked");
                    break;
                }
            }
        }
    }

    static void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    static void deposit(double amount) {
        if (amount > 0 && amount < 5000) {
            depositCounter++;
            depositeTotal += amount;
            System.out.println("Deposit successful. Balance: " + (balance + depositeTotal));
        } else {
            System.out.println("Error: amount must be greater than 0 and not more than 5000");
        }
    }

    static void withdraw(double amount) {
        double withdrawSession = 0;
        if (withdrawSession <= 1000) {
            if (amount > 0 && (amount % 10 == 0)) {
                if (amount <= 500) {
                    withdrawCounter++;
                    withdrawSession += (amount + 2);
                    withdrawTotal += (amount + 2);
                    System.out.println("Withdrawal successful. Balance: " + (balance - withdrawTotal));
                }
                else{
                    withdrawCounter++;
                    withdrawSession += (amount + 5);
                    withdrawTotal += (amount + 5);
                    System.out.println("Withdrawal successful. Balance: " + (balance - withdrawTotal));
                }
            }
            else{
                System.out.println("Amount must be greater than 0 and a multiple of 10");
            }
        }
        else{
            System.out.println("total withdrawn in one session cannot pass 1000");
        }
    }

    public static void main(String[] args) {

        boolean stop = false;
        login();

        if (isLogged) {
            do {
                System.out.println("=== ATM Simulator   ===");
                System.out.println("1. Check balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Account tier");
                System.out.println("5. Savings projection");
                System.out.println("6. Receipt summary");
                System.out.println("7. Change PIN");
                System.out.println("0. Exit");
                System.out.print("Please enter a number between 0 and 7: ");
                String input = sc.nextLine();

                switch (input) {
                    case "1":
                        checkBalance();
                        break;
                    case "2":
                        System.out.println("Enter the amount you want to deposite");
                        double amount = sc.nextDouble();
                        sc.nextLine();
                        deposit(amount);
                        break;
                    case "3":
                        System.out.println("Enter the amount you want to withdraw");
                        double withdrawAmount = sc.nextDouble();
                        sc.nextLine();
                        withdraw(withdrawAmount);
                        break;
                    case "4":

                        break;
                    case "5":

                        break;
                    case "6":

                        break;
                    case "7":

                        break;
                    case "0":
                        stop = true;
                        System.out.println("Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid input. Please enter a number between 0 and 9.");
                        System.out.print("\n (menu is shown again)");
                }

            } while (!stop);
            sc.close();
        }
    }
}