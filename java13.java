class Animal {
    public void eat() {
        System.out.println("Animal eats food.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks.");
    }
}

class GoldenRetriever extends Dog {
    public void fetch() {
        System.out.println("Golden Retriever fetches.");
    }
}

public class java13 {
    public static void main(String[] args) {
        GoldenRetriever goldenRetriever = new GoldenRetriever();
        goldenRetriever.eat();
        goldenRetriever.bark();
        goldenRetriever.fetch();
    }
}