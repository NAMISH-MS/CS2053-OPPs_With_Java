// 4. Ticket Booking System 
// Simulate a ticket booking system 
// with 5 tickets available. 
// Create multiple threads representing 
// users trying to book tickets. 
// Use synchronized so that two users 
// cannot book the same ticket.

public class TicketBooking {
    private int tickets = 5;

    public synchronized void bookTickets(String name){
        if (tickets > 0){
            System.out.println(name + "Booked ticket number: ");
            tickets--;
            System.out.println("Tickets Left: "+ tickets);
        }else{
            System.out.println("Sorry" + name + ", no tickets available.");
        }
    }

    public static void main(String[] args){
        TicketBooking booking = new TicketBooking();

        for(int i = 1; i<=10; i++){
            String user = "User-" + i;
            new Thread(() -> { booking.bookTickets(user);}).start();
        }
    }
}

