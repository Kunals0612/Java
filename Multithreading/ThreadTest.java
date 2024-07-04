// Define a class MyThread1 that extends the Thread class
class MyThread1 extends Thread {
    // Constructor that accepts a name for the thread
    public MyThread1(String name) {
        super(name);  // Call the superclass (Thread) constructor with the given name
        setPriority(Thread.MIN_PRIORITY + 3);  // Set the thread's priority to MIN_PRIORITY + 3
    }
}

// Main class that contains the main method
public class ThreadTest {
    public static void main(String[] args) {
        // Create an instance of MyThread1 with the name "My Thread1 "
        MyThread1 t = new MyThread1("My Thread1 ");
        
        // Print the unique ID of the thread
        System.out.println(t.getId());
        
        // Print the name of the thread
        System.out.println(t.getName());
        
        // Print the priority of the thread
        System.out.println(t.getPriority());
        
        // Start the thread by calling the start() method, which internally calls the run() method
        t.start();
        
        // Print the state of the thread (e.g., RUNNABLE, BLOCKED, WAITING, etc.)
        System.out.println(t.getState());
        
        // Print whether the thread is alive (true if the thread has been started and has not yet died)
        System.out.println(t.isAlive());
    }
}
