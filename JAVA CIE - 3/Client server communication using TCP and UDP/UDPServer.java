// UDPServer.java
import java.net.*;

public class UDPServer {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(9876);
            byte[] receiveBuffer = new byte[1024];
            byte[] sendBuffer;

            System.out.println("UDP Server running...");

            while (true) {
                DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
                socket.receive(receivePacket);

                String clientMsg = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Client says: " + clientMsg);

                if (clientMsg.equalsIgnoreCase("exit")) break;

                String reply = "Hello from UDP Server!";
                sendBuffer = reply.getBytes();

                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();

                DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, clientAddress, clientPort);
                socket.send(sendPacket);
            }

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
