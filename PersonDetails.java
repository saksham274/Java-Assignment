import java.util.Scanner;

// Custom exception class for negative age
class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}

public class PersonDetails {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Input name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Input age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            // Check if age is negative
            if (age < 0) {
                // Throw the custom exception if age is negative
                throw new NegativeAgeException("Age cannot be negative!");
            }

            // If age is valid, print the details
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);

        } catch (NegativeAgeException e) {
            // Catch the custom exception and print the error message
            System.out.println(e.getMessage());
        } finally {
            // Close the scanner object to prevent resource leak
            scanner.close();
        }
    }
}

