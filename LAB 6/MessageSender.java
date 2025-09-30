public class MessageSender {
    // Synchronized method to ensure messages are printed without mixing
    public synchronized void sendMessage(String msg) {
        System.out.print("[Sending]: ");
        for (char ch : msg.toCharArray()) {
            System.out.print(ch);
            try {
                Thread.sleep(100); // Small delay for each character
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MessageSender sender = new MessageSender();

        // Runnable task for sending messages
        Runnable task1 = () -> sender.sendMessage("Hello from Thread 1!");
        Runnable task2 = () -> sender.sendMessage("Greetings from Thread 2!");

        // Create and start threads
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();
    }
}