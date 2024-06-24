public class NestedTry {
    public static void main(String[] args) {
        try {
            // Declare and initialize an array A with five integer elements
            int A[] = { 10, 20, 50, 0, 9 };

            // Perform division operation
            int c = A[0] / A[1]; // Divides the first element by the second element
            System.out.println(c); // Prints the result of the division

            // Nested try block to handle array access
            try {
                // Attempt to access an element out of the array bounds
                System.out.println(A[8]); // Attempts to access the 9th element (index 8) which does not exist
            } catch (ArrayIndexOutOfBoundsException e) {
                // Catch block for handling array index out-of-bounds access
                System.out.println("Array Index out of Bound");
            }

        } catch (ArithmeticException e) {
            // Catch block for handling division by zero
            System.out.println("Cannot divide by zero");
        }
    }
}
