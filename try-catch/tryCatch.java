import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int multi;
    
        try{
            System.out.print("Enter a number to multiply by 2: ");
            int num = sc.nextInt();
            multi = num * 2;
            System.out.println("The result is: " + multi);

        }
        catch(Exception InputMismatchException){
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        sc.close();
        System.out.println("Done.");
    }
}
