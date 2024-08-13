@SuppressWarnings("unchecked")
interface A{}
class B implements A{}
class C extends B{}
class MyArray1<T extends Number> {
    T A[]; // Array of type T
    int length = 0;

    // Constructor to initialize the array with the given size
    

    public void append(T v) {
        if (length < A.length) {
            A[length++] = v;
        } else {
            System.out.println("Array is full");
        }
    }

    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.println(A[i]);
        }
    }
}

public class BoundsGeneric {
    public static void main(String[] args) {
       
    }
}
