import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Read a binary number from the user
        System.out.print("Enter a binary number: ");
        String binary = scanner.next();

        // Convert binary to decimal
        int decimal = binaryToDecimal(binary);

        // Output: Display the decimal equivalent
        System.out.println("The decimal equivalent of binary " + binary + " is: " + decimal);
    }

    // Method to convert binary to decimal
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();

        // Loop through each character of the binary string
        for (int i = 0; i < length; i++) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, length - 1 - i);  // Add 2^(position) if it's '1'
            }
        }
        return decimal;
    }
}
