class MyClass {
    static int count = 0; // Static variable

    MyClass() {
        count++;
    }

    static void displayCount() {
        System.out.println("Count: " + count);
    }
}

public class java16 {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass.displayCount();

        MyClass obj3 = new MyClass();
        MyClass.displayCount();
    }
}