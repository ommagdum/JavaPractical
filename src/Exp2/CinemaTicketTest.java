package Exp2;
/*
Create a class called CinemaTicket that includes a static variable ticketPrice to store the price of a movie ticket.
Each ticket object has instance variables customerName and ticketsBooked. Provide a method
calculateTotalCost that computes the total cost by multiplying ticketsBooked by ticketPrice. Implement a static
method changeTicketPrice to modify the ticket price. Write a test application named CinemaTicketTest, create
two ticket bookings, display their total costs, then modify the ticket price and display the updated costs.
 */

class CinemaTicket{
    private static double ticketPrice;
    private String customerName;
    private int ticketsBooked;

    CinemaTicket(String name, int tickets){
        this.customerName = name;
        this.ticketsBooked = tickets;
    }

    double calculateTotalCost(){
        return ticketsBooked * ticketPrice;
    }

    static void changeTicketPrice(double price){
        ticketPrice = price;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getTicketsBooked() {
        return ticketsBooked;
    }

    public void setTicketsBooked(int ticketsBooked) {
        this.ticketsBooked = ticketsBooked;
    }
}
public class CinemaTicketTest {
    public static void main(String[] args){
        CinemaTicket t1 = new CinemaTicket("Om",10);
        CinemaTicket t2 = new CinemaTicket("Aniket",20);

        CinemaTicket.changeTicketPrice(100);
        System.out.println("Price Set To 100 Rs.");
        System.out.println("Name : " + t1.getCustomerName() + " - "
                + "Tickets Booked : " + t1.getTicketsBooked() + " - "
                + "Cost : " + t1.calculateTotalCost() + " Rs.");
        System.out.println("Name : " + t2.getCustomerName() + " - "
                + "Tickets Booked : " + t2.getTicketsBooked() + " - "
                + "Cost : " + t2.calculateTotalCost() + " Rs.");

        CinemaTicket.changeTicketPrice(200);
        System.out.println("Price Updated To 200 Rs.");
        System.out.println("Name : " + t1.getCustomerName() + " - "
                + "Tickets Booked : " + t1.getTicketsBooked() + " - "
                + "Cost : " + t1.calculateTotalCost() + " Rs.");
        System.out.println("Name : " + t2.getCustomerName() + " - "
                + "Tickets Booked : " + t2.getTicketsBooked() + " - "
                + "Cost : " + t2.calculateTotalCost() + " Rs.");
    }
}
