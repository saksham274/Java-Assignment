public class Man {

    // Instance variables
    String name;
    int age;

    // 0-argument constructor
    public Man() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("0-argument constructor called.");
    }

    // Parameterized constructor with one argument (name)
    public Man(String name) {
        this.name = name;
        this.age = 0;  // Default age
        System.out.println("Constructor with one argument (name) called.");
    }

    // Parameterized constructor with two arguments (name, age)
    public Man(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor with two arguments (name, age) called.");
    }

    // Method to display the values
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors (demonstrating constructor overloading)

        // Using 0-argument constructor
        Man Man1 = new Man();
        Man1.display();

        // Using constructor with one argument (name)
        Man Man2 = new Man("Alice");
        Man2.display();

        // Using constructor with two arguments (name, age)
        Man Man3 = new Man("Bob", 30);
        Man3.display();
    }
}

