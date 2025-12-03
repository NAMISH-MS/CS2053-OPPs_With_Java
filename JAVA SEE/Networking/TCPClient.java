import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) throws Exception{
        Socket s = new Socket("Localhost", 5555);

        PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
        pw.println("Hello from client.");
        s.close();
    }
}
