import java.util.Scanner;

class Employee {
    private int empId;
    private String empName;
    private double basicSalary;

    public Employee(int empId, String empName, double basicSalary) {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
    }

    public void displayGrossSalary() {
        // Assuming a simple calculation for gross salary
        double hra = 0.2 * basicSalary; // 20% House Rent Allowance
        double da = 0.1 * basicSalary; // 10% Dearness Allowance

        double grossSalary = basicSalary + hra + da;
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Gross Salary: " + grossSalary);
    }
}

public class java14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();

        System.out.print("Enter Employee Name: ");
        String empName = sc.next();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        Employee employee = new Employee(empId, empName, basicSalary);
        employee.displayGrossSalary();
    }
}

