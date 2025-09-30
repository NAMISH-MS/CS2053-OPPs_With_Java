class TablePrinter {
    // Synchronized method to print multiplication table
    synchronized void printTable(int n) {
        System.out.println("Thread " + Thread.currentThread().getName() + " printing table of " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try {
                Thread.sleep(100); // Sleep to simulate delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " finished table of " + n + "\n");
    }

    public static void main(String[] args) {
        TablePrinter tp = new TablePrinter();

        // Thread that prints table of 5
        Thread t1 = new Thread(() -> tp.printTable(5), "T1");
        // Another thread that prints table of 15
        Thread t2 = new Thread(() -> tp.printTable(15), "T2");

        t1.start();
        t2.start();
    }
}