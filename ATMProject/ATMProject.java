import java.util.Scanner;

public class ATMProject {

    static Scanner sc = new Scanner(System.in);

    static double balance = 1000.00;
    static int pin = 1234;
    static boolean isLogged = false;
    static int depositCounter = 0;
    static int withdrawCounter = 0;
    static double depositeTotal = 0;
    static double withdrawTotal = 0;
    static double intrest = 0;
    static double updatedBalance = balance;
    static double withdrawSession = 0;

    static void login() {
        int count = 0;

        while (count < 3) {
            System.out.print("Enter your PIN: ");
            int enteredPin = sc.nextInt();
            sc.nextLine();

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
        System.out.println("Current Balance: " + updatedBalance);
    }

    static void deposit(double amount) {
        if (amount > 0 && amount < 5000) {
            depositCounter++;
            depositeTotal += amount;
            updatedBalance += depositeTotal;
            System.out.println("Deposit successful. Balance: " + updatedBalance);
        } else {
            System.out.println("Error: amount must be greater than 0 and not more than 5000");
        }
    }

    static void withdraw(double amount) {
        if (withdrawSession <= 1000) {
            if (amount > 0 && (amount % 10 == 0)) {
                if (amount <= 500) {
                    withdrawCounter++;
                    withdrawSession += (amount + 2);
                    withdrawTotal += (amount + 2);
                    updatedBalance -= withdrawTotal;
                    System.out.println("Withdrawal successful. Balance: " + updatedBalance);
                } else {
                    withdrawCounter++;
                    withdrawSession += (amount + 5);
                    withdrawTotal += (amount + 5);
                    updatedBalance -= withdrawTotal;
                    System.out.println("Withdrawal successful. Balance: " + updatedBalance);
                }
            } else {
                System.out.println("Amount must be greater than 0 and a multiple of 10");
            }
        } else {
            System.out.println("total withdrawn in one session cannot pass 1000");
        }
    }

    static void accountTier() {
        if (updatedBalance < 1000) {
            intrest = 0.01;
            System.out.println("Tier: Bronze, interest rate: 1%");

        } else if (updatedBalance >= 1000 && updatedBalance < 5000) {
            intrest = 0.02;
            System.out.println("Tier: Silver, interest rate: 2%");

        } else if (updatedBalance >= 5000 && updatedBalance < 20000) {
            intrest = 0.03;
            System.out.println("Tier: Gold, interest rate: 3%");

        } else {
            intrest = 0.04;
            System.out.println("Tier: Platinum, interest rate: 4%");
        }
    }

    static void savingsProjection(int years) {
        if (updatedBalance < 1000) {
            intrest = 0.01;

        } else if (updatedBalance >= 1000 && updatedBalance < 5000) {
            intrest = 0.02;

        } else if (updatedBalance >= 5000 && updatedBalance < 20000) {
            intrest = 0.03;

        } else {
            intrest = 0.04;
        }

        double yearlyBalance = updatedBalance * intrest;
        for (int i = 1; i <= years; i++) {
            updatedBalance += yearlyBalance;
            System.out.println("Year " + i + " : " + updatedBalance);
        }
    }

    static void receiptSummary() {
        System.out.println("Deposits: " + depositCounter + ", total: " + depositeTotal);
        System.out.println("Withdrawals: " + withdrawCounter + ", total: " + withdrawTotal);
        System.out.println("Balance: " + updatedBalance);
    }

    static void changePin() {
        System.out.println("Enter your PIN: ");
        int checkPin = sc.nextInt();
        sc.nextLine();

        if (checkPin == pin) {
            System.out.println("Enter your new PIN: ");
            int newPin = sc.nextInt();
            sc.nextLine();

            if (newPin >= 1000 && newPin <= 9999) {
                System.out.println("Are you sure you want to change the PIN? ");
                String confirming = sc.nextLine();
                sc.nextLine();

                if (confirming.toLowerCase() == "yes") {
                    System.out.println("PIN is changed successfully");
                } else {
                    System.out.println("PIN change request is Canceled");
                }
            } else {
                System.out.println("PIN must be 4-digits (1000 to 9999)");
            }
        } else {
            System.out.println("your PIN is Wrong. try again");
        }
    }

    public static void main(String[] args) {

        boolean stop = false;
        login();

        if (isLogged) {
            do {
                System.out.println("\n=== ATM Simulator   ===");
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
                        accountTier();
                        break;
                    case "5":
                        System.out.println("Enter number of years: ");
                        int years = sc.nextInt();
                        sc.nextLine();
                        savingsProjection(years);
                        break;
                    case "6":
                        receiptSummary();
                        break;
                    case "7":
                        changePin();
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