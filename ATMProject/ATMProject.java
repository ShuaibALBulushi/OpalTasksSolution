import java.util.Scanner;

public class ATMProject {

    static Scanner sc = new Scanner(System.in);

    static double balance = 1000.00;
    static int pin = 1234;

    static void login() {
        int count = 0;
        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        while(count < 3){
            if(enteredPin == pin){
                System.out.println("Welcome !");
                break;
            } else{
                count++;
                System.out.println((3 - count) + " attempts remaining.");
                if(count == 3){
                    System.out.println("Card locked");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        // Part 1: Login
        
    }
}