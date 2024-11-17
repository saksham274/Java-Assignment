import java.util.Scanner;

public class AdmissionEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // Process each student's marks and check eligibility
        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter marks for student " + i);

            // Input marks for Mathematics, Physics, and Chemistry
            System.out.print("Marks in Mathematics: ");
            int maths = scanner.nextInt();

            System.out.print("Marks in Physics: ");
            int physics = scanner.nextInt();

            System.out.print("Marks in Chemistry: ");
            int chemistry = scanner.nextInt();

            // Calculate the total marks in all three subjects and total of Maths & Physics
            int totalMarks = maths + physics + chemistry;
            int totalMathsPhysics = maths + physics;

            // Check eligibility based on the given conditions
            if ((maths >= 60 && physics >= 50 && chemistry >= 40 && totalMarks >= 200) || totalMathsPhysics >= 150) {
                System.out.println("Student " + i + " is eligible for admission.");
            } else {
                System.out.println("Student " + i + " is not eligible for admission.");
            }
        }
    }
}

