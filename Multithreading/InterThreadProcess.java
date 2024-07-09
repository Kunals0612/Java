// Class that handles the shared data between the producer and consumer threads
class MyData {
    int value; // Shared value between producer and consumer
    boolean flag = true; // Flag to indicate whether the producer or consumer should proceed

    // Synchronized method for the producer to set the value
    synchronized public void set(int v) {
        // If the flag is not true (consumer has not yet consumed the previous value), wait
        while (flag != true) {
            try {
                wait(); // Wait until notified
            } catch (Exception e) {
                // Handle exception
            }
        }
        value = v; // Set the new value
        flag = false; // Indicate that the consumer should now consume the value
        notify(); // Notify the waiting consumer
    }

    // Synchronized method for the consumer to get the value
    synchronized public int get() {
        int x = 0;
        // If the flag is not false (producer has not yet produced a new value), wait
        while (flag != false) {
            try {
                wait(); // Wait until notified
            } catch (Exception e) {
                // Handle exception
            }
        }
        x = value; // Get the produced value
        flag = true; // Indicate that the producer can now produce a new value
        notify(); // Notify the waiting producer
        return x; // Return the consumed value
    }
}

// Thread class for the producer
class Producer extends Thread {
    MyData data;

    // Constructor to initialize MyData instance
    public Producer(MyData d) {
        data = d;
    }

    // Run method to execute the thread
    @Override
    public void run() {
        int count = 1;
        while (true) {
            data.set(count); // Produce a value and set it in MyData
            System.out.println("Producer " + count); // Print the produced value
            count++; // Increment the count for the next value
        }
    }
}

// Thread class for the consumer
class Consumer extends Thread {
    MyData data;

    // Constructor to initialize MyData instance
    public Consumer(MyData d) {
        data = d;
    }

    // Run method to execute the thread
    @Override
    public void run() {
        int value;
        while (true) {
            value = data.get(); // Consume the value from MyData
            System.out.println("Consumer " + value); // Print the consumed value
        }
    }
}

// Main class to demonstrate inter-thread communication
public class InterThreadProcess {
    public static void main(String[] args) {
        MyData data = new MyData(); // Create a single MyData instance to be shared
        Producer p = new Producer(data); // Create a producer thread
        Consumer c = new Consumer(data); // Create a consumer thread
        p.start(); // Start the producer thread
        c.start(); // Start the consumer thread
    }
}
