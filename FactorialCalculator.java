public class FactorialCalculator {
    public static void main(String[] args) {
    int number = 12; // The number for which factorial is to be calculated
    long factorial = 1; // Use long to handle large values
    // Calculate factorial
    for (int i = 1; i <= number; i++) {
    factorial *= i;
    }
    // Display the result
    System.out.println("The factorial of " + number + " is: " +
    factorial);
    }
    }
   