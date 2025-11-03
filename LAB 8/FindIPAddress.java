import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class FindIPAddress {
    public static void main(String[] args){
        try {
            // Display local host name and IP address
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Local Host Name: " + localHost.getHostName());
            System.out.println("Local IP Address: " + localHost.getHostAddress());

            // Accept a domain name from the user
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a domain name (e.g., www.example.com): ");
            String domain = sc.nextLine();

            // print all ip address of that domain
            InetAddress[] addresses = InetAddress.getAllByName(domain);
            System.out.println("IP Addresses for " + domain + ":");
            for (InetAddress addr : addresses) {
                System.out.println(addr.getHostAddress());
            }
            sc.close();

        } catch (UnknownHostException e) {
            System.out.println("Error: Unable to resolve host.");
        }
    }
    
}
