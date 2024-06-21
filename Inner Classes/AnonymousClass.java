public class AnonymousClass{
    void myMethod() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from Anonymous Class!");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.myMethod();
    }
}
