package codingBat;
import java.util.Scanner;


public class Pattern {

    static Scanner sc = new Scanner(System.in);

    static int inputVal() {
        System.out.print("Output for n:");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        // 1 - Write a Java program that reads n and prints a hollow square of stars
        // with
        // side n.
        int n3 = inputVal();
        for (int i = 1; i <= n3; i++) {
            for (int j = 1; j <= n3; j++) {
                if (i == 1 || i == n3 || j == 1 || j == n3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        /*
         * 2 -
         * Write a Java program that reads n and prints a triangle where row i shows the
         * number i repeated i
         * times
         */
        int n = inputVal();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        /*
         * 3 -
         * Write a Java program that reads n and prints a triangle where each row counts
         * from 1 up, starting
         * with n numbers and losing one number in each row.
         */
        int n2 = inputVal();
        for (int i = n2; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /*
         * 4-
         * Write a Java program that reads n and prints a full diamond of stars. The
         * widest row has 2n - 1 stars.
         * Output for n = 5
         */
        int n4 = inputVal();

        for (int var2 = 1; var2 <= n4; ++var2) {
            for (int var3 = var2; var3 < n4; ++var3) {
                System.out.print(" ");
            }

            for (int var5 = 1; var5 <= 2 * var2 - 1; ++var5) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int var4 = n4 - 1; var4 >= 1; --var4) {
            for (int var6 = n4; var6 > var4; --var6) {
                System.out.print(" ");
            }

            for (int var7 = 1; var7 <= 2 * var4 - 1; ++var7) {
                System.out.print("*");
            }

            System.out.println();
        }

        /*
         * Write a Java program that reads n and prints a hollow diamond of stars. Only
         * the edge of the
         * diamond is printed.
         */

        int n5 = inputVal();
        for (int var2 = 1; var2 <= n5; ++var2) {
            for (int var3 = var2; var3 < n5; ++var3) {
                System.out.print(" ");
            }

            int maxCols = 2 * var2 - 1;
            for (int var5 = 1; var5 <= maxCols; ++var5) {
                if (var5 == 1 || var5 == maxCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        for (int var4 = n5 - 1; var4 >= 1; --var4) {
            for (int var6 = n5; var6 > var4; --var6) {
                System.out.print(" ");
            }

            int maxCols = 2 * var4 - 1;
            for (int var7 = 1; var7 <= maxCols; ++var7) {
                if (var7 == 1 || var7 == maxCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        /*
         * Write a Java program that reads n and prints an X made of stars inside an n
         * by n square.
         * Output for n = 5
         */
        int n6 = inputVal();

        for (int i = 1; i <= n6; i++) {
            for (int j = 1; j <= n6; j++) {
                if (j == i || j == (n6 - i + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Write a Java program that reads n and prints an hourglass of stars. The
        // widest row has 2n - 1 stars.
        int n7 = inputVal();

        for (int var4 = n7 - 1; var4 >= 1; --var4) {
            for (int var6 = n7; var6 > var4; --var6) {
                System.out.print(" ");
            }

            for (int var7 = 1; var7 <= 2 * var4 - 1; ++var7) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int var2 = 1; var2 <= n7; ++var2) {
            for (int var3 = var2; var3 < n7; ++var3) {
                System.out.print(" ");
            }

            for (int var5 = 1; var5 <= 2 * var2 - 1; ++var5) {
                System.out.print("*");
            }

            System.out.println();
        }
        /*
         * Write a Java program that reads n and prints a triangle of letters where each
         * row starts from the n-th
         * letter and goes backwards
         */

        int n8 = inputVal();
        for (int i = 0; i < n8; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (65 + n8 - 1 - j));
            }
            System.out.println();
        }

        /*
         * Write a Java program that reads n and prints a triangle of odd numbers,
         * continuing the count from
         * row to row without resetting.
         */

        int n10 = inputVal();
        int num = 1;
        for (int i = 1; i <= n10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num += 2;
            }
            System.out.println();
        }

        /*
         * Write a Java program that reads an odd n and prints a plus sign made of stars
         * inside an n by n
         * square.
         */

        int n11 = inputVal();
        int mid = (n11 / 2) + 1;
        for (int i = 1; i <= n11; i++) {
            for (int j = 1; j <= n11; j++) {
                if (i == mid || j == mid) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}