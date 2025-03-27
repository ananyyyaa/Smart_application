package java_proj;

import java.util.Scanner;

public class AirTicketService {
    public static void bookTicket() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n--- Air Ticket Booking ---");
        System.out.print("Enter Source City: ");
        String source = scanner.nextLine();
        
        System.out.print("Enter Destination City: ");
        String destination = scanner.nextLine();
        
        System.out.print("Enter Number of Tickets: ");
        int tickets = scanner.nextInt();
        
        double pricePerTicket = 150.0;
        double totalCost = tickets * pricePerTicket;
        
        System.out.println("\nBooking confirmed!");
        System.out.println("From: " + source);
        System.out.println("To: " + destination);
        System.out.println("Total Tickets: " + tickets);
        System.out.println("Total Price: $" + totalCost);
    }
}
