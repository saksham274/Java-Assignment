import java.util.Scanner;

// Base class for all 3D objects
class ThreeDObject {
    // Method to calculate the surface area (to be overridden in subclasses)
    public double wholeSurfaceArea() {
        return 0.0; // Default implementation (not used directly)
    }

    // Method to calculate the volume (to be overridden in subclasses)
    public double volume() {
        return 0.0; // Default implementation (not used directly)
    }
}

// Derived class Box (rectangular prism)
class Box extends ThreeDObject {
    private double length, width, height;

    // Constructor to initialize dimensions of the box
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Overriding the surface area method for Box
    @Override
    public double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    // Overriding the volume method for Box
    @Override
    public double volume() {
        return length * width * height;
    }
}

// Derived class Cube (a special case of Box)
class Cube extends Box {

    // Constructor to initialize the side of the cube
    public Cube(double side) {
        super(side, side, side);  // A cube has equal sides for length, width, and height
    }

    // The methods are inherited from the Box class, so no need to override them again
}

// Derived class Cylinder
class Cylinder extends ThreeDObject {
    private double radius, height;

    // Constructor to initialize dimensions of the cylinder
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Overriding the surface area method for Cylinder
    @Override
    public double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Overriding the volume method for Cylinder
    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

// Derived class Cone
class Cone extends ThreeDObject {
    private double radius, height;

    // Constructor to initialize dimensions of the cone
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Overriding the surface area method for Cone
    @Override
    public double wholeSurfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    // Overriding the volume method for Cone
    @Override
    public double volume() {
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }
}

public class ThreeDObjectTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a Box object
        System.out.print("Enter the length, width, and height of the Box: ");
        double boxLength = sc.nextDouble();
        double boxWidth = sc.nextDouble();
        double boxHeight = sc.nextDouble();
        Box box = new Box(boxLength, boxWidth, boxHeight);
        
        // Create a Cube object
        System.out.print("Enter the side of the Cube: ");
        double cubeSide = sc.nextDouble();
        Cube cube = new Cube(cubeSide);

        // Create a Cylinder object
        System.out.print("Enter the radius and height of the Cylinder: ");
        double cylinderRadius = sc.nextDouble();
        double cylinderHeight = sc.nextDouble();
        Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);

        // Create a Cone object
        System.out.print("Enter the radius and height of the Cone: ");
        double coneRadius = sc.nextDouble();
        double coneHeight = sc.nextDouble();
        Cone cone = new Cone(coneRadius, coneHeight);

        // Display the surface area and volume of each object
        System.out.println("\nBox Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Box Volume: " + box.volume());

        System.out.println("\nCube Surface Area: " + cube.wholeSurfaceArea());
        System.out.println("Cube Volume: " + cube.volume());

        System.out.println("\nCylinder Surface Area: " + cylinder.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.volume());

        System.out.println("\nCone Surface Area: " + cone.wholeSurfaceArea());
        System.out.println("Cone Volume: " + cone.volume());

        sc.close();
    }
}

