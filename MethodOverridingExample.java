 // Superclass (Parent Class)
 class Animal {
    // Method in the superclass
    public void sound() {
        System.out.println("The animal makes a sound");
    }
}

// Subclass (Child Class)
class Dog extends Animal {
    // Overriding the sound() method in the subclass
    @Override
    public void sound() {
        System.out.println("The dog barks");
    }
}

// Another subclass (Child Class)
class Cat extends Animal {
    // Overriding the sound() method in the subclass
    @Override
    public void sound() {
        System.out.println("The cat meows");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        // Creating objects of the subclasses
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Calling the overridden method using different objects
        animal.sound();  // Calls the method from Animal class
        dog.sound();     // Calls the overridden method from Dog class
        cat.sound();     // Calls the overridden method from Cat class
    }
}


