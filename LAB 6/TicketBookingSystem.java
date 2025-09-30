public class TicketBookingSystem {
    private int ticketsAvailable = 5;

    // Synchronized method to book a ticket
    public synchronized boolean bookTicket(String userName) {
        if (ticketsAvailable > 0) {
            System.out.println(userName + " booked ticket #" + ticketsAvailable);
            ticketsAvailable--;
            return true;
        } else {
            System.out.println(userName + " tried to book a ticket, but none are available.");
            return false;
        }
    }

    public static void main(String[] args) {
        TicketBookingSystem system = new TicketBookingSystem();

        // Runnable representing a user trying to book a ticket
        Runnable userTask = () -> {
            String userName = Thread.currentThread().getName();
            system.bookTicket(userName);
        };

        // Creating and starting multiple user threads
        Thread[] users = new Thread[8];
        for (int i = 0; i < users.length; i++) {
            users[i] = new Thread(userTask, "User" + (i + 1));
            users[i].start();
        }

        // Waiting for all threads to finish
        for (Thread t : users) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}