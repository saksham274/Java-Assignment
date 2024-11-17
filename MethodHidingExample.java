// Superclass
class Animal {
    // Static method in the superclass
    public static void sound() {
        System.out.println("The animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    // Static method in the subclass (hiding the superclass method)
    public static void sound() {
        System.out.println("The dog barks");
    }
}

public class MethodHidingExample {
    public static void main(String[] args) {
        // Calling the static methods using class names
        Animal.sound();  // Calls the method in the Animal class
        Dog.sound();     // Calls the method in the Dog class (method hiding)

        // Creating objects and calling the static methods
        Animal animal = new Animal();
        Animal dog = new Dog();  // Reference of type Animal but object of type Dog

        animal.sound();  // Calls the method in Animal class (static methods are resolved by reference type)
        dog.sound();     // Calls the method in Animal class due to reference type (static method hiding)
    }
}


