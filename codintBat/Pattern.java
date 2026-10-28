import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
         * Write a Java program that reads n and prints a triangle where row i shows the
         * number i repeated i
         * times
         */
        System.out.print("Output for n:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
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
        System.out.print("Output for n:");
        int n2 = sc.nextInt();
        for(int i=n2; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}