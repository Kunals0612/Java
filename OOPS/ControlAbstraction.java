//Control abstraction is a principle in object-oriented programming that focuses on the use of abstract classes and methods to define common behaviors for a set of related classes. An abstract class cannot be instantiated on its own and is meant to be subclassed by other classes. Abstract methods within an abstract class do not have an implementation and must be overridden by subclasses.

// Abstract class defining common behaviors for all vehicles
abstract class Vehicle {
    // Abstract method to be implemented by subclasses
    abstract void sound();

    // Concrete method providing common functionality for all vehicles
    public void hong() {
        System.out.println("hong hong");
    }
}

// Subclass of Vehicle, providing specific implementation for sound method
class RoadRoller extends Vehicle {
    // Overriding abstract method from Vehicle class
    public void sound() {
        System.out.println("Ghar ghar ghar ye ghar ghar");
    }
}

public class ControlAbstraction {
    public static void main(String[] args) {
        // Creating an instance of RoadRoller using a Vehicle reference
        // Demonstrates polymorphism and control abstraction
        Vehicle v = new RoadRoller();

        // Calling the overridden sound method of RoadRoller
        v.sound(); // Output: Ghar ghar ghar ye ghar ghar

        // Calling the concrete hong method from Vehicle class
        v.hong(); // Output: hong hong
    }
}
