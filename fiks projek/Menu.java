
package projekccit;


import java.util.Scanner;
import projekccit.RoomReservation;
import projekccit.RoomReservationrev2;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        
        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.println("Room Reservation selected");
                    RoomReservationrev2 obj = new RoomReservationrev2();
                    obj.main(args);
                    // Add your code for room reservation here
                    break;
                case 2:
                    System.out.println("Spa Reservation selected");
                    spareservation2 obj1 = new spareservation2();
                    obj1.spa();
                    // Add your code for spa reservation here
                    break;
                case 3:
                    System.out.println("Dinner Reservation selected");
                    RestaurantReservation_3 obj2 = new RestaurantReservation_3();
                    obj2.Restoran();
                    // Add your code for dinner reservation here
                    break;
                case 4:
                    System.out.println("Ballroom Reservation selected");
                    BallRoom obj3 = new BallRoom();
                    obj3.ballroom();
                    // Add your code for ballroom reservation here
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                    break;
            }
        } while (choice != 5);
        
        scanner.close();
    }
    
    public static void displayMenu() {
        System.out.println("Reservation Menu");
        System.out.println("1. Room Reservation");
        System.out.println("2. Spa Reservation");
        System.out.println("3. Dinner Reservation");
        System.out.println("4. Ballroom Reservation");
        System.out.println("5. Exit");
    }
}

