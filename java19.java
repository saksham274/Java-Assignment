class CustomException extends Exception {
    CustomException(String message) {
        super(message);
    }
}

public class java19 {

    // Method that can throw an exception
    public static void divide(int a, int b) throws CustomException {
        if (b == 0) {
            throw new CustomException("Division by zero is not allowed.");
        }
        System.out.println("Result: " + (a / b));
    }

    public static void main(String[] args) {
        try {
            // Trying to divide numbers and handle potential exceptions
            divide(10, 0);
        } 
        catch (CustomException e) {
            // Handling custom exception
            System.out.println("Caught Exception: " + e.getMessage());
        }
        catch (ArithmeticException e) {
            // Handling ArithmeticException
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } 
        finally {
            // Code that will always run
            System.out.println("Finally block executed.");
        }

        // Another example of throw
        try {
            throw new ArithmeticException("Manually thrown ArithmeticException");
        } catch (ArithmeticException e) {
            System.out.println("Caught manually thrown ArithmeticException: " + e.getMessage());
        }
    }
}