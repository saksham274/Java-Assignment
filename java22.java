// Custom exception for handling specific arithmetic errors
class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super(message);
    }
}

public class java22 {

    // Method to perform division and modulo operations
    public static void calculate(int a, int b) throws CustomArithmeticException {
        try {
            // Try division
            int divisionResult = a / b;
            System.out.println("Result of Division: " + divisionResult);
        } catch (ArithmeticException e) {
            throw new CustomArithmeticException("Error: Division by zero is not allowed.");
        }

        try {
            // Try modulo operation
            int moduloResult = a % b;
            System.out.println("Result of Modulo: " + moduloResult);
        } catch (ArithmeticException e) {
            throw new CustomArithmeticException("Error: Modulo by zero is not allowed.");
        }
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        try {
            // Call the method to calculate
            calculate(num1, num2);
        } catch (CustomArithmeticException e) {
            // Catch custom exception and print the error message
            System.out.println(e.getMessage());
        }
    }
}

