import java.io.*;
import java.io.BufferedReader;
import java.net.*;
class Client1{
    public static void main(String[] args) throws Exception
    {
        Socket stk = new Socket("localhost",2000);
        BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());
        System.out.print("Enter message: ");
        String msg;
        msg = keyb.readLine();
        ps.println(msg);
        msg = br.readLine();
        System.out.println("From Server: "+ msg);
        stk.close();
    }
}
public class ClientServer {
    public static void main(String[] args) throws Exception
    {
        ServerSocket ss = new ServerSocket(2000);
        System.out.println("Server is waiting for client request...");
        Socket stk = ss.accept();
        System.out.println("Client connected.");
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());
        String msg;
        msg = br.readLine();
        msg = msg.concat("Kunal");
        ps.println(msg);
    }
}
