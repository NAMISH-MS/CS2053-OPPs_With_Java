// UDPClient.java
import java.net.*;
import java.util.Scanner;

public class UDPClient {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            InetAddress serverAddress = InetAddress.getByName("localhost");
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.print("Enter message: ");
                String message = sc.nextLine();

                byte[] sendBuffer = message.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, serverAddress, 9876);
                socket.send(sendPacket);

                if (message.equalsIgnoreCase("exit")) break;

                byte[] receiveBuffer = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
                socket.receive(receivePacket);

                String reply = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Server reply: " + reply);
            }

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
