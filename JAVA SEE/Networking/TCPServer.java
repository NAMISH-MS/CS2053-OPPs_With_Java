import java.io.*;
import java.net.*;

public class TCPServer{
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(5555);
        System.out.println("Server is waiting for client request...");
        Socket s = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        System.out.println("Client: " + br.readLine());
        ss.close();
    }
}