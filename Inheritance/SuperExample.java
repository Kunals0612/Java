class A {
    int x = 10; // Instance variable of class A
}

class B extends A {
    int x = 20; // Instance variable of class B, hiding the variable x of class A

    void display() {
        // This will print the value of the instance variable x of class B
        System.out.println(x);
        // This will print the value of the instance variable x of class A using super keyword
        System.out.println(super.x);
    }
}

public class SuperExample {
    public static void main(String[] args) {
        B b = new B(); // Creating an object of class B
        b.display(); // Calling the display method of class B
    }
}
