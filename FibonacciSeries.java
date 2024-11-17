import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of terms in the Fibonacci series
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        // Handle edge cases
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Initialize the first two terms of the Fibonacci series
            int first = 0, second = 1;

            System.out.println("Fibonacci series up to " + n + " terms:");

            for (int i = 1; i <= n; i++) {
                System.out.print(first + " ");

                // Calculate the next term
                int next = first + second;
                first = second;
                second = next;
            }
        }
    }
}

