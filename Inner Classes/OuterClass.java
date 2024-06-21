public class OuterClass {
    void myMethod() {
        class LocalClass {
            void printMessage() {
                System.out.println("Hello from Local Class!");
            }
        }
        LocalClass local = new LocalClass();
        local.printMessage();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.myMethod();
    }
}

