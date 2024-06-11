//Dynamic dispatch, also known as runtime method dispatch, is a process in object-oriented programming where the method to be invoked is determined at runtime based on the actual object type, rather than the type of the reference variable holding the object. This is a key feature of polymorphism in OOP, allowing different implementations of a method to be executed based on the actual object's class, even when accessed through a reference of the parent class type.
class A {
    // Method m1 in class A
    void m1() {
        System.out.println("A");
    }
}

class B extends A {
    // Overriding method m1 in class B
    void m1() {
        System.out.println("B");
    }
}

class C extends A {
    // Overriding method m1 in class C
    void m1() {
        System.out.println("C");
    }
}

public class Dispatch {
    public static void main(String[] args) {
        // Create instances of each class
        A a = new A();
        B b = new B();
        C c = new C();

        // Declare a reference of type A
        A ref;

        // Assign reference to an object of type A and call m1
        ref = a;
        ref.m1(); // Output: "A"

        // Assign reference to an object of type B and call m1
        ref = b;
        ref.m1(); // Output: "B"

        // Assign reference to an object of type C and call m1
        ref = c;
        ref.m1(); // Output: "C"
    }
}
