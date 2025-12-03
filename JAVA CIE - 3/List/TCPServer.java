
import java.io.*;
import java.net.*;


public class TCPServer { // Server class
    public static void main(String[] args) throws IOException{ // main method
        ServerSocket ss = new ServerSocket(9999); // server socket on port 9999
        System.out.println("Server Started. Waiting for Client..."); // server started message
        Socket s = ss.accept(); // accept client connection

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream())); // input stream from client
        PrintWriter out = new PrintWriter(s.getOutputStream(), true); // output stream to client

        String msg = in.readLine(); // read message from client
        System.out.println("Client : " + msg); // print client message
        out.println("Server received: " + msg);// send response to client

        s.close();
        ss.close();
    }
    
}