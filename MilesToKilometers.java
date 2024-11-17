import java.util.Scanner;
public class MilesToKilometers {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Input miles from the user
System.out.print("Enter distance in miles: ");
double miles = scanner.nextDouble();
// Convert miles to kilometers (1 mile = 1.60934 kilometers)
double kilometers = miles * 1.60934;
// Display the result
System.out.println("Distance in kilometers: " + kilometers);
}
}