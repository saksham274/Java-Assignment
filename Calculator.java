public class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    // Method to display result
    public void display() {
        System.out.println("Welcome to the Calculator program!");
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Calling the add method with two integers
        int sum1 = calculator.add(10, 20);
        System.out.println("Sum of two integers: " + sum1);

        // Calling the add method with three integers
        int sum2 = calculator.add(10, 20, 30);
        System.out.println("Sum of three integers: " + sum2);

        // Calling the add method with two doubles
        double sum3 = calculator.add(10.5, 20.5);
        System.out.println("Sum of two doubles: " + sum3);

        // Calling the display method
        calculator.display();
    }
}

