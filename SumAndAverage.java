import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Read the size of the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Input: Create an array and read elements
        int[] numbers = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate sum and average
        int sum = calculateSum(numbers);
        double average = calculateAverage(sum, n);

        // Output: Display the sum and average
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
    }

    // Method to calculate sum of the array elements
    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    // Method to calculate average
    public static double calculateAverage(int sum, int count) {
        return (double) sum / count;  // Cast to double to get a floating-point result
    }
}
