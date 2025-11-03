import java.io.*;
import java.net.*;
import java.util.Scanner;

public class WhoisLookupSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Step 1: Get the domain name from user
            System.out.print("Enter a domain name (e.g. google.com): ");
            String domain = sc.nextLine();

            // Step 2: Connect to WHOIS server (whois.internic.net) on port 43
            Socket socket = new Socket("whois.internic.net", 43);

            // Step 3: Send the domain name to the server
            OutputStream out = socket.getOutputStream();
            out.write((domain + "\r\n").getBytes());  // send domain + newline
            out.flush();

            // Step 4: Read and display the WHOIS response
            InputStream in = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));

            System.out.println("\n--- WHOIS Information ---");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Step 5: Close everything
            reader.close();
            socket.close();
            sc.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
