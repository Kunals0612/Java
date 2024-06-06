public class StringBufferExample {
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append("World");
        String message = sb.toString();
        System.out.println(message);
    }
}
