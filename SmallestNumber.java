import java.util.Scanner;

public class SmallestNumber {
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

        // Find the smallest number
        int smallest = findSmallest(numbers);

        // Output: Display the smallest number
        System.out.println("The smallest number is: " + smallest);
    }

    // Method to find the smallest number in an array
    public static int findSmallest(int[] numbers) {
        int smallest = numbers[0]; // Assume the first element is the smallest
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i]; // Update smallest if a smaller element is found
            }
        }

        return smallest;
    }
}

