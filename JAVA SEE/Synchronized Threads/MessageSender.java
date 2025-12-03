// 3. Message Sender 
// Create a MessageSender class with 
// a method sendMessage(String msg) 
// that prints a message with a small delay. 
// Run two threads trying to send messages 
// at the same time. Use synchronization 
// so that full messages are printed clearly 
// without mixing.


public class MessageSender {
    public synchronized void sendMessage(String msg){
        System.out.println("Sending Message: " + msg);
        try {
            Thread.sleep(400);
            } catch (Exception e) {
            }
                System.out.println(msg);
        }
        
        public static void main(String[] args){
            MessageSender sender =  new MessageSender();
            Thread t1 = new Thread(() -> {sender.sendMessage("Hello from Thread 1");});
            Thread t2 = new Thread(() -> {sender.sendMessage("Hello from Thread 2");});
            t1.start();
            t2.start();
    }
}
