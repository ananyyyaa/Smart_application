package java_proj;
import java.util.Scanner;

public class SmartCity {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n==== Welcome to Smart City Guide ====");
            System.out.println("1. Hotels");
            System.out.println("2. Transportation");
            System.out.println("3. Air Ticket Booking");
            System.out.println("4. Shopping");
            System.out.println("5. City News");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    HotelService.displayHotels();
                    break;
                case 2:
                    TransportService.displayTransport();
                    break;
                case 3:
                    AirTicketService.bookTicket();
                    break;
                case 4:
                    ShoppingService.displayShopping();
                    break;
                case 5:
                    CityNewsService.displayNews();
                    break;
                case 6:
                    System.out.println("Exiting Smart City Guide. Goodbye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}
