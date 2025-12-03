// 2. Table Printer 
// Write a program where two threads 
// try to print the multiplication table 
// of a number (say 5). 
// Without synchronization, outputs may mix. 
// Add synchronized so that 
// one thread completes the full table 
// before the other starts.

public class Table {
    synchronized void printTable(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n + "x" + i + "=" + n*i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
        System.out.println();
    }

    public static void main(String[] args){
        Table obj = new Table();
        Thread t1 = new Thread(() -> {obj.printTable(5);});
        Thread t2 = new Thread(() -> {obj.printTable(10);});
        t1.start();
        t2.start();
    }
}
