import java.util.Scanner;

public class ToolboxApp {

    static Scanner sc = new Scanner(System.in);

    public static void celsiusToFahrenheit() {
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        sc.nextLine();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + " C is equal to " + fahrenheit + " F");
    }

    public static void evenOrOdd() {
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.nextLine();
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    public static void maxOfThree() {
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        sc.nextLine();
        int max2Num = Math.max(num1, num2);
        int max = Math.max(max2Num, num3);
        System.out.println("The maximum of the three numbers is: " + max);
    }

    public static void factorial() {
        System.out.println("Enter a number to calculate its factorial: ");
        int num = sc.nextInt();
        sc.nextLine();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println("The factorial of " + num + " is: " + factorial);
    }

    public static void multiplicationTable() {
        System.out.println("Enter a number to display its multiplication table: ");
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= num; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void triangleOfStars() {
        System.out.println("Enter the number of rows for the triangle of stars: ");
        int rows = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void isPrime() {
        System.out.println("Enter a number to check if it is prime: ");
        int num = sc.nextInt();
        sc.nextLine();

        boolean isPrime = true;

        if (num > 1) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }

        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    public static void reverseNumber() {
        String reversed = "";
        System.out.println("Enter a number to reverse:");
        String numStr = sc.next();
        sc.nextLine();

        for (int i = numStr.length() - 1; i >= 0; i--) {
            reversed += numStr.charAt(i);
        }
        reversed = String.valueOf(Integer.parseInt(reversed));
        System.out.println("The reversed number is: " + reversed);
    }

    public static void numberPyramid() {
        System.out.println("Enter the number of rows for the number pyramid: ");
        int rows = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        boolean stop = false;

        do {
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
            System.out.print("Please enter a number between 0 and 9: ");
            String input = sc.nextLine();

            switch (input) {
                case "1":
                    celsiusToFahrenheit();
                    System.out.println("\n (menu is shown again)");
                    break;
                case "2":
                    evenOrOdd();
                    System.out.println("\n (menu is shown again)");
                    break;
                case "3":
                    maxOfThree();
                    System.out.println("\n (menu is shown again)");
                    break;
                case "4":
                    factorial();
                    System.out.println("\n (menu is shown again)");
                    break;
                case "5":
                    multiplicationTable();
                    System.out.println("\n (menu is shown again)");
                    break;
                case "6":
                    triangleOfStars();
                    System.out.println("\n (menu is shown again)");
                    break;
                case "7":
                    isPrime();
                    System.out.println("\n (menu is shown again)");
                    break;
                case "8":
                    reverseNumber();
                    System.out.println("\n (menu is shown again)");
                    break;
                case "9":
                    numberPyramid();
                    System.out.println("\n (menu is shown again)");
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