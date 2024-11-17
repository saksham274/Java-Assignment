public class Person2 {
    
    // Instance variables
    String name;
    int age;

    // Parameterized constructor
    public Person2(String name, int age) {
        this.name = name;  // Initialize name with the passed parameter
        this.age = age;    // Initialize age with the passed parameter
    }

    // Method to display the values
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an object of Person2 class using the parameterized constructor
        Person2 Person21 = new Person2("Alice", 25);
        Person2 Person22 = new Person2("Bob", 30);

        // Displaying the values
        Person21.display();
        Person22.display();
    }
}


