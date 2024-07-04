// Define a class MyThread3 that extends the Thread class
class MyThread3 extends Thread {
    // Constructor that accepts a name for the thread
    public MyThread3(String name) {
        super(name);  // Call the superclass (Thread) constructor with the given name
    }

    // Override the run() method to define the behavior of the thread
    public void run() {
        int count = 1;  // Initialize a counter variable count to 1
        while (true) {  // Infinite loop
            System.out.println(count++);  // Print the current value of count and then increment it
            try {
                // Make the thread sleep for 1000 milliseconds (1 second)
                Thread.sleep(1000);
            } catch (Exception e) {
                // Catch and print any exceptions that occur during sleep
                System.out.println(e);
            }
        }
    }
}

// Main class that contains the main method
public class ThreadTest2 {
    public static void main(String[] args) {
        // Create an instance of MyThread3 with the name "MyThread3"
        MyThread3 t = new MyThread3("MyThread3");
        
        // Start the thread by calling the start() method, which
