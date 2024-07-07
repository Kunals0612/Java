// Define a custom thread class extending Thread
class MyThread extends Thread {
    // Override the run method to define thread behavior
    @Override
    public void run() {
        int count = 1;
        while(true) {
            // Print the current count with thread identifier
            System.out.println(count + " MyThread");
            count++;
        }
    }
}

// Main class YieldExample
public class YieldExample {
    public static void main(String[] args) {
        // Create an instance of MyThread
        MyThread t = new MyThread();
        
        // Start the MyThread instance
        t.start();
        
        int count = 1;
        while (true) {
            // Print the current count with thread identifier
            System.out.println(count + " MainThread");
            count++; 
            
            // Yield the current thread (main thread)
            Thread.yield();  
        }
    }
}
