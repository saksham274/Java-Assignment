public class Person1 {

    // Instance variables
    String name;
    int age;

    // 0-argument constructor
    public Person1() {
        // Assigning default values
        name = "John Doe";
        age = 30;
        System.out.println("0-argument constructor called.");
    }

    // Method to display the values
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an object using the 0-argument constructor
        Person1 Person1 = new Person1();
        
        // Displaying the values initialized by the 0-argument constructor
        Person1.display();
    }
}

