//Encapsulation is one of the fundamental principles of object-oriented programming (OOP). It refers to the bundling of data (attributes) and methods (functions) that operate on that data into a single unit or class, and restricting direct access to some of the object's components. This is typically achieved using access modifiers, such as private, protected, and public.

// Encapsulation Example in Java
class Encapsulate {
    // Private variables, data hiding
    private String name;
    private int roll;

    // Public method to set the values of private variables
    public void set(String name, int roll) {
        // 'this' keyword is used to refer to the current object's instance variables
        this.name = name;
        this.roll = roll;
    }

    // Public method to get the value of 'name'
    public String getName() {
        return name;
    }

    // Public method to get the value of 'roll'
    public int getRoll() {
        return roll;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // Creating an instance of Encapsulate class
        Encapsulate en = new Encapsulate();

        // Setting the values of private variables via public method
        en.set("abc", 123);

        // Accessing the values of private variables via public methods
        System.out.println(en.getName()); // Output: abc
        System.out.println(en.getRoll()); // Output: 123
    }
}
