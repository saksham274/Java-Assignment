// Superclass Vehicle
class Vehicle {
    // Protected instance variables
    protected String regnNumber;
    protected double speed;
    protected String color;
    protected String ownerName;

    // Constructor to initialize the instance variables
    public Vehicle(String regnNumber, double speed, String color, String ownerName) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }

    // Method to show general vehicle data
    public void showData() {
        System.out.println("This is a vehicle class.");
    }
}

// Subclass Bus
class Bus extends Vehicle {
    // Private instance variable specific to Bus
    private int routeNumber;

    // Constructor to initialize Bus-specific and Vehicle data
    public Bus(String regnNumber, double speed, String color, String ownerName, int routeNumber) {
        super(regnNumber, speed, color, ownerName);  // Call to superclass constructor
        this.routeNumber = routeNumber;
    }

    // Overriding showData() method to display Bus details
    @Override
    public void showData() {
        super.showData();  // Call the showData() method of the superclass (Vehicle)
        System.out.println("Vehicle Type: Bus");
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Route Number: " + routeNumber);
    }
}

// Subclass Car
class Car extends Vehicle {
    // Private instance variable specific to Car
    private String manufacturerName;

    // Constructor to initialize Car-specific and Vehicle data
    public Car(String regnNumber, double speed, String color, String ownerName, String manufacturerName) {
        super(regnNumber, speed, color, ownerName);  // Call to superclass constructor
        this.manufacturerName = manufacturerName;
    }

    // Overriding showData() method to display Car details
    @Override
    public void showData() {
        super.showData();  // Call the showData() method of the superclass (Vehicle)
        System.out.println("Vehicle Type: Car");
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Manufacturer Name: " + manufacturerName);
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        // Create objects of Bus and Car
        Bus bus = new Bus("KA-01-1234", 80.0, "Yellow", "John Doe", 22);
        Car car = new Car("KA-05-6789", 120.0, "Red", "Alice Smith", "Toyota");

        // Call showData() on Bus and Car objects
        System.out.println("Bus Details:");
        bus.showData();
        
        System.out.println("\nCar Details:");
        car.showData();
    }
}


