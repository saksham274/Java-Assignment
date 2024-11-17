public class java20 {

    public static void main(String[] args) {

        try {
            // Generate NegativeArraySizeException
            int[] arr = new int[-5]; // Trying to create an array with negative size
        } catch (NegativeArraySizeException e) {
            System.out.println("Caught Exception: Negative array size not allowed.");
            System.out.println("Exception: " + e);
        }

        try {
            // Generate ArithmeticException (Division by zero)
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: Division by zero is not allowed.");
            System.out.println("Exception: " + e);
        }
    }
}

