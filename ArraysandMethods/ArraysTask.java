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

    public static double averageArray(int[] arr){
        return sumArray(arr) / arr.length;
    }

    public static int findMax(int[] arr){
        int max = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMin(int[] arr){
        int min = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int countEven(int[] arr){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        
        int[] numbers = {12, 7, 25, 3, 18, 9, 30, 14};

        // Question 1: Sum and Average
        System.out.println("Sum: " + sumArray(numbers));
        System.out.println("Average: " + averageArray(numbers));

        // Question 2: Largest and Smallest
        System.out.println("Max: " + findMax(numbers));
        System.out.println("Min: " + findMin(numbers));
        System.out.println("Difference: " + (findMax(numbers) - findMin(numbers)));

        // Question 3: Count and Search
        System.out.println("Even numbers: " + countEven(numbers));
    }
}
