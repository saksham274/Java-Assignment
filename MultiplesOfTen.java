import java.util.Scanner;

public class MultiplesOfTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Read the interval (range) from the user
        System.out.print("Enter the start of the interval: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end of the interval: ");
        int end = scanner.nextInt();

        System.out.println("Multiples of 10 between " + start + " and " + end + ":");

        // Find the first multiple of 10 in the range
        int firstMultiple = (start % 10 == 0) ? start : start + (10 - start % 10);

        // Print all multiples of 10 between the interval
        for (int i = firstMultiple; i <= end; i += 10) {
            System.out.print(i + " ");
        }
    }
}


