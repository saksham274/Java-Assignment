// Base class (Superclass)
class Animal {
    // Instance variables
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method in the superclass
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    // Method to display name
    public void display() {
        System.out.println("Animal's name is: " + name);
    }
}

// Subclass (Child class)
class Dog extends Animal {
    // Constructor of subclass
    public Dog(String name) {
        super(name); // Calling the superclass constructor
    }

    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println(name + " says Woof Woof!");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Creating an object of Animal class
        Animal animal = new Animal("Generic Animal");
        animal.makeSound();  // Calls the makeSound method of Animal class
        animal.display();    // Calls the display method of Animal class

        System.out.println();

        // Creating an object of Dog class (which inherits from Animal)
        Dog dog = new Dog("Buddy");
        dog.makeSound();  // Calls the overridden makeSound method of Dog class
        dog.display();    // Calls the inherited display method of Animal class
    }
}

