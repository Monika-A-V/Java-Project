package Final_Test_Paper_2;
/*Assume plane tickets are being sold. Show use of program where 2 users
 are booking tickets and system is ensuring at one time one person is buying ticket*/

class TicketBookingSystem
{
    private int availableTickets;

    public TicketBookingSystem(int totalTickets) 
    {
        availableTickets = totalTickets;
    }

    public synchronized void bookTicket(String passengerName, int numTickets)
    {
        if (availableTickets >= numTickets) 
        {
            System.out.println(passengerName + " successfully booked " + numTickets + " tickets.");
            availableTickets -= numTickets;
        } else {
            System.out.println(passengerName + " could not book " + numTickets + " tickets. Available tickets: " + availableTickets);
        }
    }
}

class PassengerThread extends Thread {
    private String passengerName;
    private int numTickets;
    private TicketBookingSystem bookingSystem;

    public PassengerThread(String name, int tickets, TicketBookingSystem system) {
        passengerName = name;
        numTickets = tickets;
        bookingSystem = system;
    }

    public void run()
    {
        bookingSystem.bookTicket(passengerName, numTickets);
    }
}
public class Q1 {

	public static void main(String[] args) 
	{
		 TicketBookingSystem bookingSystem = new TicketBookingSystem(10);

	        PassengerThread passenger1 = new PassengerThread("Passenger 1", 3, bookingSystem);
	        PassengerThread passenger2 = new PassengerThread("Passenger 2", 5, bookingSystem);

	        passenger1.start();
	        passenger2.start();
	    }}