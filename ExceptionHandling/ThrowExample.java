public class ThrowExample {
    public static void main(String[] args) {
        try {
            checkAge(15); // This will cause an exception
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older");
        } else {
            System.out.println("Age is valid");
        }
    }
}
