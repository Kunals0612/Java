// Define a custom thread class extending Thread

class MyThread extends Thread {

    // Override the run method to define thread behavior
    @Override
    public void run() {
        int count = 1;
        while (true) {
            // Print the current count
            System.out.println(count);
            count++;
        }
    }
}

// Main class DeamonThread
public class DeamonThread {

    public static void main(String[] args) throws Exception {
        // Create an instance of MyThread
        MyThread t = new MyThread();

        // Set the thread t as a daemon thread
        t.setDaemon(true);

        // Start the thread
        t.start();

        try {
            // Main thread sleeps for 1 millisecond
            Thread.sleep(1);
        } catch (Exception e) {
            // Catch any exceptions that occur during sleep
            System.out.println(e);
        }
    }
}
