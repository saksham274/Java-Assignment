 // Interface 1
 interface interfaceA {
    void methodA1();
    void methodA2();
}

// Interface 2
interface InterfaceB {
    void methodB1();
    void methodB2();
}

// Interface 3
interface InterfaceC {
    void methodC1();
    void methodC2();
}

// New interface inheriting from InterfaceA, InterfaceB, and InterfaceC
interface NewInterface extends interfaceA, InterfaceB, InterfaceC {
    void newMethod();
}

// Concrete class
class ConcreteClass {
    void concreteClassMethod() {
        System.out.println("Method from ConcreteClass");
    }
}

// Class implementing NewInterface and inheriting from ConcreteClass
class ImplementationClass extends ConcreteClass implements NewInterface {

    // Methods from InterfaceA
    public void methodA1() {
        System.out.println("Method A1");
    }

    public void methodA2() {
        System.out.println("Method A2");
    }

    // Methods from InterfaceB
    public void methodB1() {
        System.out.println("Method B1");
    }

    public void methodB2() {
        System.out.println("Method B2");
    }

    // Methods from InterfaceC
    public void methodC1() {
        System.out.println("Method C1");
    }

    public void methodC2() {
        System.out.println("Method C2");
    }

    // Method from NewInterface
    public void newMethod() {
        System.out.println("New Method from NewInterface");
    }
}

// Method that accepts InterfaceA
public class java18{

    static void interfaceAMethod(interfaceA obj) {
        obj.methodA1();
        obj.methodA2();
    }

    // Method that accepts InterfaceB
    static void interfaceBMethod(InterfaceB obj) {
        obj.methodB1();
        obj.methodB2();
    }

    // Method that accepts InterfaceC
    static void interfaceCMethod(InterfaceC obj) {
        obj.methodC1();
        obj.methodC2();
    }

    // Method that accepts NewInterface
    static void newInterfaceMethod(NewInterface obj) {
        obj.newMethod();
    }

    public static void main(String[] args) {
        // Create an object of the ImplementationClass
        ImplementationClass obj = new ImplementationClass();

        // Pass object to the methods
        interfaceAMethod(obj);
        interfaceBMethod(obj);
        interfaceCMethod(obj);
        newInterfaceMethod(obj);
    }
}

