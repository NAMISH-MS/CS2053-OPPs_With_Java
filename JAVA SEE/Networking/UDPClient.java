import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket();

        String msg = "Hello from UDP client.";
        byte[] buf = msg.getBytes();
        DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("localhost"), 9999);
        ds.send(dp);
        ds.close();
    }
}
