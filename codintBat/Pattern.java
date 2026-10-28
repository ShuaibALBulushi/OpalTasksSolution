import java.util.Scanner;

public class Pattern {

    static Scanner sc = new Scanner(System.in);

    static int inputVal() {
        System.out.print("Output for n:");
        int n = sc.nextInt();
        return n;
    }

    public static void main(String[] args) {

        /*
         * Write a Java program that reads n and prints a triangle where row i shows the
         * number i repeated i
         * times
         */

        for (int i = 1; i <= inputVal(); i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        /*
         * Write a Java program that reads n and prints a triangle where each row counts
         * from 1 up, starting
         * with n numbers and losing one number in each row.
         */
        for (int i = inputVal(); i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Write a Java program that reads n and prints a hollow square of stars with
        // side n.
        

        sc.close();
    }
}