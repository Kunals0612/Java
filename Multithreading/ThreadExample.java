// Define a class MyThread that extends the Thread class
class MyThread extends Thread {
    // Override the run() method to define the behavior of the thread
    public void run() {
        int i = 1; // Initialize a counter variable i to 1
        while (true) { // Infinite loop
            System.out.println(i + " Hello"); // Print the current value of i followed by "Hello"
            i++; // Increment the counter variable i
        }
    }
}

// Main class that contains the main method
public class ThreadExample {
    public static void main(String[] args) {
        // Create an instance of MyThread
        MyThread t = new MyThread();
        // Start the thread by calling the start() method, which internally calls the
        // run() method
        t.start();

        int i = 1; // Initialize a counter variable i to 1
        while (true) { // Infinite loop
            System.out.println(i + " World"); // Print the current value of i followed by "World"
            i++; // Increment the counter variable i
        }
    }
}
