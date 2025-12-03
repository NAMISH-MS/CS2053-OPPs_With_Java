// Runnable example.

// Create a second thread
class NewThread implements Runnable{
    Thread t;
    NewThread(){
        //Create a new, second thread
        t = new Thread(this, "Demo Thread");
        System.out.println("Child Thread: " + t);
        t.start(); // Start the thread
    }

    public void run(){
        try {
            for(int i = 5; i > 0; i--){
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e) 
        {
            System.out.println("Child Interrupted");
        }
        System.out.println("Exiting Child Thread");
    }
}


public class ThreadDemo {
    public static void main(String args[]) {
    new NewThread(); // create a new thread
    
        try {
            for(int i = 5; i > 0; i--) {
            System.out.println("Main Thread: " + i);
            Thread.sleep(1000);
        }
        } 
        catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
