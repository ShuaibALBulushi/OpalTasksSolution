package ArraysandMethods;

import java.util.Scanner;

public class ArraysTask {

    static Scanner sc = new Scanner(System.in);

    public static double sumArray(int[] arr) {
        double result;

        result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }

    public static double averageArray(int[] arr) {
        return sumArray(arr) / arr.length;
    }

    public static int findMax(int[] arr) {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int countEven(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count += 1;
            }
        }
        return count;
    }

    public static int indexOf(int[] arr, int target) {
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                return index;
            }
        }
        return index;
    }

    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            reversed[(arr.length - 1) - i] = arr[i];
        }
        return reversed;
    }

    public static int[] readGrades(int size){
        int[] grades = new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter grade " + i+1 + ": ");
            grades[i] = sc.nextInt();
        }
        return grades;
    }

    public static int countPassed(int[] grades){
        int countpassed = 0;
        for(int i=0; i<grades.length; i++){
            if(grades[i] >= 50){
                countpassed++;
            }
        }
        return countpassed;
    }

    public static void main(String[] args) {

        int[] numbers = { 12, 7, 25, 3, 18, 9, 30, 14 };

        // Question 1: Sum and Average
        System.out.println("Sum: " + sumArray(numbers));
        System.out.println("Average: " + averageArray(numbers));

        // Question 2: Largest and Smallest
        System.out.println("Max: " + findMax(numbers));
        System.out.println("Min: " + findMin(numbers));
        System.out.println("Difference: " + (findMax(numbers) - findMin(numbers)));

        // Question 3: Count and Search
        System.out.println("Even numbers: " + countEven(numbers));

        System.out.print("Enter a number to search for: ");
        int target = sc.nextInt();

        if (indexOf(numbers, target) == -1) {
            System.out.println(target + " not found");
        } else {
            System.out.println(target + " found at index " + indexOf(numbers, target));
        }

        // Question 4: Reverse the Array
        System.out.println("Original: " + java.util.Arrays.toString(numbers));
        System.out.println("Reversed: " + java.util.Arrays.toString(reverseArray(numbers)));

        // Question 5: Student Grades
        System.out.print("Enter the number of students: ");
        int size = sc.nextInt();
        int[] grades = new int[size];
        grades = readGrades(size);

        System.out.println("Passed: " + countPassed(grades));
        System.out.println("Failed: " + (size - countPassed(grades)));
    }
}
