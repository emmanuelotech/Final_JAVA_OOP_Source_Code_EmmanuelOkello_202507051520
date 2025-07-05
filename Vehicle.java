package passengersource;

public class Vehicle {
    private    String id;

    
    
     public Vehicle(String id) 
     
     {
        
         
         this.id = id;
    }

    public void pickupPassenger(Passenger passenger) 
    {
        System.out.println("Vehicle:  " + id + " \n"+ "Pickup Cordinates: " +
    passenger.getPickup() + " TO: " + passenger.getDestination());
    }
}
