import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Read the upper limit (range) from the user
        System.out.print("Enter the range (N): ");
        int N = scanner.nextInt();

        // Calculate the sum of natural numbers from 1 to N
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i; // Add each number to the sum
        }

        // Output: Display the result
        System.out.println("The sum of natural numbers up to " + N + " is: " + sum);
    }
}

