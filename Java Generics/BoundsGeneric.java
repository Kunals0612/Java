@SuppressWarnings("unchecked")
class MyArray1<T> {
    T A[]; // Array of type T
    int length = 0;

    // Constructor to initialize the array with the given size
    public MyArray1(Class<T> clazz, int size) {
        A = (T[]) java.lang.reflect.Array.newInstance(clazz, size);
    }

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
    // A generic method that accepts MyArray1 of any type
    static <T> void fun(MyArray1<T> obj) {
        obj.display();
    }

    public static void main(String[] args) {
        MyArray1<String> ma1 = new MyArray1<>(String.class, 10);
        ma1.append("Hi");
        ma1.append("Bye");

        MyArray1<Integer> ma2 = new MyArray1<>(Integer.class, 10);
        ma2.append(10);
        ma2.append(20);

        fun(ma1);
        fun(ma2);
    }
}
