public class MultipleCatch {
    public static void main(String[] args) {
        try {
            // Declare and initialize an array A with five integer elements
            int A[] = {10, 40, 30, 40, 50};

            // Perform division operation
            int c = A[0] / A[1];  // Divides the first element by the second element
            System.out.println(c);  // Prints the result of the division

            // Access an element out of the array bounds
            System.out.println(A[6]);  // Attempts to access the 7th element (index 6) which does not exist

        } catch (ArithmeticException e) {
            // Catch block for handling division by zero
            System.out.println("Cannot divide by zero");

        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch block for handling array index out-of-bounds access
            System.out.println("Array index out of bounds");

        }
    }
}
