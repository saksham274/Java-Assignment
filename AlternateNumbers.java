import java.util.Scanner;

public class AlternateNumbers {
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

        // Print every alternate number from the array
        System.out.println("Every alternate number from the array:");
        for (int i = 0; i < n; i += 2) {  // Increment index by 2 to get alternate numbers
            System.out.print(numbers[i] + " ");
        }
    }
}

