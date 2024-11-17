public class PatternA {
    public static void main(String[] args) {
        int num = 1;  // Initial number

        // Outer loop for rows
        for (int i = 1; i <= 3; i++) {
            // Inner loop for spaces
            for (int j = 1; j <= (3 - i); j++) {
                System.out.print(" ");  // Print space
            }
            // Inner loop for printing numbers
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(num + " ");
                num++;  // Increment the number
            }
            System.out.println();  // Move to the next line
        }
    }
}

