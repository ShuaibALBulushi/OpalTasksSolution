package ArraysandMethods;
import java.util.Scanner;

public class ArraysTask {

    static Scanner sc = new Scanner(System.in);

    public static double sumArray(int[] arr){
        double result;

        result = 0;
        for(int i=0; i<arr.length; i++){
            result += arr[i];
        }
        return result;
    }

    

    public static void main(String[] args) {
        
        int[] numbers = {12, 7, 25, 3, 18, 9, 30, 14};

        // Question 1: Sum and Average
        System.out.println("Sum: " + sumArray(numbers));
    }
}
