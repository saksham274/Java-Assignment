import java.util.Scanner;
 public class SwapNumbers {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 // Input two numbers
 System.out.print("Enter the first number: ");
 int num1 = scanner.nextInt();
 System.out.print("Enter the second number: ");
 int num2 = scanner.nextInt();
 // Swap without a third variable
 num1 = num1 + num2;
 num2 = num1- num2;
 num1 = num1- num2;
 // Display swapped numbers
 System.out.println("After swapping:");
 System.out.println("First number: " + num1);
 System.out.println("Second number: " + num2);
 }
 }