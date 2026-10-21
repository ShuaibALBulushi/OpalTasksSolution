import java.util.Scanner;


public class ToolboxApp {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        boolean stop = false;

        do{
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Even or odd");
            System.out.println("3. Maximum of three numbers");
            System.out.println("4. Factorial");
            System.out.println("5. Multiplication table");
            System.out.println("6. Triangle of stars");
            System.out.println("7. Prime check");
            System.out.println("8. Reverse a number");
            System.out.println("9. Number pyramid");
            System.out.println("0. Exit");
            System.out.print("Please enter a number between 0 and 9");
            String input = sc.nextLine();
            
            switch(input){
                case "1":
                    
                System.out.print("\n (menu is shown again)");
                    break;
                case "2":
                    System.out.print("\n (menu is shown again)");
                    break;
                case "3":
                    System.out.print("\n (menu is shown again)");
                    break;
                case "4":
                    System.out.print("\n (menu is shown again)");
                    break;
                case "5":
                    System.out.print("\n (menu is shown again)");
                    break;
                case "6":
                    System.out.print("\n (menu is shown again)");
                    break;
                case "7":
                    System.out.print("\n (menu is shown again)");
                    break;
                case "8":
                    System.out.print("\n (menu is shown again)");
                    break;
                case "9":
                    System.out.print("\n (menu is shown again)");
                    break;
                case "0":
                    stop = true;
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid input. Please enter a number between 0 and 9.");
                    System.out.print("\n (menu is shown again)");
            }

        }
        while(!stop);

        sc.close();
    }
}