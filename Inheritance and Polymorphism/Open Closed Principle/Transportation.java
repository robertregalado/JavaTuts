import java.util.*;

public class Transportation{
    private List<Passenger> passengers = new ArrayList<Passenger>();
    private double totalEarnings = 0;

    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }

    public double calculateTotalEarnings(){
        for (Passenger passenger : passengers){
            totalEarnings += passenger.getRideCost();
        }
        return totalEarnings;
    }

}