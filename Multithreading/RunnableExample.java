// Define a class My that implements the Runnable interface
class My implements Runnable {
    // Override the run() method to define the behavior of the thread
    public void run() {
        int i = 1;  // Initialize a counter variable i to 1
        while (true) {  // Infinite loop
            System.out.println(i + " Hello");  // Print the current value of i followed by "Hello"
            i++;  // Increment the counter variable i
        }
    }
}

// Main class that contains the main method
public class RunnableExample {
    public static void main(String[] args) {
        // Create an instance of My
        My m = new My();
        // Create a new Thread object, passing the My instance (Runnable) to its constructor
        Thread t = new Thread(m);
        // Start the thread by calling the start() method, which internally calls the run() method of My
        t.start();

        int i = 1;  // Initialize a counter variable i to 1
        while (true) {  // Infinite loop
            System.out.println(i + " World");  // Print the current value of i followed by "World"
            i++;  // Increment the counter variable i
        }
    }
}
