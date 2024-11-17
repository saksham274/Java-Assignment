import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Read a decimal number from the user
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        // Convert decimal to binary
        String binary = decimalToBinary(decimal);

        // Output: Display the binary equivalent
        System.out.println("The binary equivalent of decimal " + decimal + " is: " + binary);
    }

    // Method to convert decimal to binary
    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();

        // Loop to divide the number by 2 and capture remainders
        while (decimal > 0) {
            binary.insert(0, decimal % 2);  // Insert the remainder at the beginning
            decimal /= 2;  // Divide the number by 2
        }

        // Return the binary string (handle case for decimal 0)
        return binary.length() == 0 ? "0" : binary.toString();
    }
}
