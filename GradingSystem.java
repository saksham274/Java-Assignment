import java.util.Scanner;
public class GradingSystem {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Input the percentage from the user
System.out.print("Enter your percentage: ");
double percentage = scanner.nextDouble();
// Determine the grade based on the percentage
char grade;
if (percentage >= 90) {
grade = 'A';
} else if (percentage >= 80) {
grade = 'B';
} else if (percentage >= 70) {
grade = 'C';
} else if (percentage >= 60) {
grade = 'D';
} else if (percentage >= 40) {
grade = 'E';
} else {
grade = 'F';
}
// Display the grade
System.out.println("Your grade is: " + grade);
}
}