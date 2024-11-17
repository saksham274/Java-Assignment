import java.util.Scanner;

public class LCMCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Read two numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Find the LCM using the formula
        int lcm = findLCM(num1, num2);

        // Output: Display the result
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    // Method to calculate LCM using the formula: LCM(a, b) = (a * b) / HCF(a, b)
    public static int findLCM(int a, int b) {
        // Calculate the HCF first
        int hcf = findHCF(a, b);
        // Use the formula to calculate LCM
        return (a * b) / hcf;
    }

    // Method to calculate HCF using Euclidean Algorithm
    public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

