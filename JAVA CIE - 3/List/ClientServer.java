import java.io.*;
import java.net.*;

public class ClientServer {
    public static void main(String[] args) throws IOException{
        Socket s =new Socket("LocalHost", 9999);
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));

        out.println("Hello, Server!. Client here.");
        System.out.println(in.readLine());

        s.close();
    }    
}
