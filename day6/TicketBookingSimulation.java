class TicketBooking {
    private int totalSeats;

    public TicketBooking(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    // Synchronized method to prevent race conditions
    public synchronized void bookTicket(String userName, int seatsRequested) {
        System.out.println(userName + " is trying to book " + seatsRequested + " seat(s)...");

        // Simulate processing delay
        try {
            Thread.sleep(1000); // 1 second delay
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        if (seatsRequested <= totalSeats) {
            System.out.println("Booking successful for " + userName + " for " + seatsRequested + " seat(s).");
            totalSeats -= seatsRequested;
        } else {
            System.out.println("Booking failed for " + userName + ". Not enough seats.");
        }

        System.out.println("Remaining seats: " + totalSeats + "\n");
    }
}

class User extends Thread {
    private String userName;
    private int seatsToBook;
    private TicketBooking ticketBooking;

    public User(String userName, int seatsToBook, TicketBooking ticketBooking) {
        this.userName = userName;
        this.seatsToBook = seatsToBook;
        this.ticketBooking = ticketBooking;
    }

    public void run() {
        ticketBooking.bookTicket(userName, seatsToBook);
    }
}

public class TicketBookingSimulation {
    public static void main(String[] args) {
        TicketBooking bookingSystem = new TicketBooking(10); // Total 10 seats available

        // Create multiple users (threads)
        User user1 = new User("Alice", 4, bookingSystem);
        User user2 = new User("Bob", 5, bookingSystem);
        User user3 = new User("Charlie", 3, bookingSystem);

        // Start threads
        user1.start();
        user2.start();
        user3.start();
    }
}
