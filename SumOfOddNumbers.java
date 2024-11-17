import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Read the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create an array to store n elements
        int[] numbers = new int[n];

        // Input: Read the elements into the array
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Find the sum of odd numbers
        int sum = sumOfOddNumbers(numbers);

        // Output: Display the sum of odd numbers
        System.out.println("The sum of all odd numbers in the array is: " + sum);
    }

    // Method to find the sum of odd numbers in an array
    public static int sumOfOddNumbers(int[] numbers) {
        int sum = 0;

        // Iterate through the array and add odd numbers to the sum
        for (int num : numbers) {
            if (num % 2 != 0) { // Check if the number is odd
                sum += num;
            }
        }

        return sum;
    }
}