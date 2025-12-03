// 5. Counter Increment 
// Create a Counter class with a variable count = 0. 
// Start two threads that each increment the 
// counter 1000 times. 
// Without synchronization, 
// the final count may be less than 2000. 
// Use synchronized to ensure correctness.

public class Counter {
    int count = 0;

    public synchronized void increment(){
        count++;
    }

    int getCount(){
        return count;
    }

    public static void main(String[] args){
        Counter counter = new Counter();
         Runnable r = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        } catch (Exception e) {
        }
        System.out.println("Final Count: " + counter.getCount());
    }
}
