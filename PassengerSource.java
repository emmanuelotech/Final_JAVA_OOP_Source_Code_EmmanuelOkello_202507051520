package passengersource;

import java.util.Random;

public class PassengerSource {
    private Company company;
    private Random random = new Random();

    public PassengerSource(Company company) {
        this.company = company;
    }

    public boolean requestPickup() {
        int pickupX = random.nextInt(101);
        int pickupY = random.nextInt(101);
        int destX = random.nextInt(101);
        int destY = random.nextInt(101);

        Location pickup = new Location(pickupX, pickupY);
        Location destination = new Location(destX, destY);

        Passenger passenger = new Passenger(pickup, destination);

        System.out.println("Pickup location: " + pickup + ", Destination location: " + destination);

        return company.scheduleVehicle(passenger);
    }

    public static void main(String[] args) {
        Company company = new Company();
        company.addVehicle(new Vehicle("ACANADIRO COACHES"));
        company.addVehicle(new Vehicle("KAKIRA SCHOOL TRUCK"));

        PassengerSource source = new PassengerSource(company);

        for (int i = 1; i <= 3; i++) {
            boolean result = source.requestPickup();
            System.out.println("Request " + i + ": " + (result ? "true": "false"));
            System.out.println();
        }
    }
}
