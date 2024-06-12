class Circle2 {
    public double radius;

    // Constructor to initialize the radius
    public Circle2(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }

    public double perimeter() {
        return 2 * 3.14 * radius;
    }
}

class Cylinder2 extends Circle2 {
    public double height;

    // Constructor to initialize the radius and height
    public Cylinder2(double radius, double height) {
        super(radius);  // Call the constructor of the Circle class
        this.height = height;
    }

    public double volume() {
        return area() * height;
    }
}

public class InheritanceExample2 {
    public static void main(String[] args) {
        Circle2 c1 = new Circle2(7);  // Initialize radius
        Cylinder2 c2 = new Cylinder2(7, 10);  // Initialize radius and height

        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        System.out.println(c2.volume());
    }
}
