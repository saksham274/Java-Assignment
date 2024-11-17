import java.util.Scanner;
public class MaxOfThreeNumbers {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Input three numbers from the user
System.out.print("Enter the first number: ");
double num1 = scanner.nextDouble();
System.out.print("Enter the second number: ");
double num2 = scanner.nextDouble();
System.out.print("Enter the third number: ");
double num3 = scanner.nextDouble();
// Find the maximum using conditional checks
double max;
if (num1 >= num2 && num1 >= num3) {
max = num1;
} else if (num2 >= num1 && num2 >= num3) {
max = num2;
} else {
max = num3;
}
// Display the result
System.out.println("The maximum number is: " + max);
}
}