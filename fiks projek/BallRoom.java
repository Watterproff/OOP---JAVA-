package projekccit;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BallRoom extends Menu {
    static Scanner scn = new Scanner(System.in);
    static final double PRICE_INCREASE_PER_ATTENDEE = 0.2; // 20% price increase per 100 attendees
    static final double PRICE_INCREASE_PER_HOUR = 0.025; // 2.5% price increase per hour

    public void ballroom() {
        BallRoom br = new BallRoom();
        String customerName;
        Date orderDate;
        int numberOfGuests;
        int eventDuration;
        int eventPackage;

        System.out.println("Welcome to BallRoom booking menu");
        System.out.println("Enter customer name:");
        customerName = scn.nextLine();

        System.out.println("Enter order date (DD/MM/YY):");
        orderDate = parseDate(scn.nextLine());

        System.out.println("Enter number of guests:");
        numberOfGuests = scn.nextInt();

        System.out.println("Enter event duration (in hours):");
        eventDuration = scn.nextInt();

        System.out.println("Choose event package:");
        System.out.println("1. Wedding");
        System.out.println("2. Fair");
        System.out.println("3. Seminar");
        System.out.println("4. Conference");

        eventPackage = scn.nextInt();

        switch (eventPackage) {
            case 1:
                System.out.println("Wedding Package");
                System.out.println("");
                br.Wedding(numberOfGuests, eventDuration);
                break;
            case 2:
                br.Fair(numberOfGuests);
                break;
            case 3:
                br.Seminar(numberOfGuests);
                break;
            case 4:
                br.Conference(numberOfGuests);
                break;
        }
    }

    public void Wedding(int numberOfGuests, int eventDuration) {
        int initialPrice = 45000000;
        int totalPrice = initialPrice;

        int additionalAttendees = (int) Math.ceil((double) (numberOfGuests - 100) / 100);
        totalPrice += additionalAttendees * (initialPrice * PRICE_INCREASE_PER_ATTENDEE);

        totalPrice += eventDuration * (initialPrice * PRICE_INCREASE_PER_HOUR);

        int foodPerPerson = 1; // Adjust this as per your requirements
        int totalFood = foodPerPerson * numberOfGuests;

        System.out.println("Benefits of choosing the Wedding Package:");
        System.out.println("1. Food for " + numberOfGuests + " people");
        System.out.println("2. Decorations");
        System.out.println("3. Sound system");
        System.out.println("4. 5 normal rooms for family");
        System.out.println("5. 1 presidential suite for the groom");
        System.out.println("Total Price: Rp " + totalPrice);
    }

    public void Fair(int numberOfGuests) {
        int pricePerPerson = 200000;
        int totalPrice = pricePerPerson * numberOfGuests;

        System.out.println("You've chosen the Fair Package");
        System.out.println("Payment includes booth tents");
        System.out.println("Total Price: Rp " + totalPrice);
    }

    public void Seminar(int numberOfGuests) {
        int pricePerPerson = 100000;
        int totalPrice = pricePerPerson * numberOfGuests;

        System.out.println("You've chosen the Seminar Package");
        System.out.println("Payment includes " + numberOfGuests + " chairs and food");
        System.out.println("Total Price: Rp " + totalPrice);
    }

    public void Conference(int numberOfGuests) {
        int pricePerPerson = 150000;
        int totalPrice = pricePerPerson * numberOfGuests;

        System.out.println("You've chosen the Conference Package");
        System.out.println("Payment includes " + numberOfGuests + " chairs and light snacks");
        System.out.println("Total Price: Rp " + totalPrice);
    }

    private static Date parseDate(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        try {
            return sdf.parse(dateStr);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use DD/MM/YY format.");
            return null;
        }
    }
}
