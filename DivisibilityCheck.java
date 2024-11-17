import java.util.Scanner;
public class DivisibilityCheck {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Input two numbers from the user
System.out.print("Enter the number to be checked: ");
int number = scanner.nextInt();
System.out.print("Enter the divisor: ");
int divisor = scanner.nextInt();
// Check if the number is divisible by the divisor
if (divisor == 0) {
System.out.println("Division by zero is not allowed.");
} else if (number % divisor == 0) {
System.out.println(number + " is divisible by " + divisor + ".");
} else {
System.out.println(number + " is not divisible by " + divisor +
".");
}
}
}