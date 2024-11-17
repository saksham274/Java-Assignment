import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Read the number from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Variable to store the count of digits
        int digitCount = 0;

        // Check for zero, as it has 1 digit
        if (number == 0) {
            digitCount = 1;
        } else {
            // Count the number of digits
            while (number != 0) {
                number /= 10;  // Remove the last digit
                digitCount++;   // Increment the digit count
            }
        }

        // Output: Display the number of digits
        System.out.println("The number of digits is: " + digitCount);
    }
}


