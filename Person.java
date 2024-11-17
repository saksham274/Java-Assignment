public class Person {
    
    // Instance variables
    String name;
    int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the values
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an object of Person class using the parameterized constructor
        Person person1 = new Person("John", 25);
        Person person2 = new Person("Alice", 30);

        // Displaying the values
        person1.display();
        person2.display();
    }
}


