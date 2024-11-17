import java.util.Scanner;

public class java17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Convert number to string for easy digit extraction
        String str = Integer.toString(num);
        int sum = 0;
        
        // Loop to form and sum consecutive two-digit numbers
        for (int i = 0; i < str.length() - 1; i++) {
            // Extract consecutive digits and form a two-digit number
            int pair = Integer.parseInt(str.substring(i, i + 2));
            sum += pair;
        }
        
        System.out.println("Sum of consecutive digit numbers: " + sum);
    }
}