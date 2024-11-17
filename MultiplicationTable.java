import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Read the number for which multiplication table is to be generated
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = scanner.nextInt();

        // Input: Read the range (up to which number the table should be generated)
        System.out.print("Enter the range (up to which number): ");
        int range = scanner.nextInt();

        // Generate and print the multiplication table
        System.out.println("Multiplication table of " + number + " up to " + range + ":");
        for (int i = 1; i <= range; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}


