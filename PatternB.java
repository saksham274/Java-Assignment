public class PatternB {
    public static void main(String[] args) {
        // Outer loop for rows
        for (int i = 1; i <= 4; i++) {
            // Inner loop for left part (decreasing numbers)
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            // Inner loop for right part (increasing numbers)
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();  // Move to the next line
        }
    }
}
