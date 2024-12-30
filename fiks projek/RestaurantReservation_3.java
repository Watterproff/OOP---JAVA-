package projekccit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

abstract class Package {
    String name;
    int price;

    public Package(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    abstract String getDescription();
    abstract int calculatePrice();
}

class VeganPackage extends Package {
    public VeganPackage(String name, int price) {
        super(name, price);
    }

    @Override
    String getDescription() {
        return "Vegan Package - " + getName() + ", Price: Rp " + getPrice();
    }

    @Override
    int calculatePrice() {
        return getPrice();
    }
}

class DinnerPackage extends Package {
    public DinnerPackage(String name, int price) {
        super(name, price);
    }

    @Override
    String getDescription() {
        return "Dinner Package - " + getName() + ", Price: Rp " + getPrice();
    }

    @Override
    int calculatePrice() {
        return getPrice();
    }
}

public class RestaurantReservation_3 {
    public void Restoran() {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        // Ask for date
        Date date = null;
        while (date == null) {
            System.out.print("Enter the reservation date (format: DD/MM/YYYY): ");
            String dateStr = scanner.nextLine();
            try {
                date = dateFormat.parse(dateStr);
            } catch (ParseException e) {
                System.out.println("Invalid date format. Please enter date in format DD/MM/YYYY.");
            }
        }

        // Ask for number of guests
        System.out.print("Enter the number of guests: ");
        int totalGuests = scanner.nextInt();
        scanner.nextLine(); // consume the newline character after nextInt()

        // Ask for number of vegans
        System.out.print("Enter the number of vegans among the guests: ");
        int totalVegans = scanner.nextInt();
        scanner.nextLine(); // consume the newline character after nextInt()

        // Initialize ArrayList to store package choices for each guest
        ArrayList<Package> packageChoices = new ArrayList<>();

        // Display vegan package options if there are vegans
        if (totalVegans > 0) {
            System.out.println("Vegan Package Options:");
            for (int i = 1; i <= totalVegans; i++) {
                System.out.println("1. Plant-Based Delight Price: Rp 575,000");
                System.out.println("2. Fresh Harvest Price: Rp 600,000");
                System.out.println("3. Asian Fusion Price: Rp 590,000");
                System.out.println("4. Mediterranean Vegan Price: Rp 610,000");
                System.out.println("5. Earthly Pleasures Price: Rp 575,000");

                System.out.print("Guest " + i + ", please choose a vegan package: ");
                int veganPackageChoice = scanner.nextInt();
                scanner.nextLine(); // consume the newline character after nextInt()

                packageChoices.add(createVeganPackage(veganPackageChoice));
            }
        }

        // Display dinner package options for non-vegans
        int nonVeganGuests = totalGuests - totalVegans;
        System.out.println("Dinner Package Options:");
        for (int i = 1; i <= nonVeganGuests; i++) {
            System.out.println("1. Royal Feast Price: Rp 600,000");
            System.out.println("2. Savory Delight Price: Rp 625,000");
            System.out.println("3. Exotic Fusion Price: Rp 575,000");
            System.out.println("4. Mediterranean Feast Price: Rp 650,000");
            System.out.println("5. Gourmet Indulgence Price: Rp 750,000");

            System.out.print("Guest " + (i + totalVegans) + ", please choose a dinner package: ");
            int packageChoice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character after nextInt()

            packageChoices.add(createDinnerPackage(packageChoice));
        }

        // Ask if there are any kids
        System.out.print("Are there any kids under 4 years old? (yes/no): ");
        String hasKids = scanner.nextLine();

        // Calculate total price
        int totalharga = 0;
        for (Package p : packageChoices) {
            totalharga += p.calculatePrice();
        }

        // Display reservation details
        System.out.println("\nReservation Details:");
        System.out.println("Date: " + dateFormat.format(date));
        System.out.println("Number of Guests: " + totalGuests);
        System.out.println("Package Choices:");
        for (int i = 0; i < packageChoices.size(); i++) {
            System.out.println("Guest " + (i + 1) + ": " + packageChoices.get(i).getDescription());
        }
        if (hasKids.equalsIgnoreCase("yes")) {
            System.out.println("Kid chair will be provided.");
        }
        System.out.println("Total Price: Rp " + totalharga);
    }

    // Method to create vegan package based on user choice
    public static Package createVeganPackage(int choice) {
        switch (choice) {
            case 1:
                return new VeganPackage("Plant-Based Delight", 575000);
            case 2:
                return new VeganPackage("Fresh Harvest", 600000);
            case 3:
                return new VeganPackage("Asian Fusion", 590000);
            case 4:
                return new VeganPackage("Mediterranean Vegan", 610000);
            case 5:
                return new VeganPackage("Earthly Pleasures", 575000);
            default:
                return null;
        }
    }

    // Method to create dinner package based on user choice
    public static Package createDinnerPackage(int choice) {
        switch (choice) {
            case 1:
                return new DinnerPackage("Royal Feast", 600000);
            case 2:
                return new DinnerPackage("Savory Delight", 625000);
            case 3:
                return new DinnerPackage("Exotic Fusion", 575000);
            case 4:
                return new DinnerPackage("Mediterranean Feast", 650000);
            case 5:
                return new DinnerPackage("Gourmet Indulgence", 750000);
            default:
                return null;
        }
    }
}