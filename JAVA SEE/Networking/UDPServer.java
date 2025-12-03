
import java.net.*;

public class UDPServer {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket(9999);
        byte[] buf = new byte[1024];
        System.out.println("UDP Server is waiting for client request...");

        DatagramPacket dp = new DatagramPacket(buf,buf.length);
        ds.receive(dp);

        System.out.println("Client: " + new String(dp.getData()));
        ds.close();
    }
}
