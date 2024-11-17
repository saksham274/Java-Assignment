import java.util.Arrays;
import java.util.Scanner;

public class MedianCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Read the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Input: Read the elements of the array
        int[] numbers = new int[n];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Find and print the median
        double median = findMedian(numbers);
        System.out.println("The median is: " + median);
    }

    // Method to find the median
    public static double findMedian(int[] numbers) {
        // Sort the array in ascending order
        Arrays.sort(numbers);

        int length = numbers.length;
        
        // If the number of elements is odd, return the middle element
        if (length % 2 != 0) {
            return numbers[length / 2];
        } else {
            // If the number of elements is even, return the average of the two middle elements
            return (numbers[(length / 2) - 1] + numbers[length / 2]) / 2.0;
        }
    }
}

