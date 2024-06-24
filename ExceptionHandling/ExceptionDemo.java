import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a, b, c; // Declare three integer variables a, b, and c
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter two numbers
        System.out.println("Enter 2 Numbers: ");
        a = sc.nextInt(); // Read the first integer from user input and assign it to a
        b = sc.nextInt(); // Read the second integer from user input and assign it to b

        try {
            // Try to perform the division operation
            c = a / b; // Divide a by b and assign the result to c
            System.out.println("a/b : " + c); // Print the result of the division
        } catch (ArithmeticException e) {
            // Catch the ArithmeticException if the denominator is 0
            System.out.println("Denominator should not be 0. Please try again !!"); // Print error message
        }

        // Print a farewell message
        System.out.println("Bye");
    }
}
