// Class that provides a method to display a string character by character
class MyData {

    // Method to display each character of the string
    void display(String str) {
        // Synchronized block to ensure thread-safe access to the display method
        synchronized (this) {
            // Loop through each character in the string
            for (int i = 0; i < str.length(); i++) {
                // Print the current character
                System.out.print(str.charAt(i));
            }
        }
    }
}

// Thread class that will use MyData's display method
class MyThread1 extends Thread {
    MyData d;

    // Constructor to initialize MyData instance
    public MyThread1(MyData d) {
        this.d = d;
    }

    // Run method to execute the thread
    @Override
    public void run() {
        // Call the display method with a long string
        d.display("rigjirhghrehgrqmcnmvgrngrngveruhgnreg reqhngvhregnrgregh nnerh ggr hghng rehgureg uhgerung hrghure gergheunherwhwge");
    }
}

// Another thread class that will also use MyData's display method
class MyThread2 extends Thread {
    MyData data;

    // Constructor to initialize MyData instance
    public MyThread2(MyData d) {
        this.data = d;
    }

    // Run method to execute the thread
    @Override
    public void run() {
        // Call the display method with a shorter string
        data.display("Welcome all");
    }
}

// Main class to demonstrate synchronization
public class DemoSynchronisation {
    public static void main(String[] args) {
        // Create a single MyData instance to be shared by both threads
        MyData d = new MyData();

        // Create thread instances, passing the shared MyData instance
        MyThread1 t1 = new MyThread1(d);
        MyThread2 t2 = new MyThread2(d);

        // Start both threads
        t1.start();
        t2.start();
    }
}
