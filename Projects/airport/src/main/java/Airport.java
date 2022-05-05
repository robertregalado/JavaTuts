import java.util.ArrayList;
import java.util.List;

public class Airport {

    private Passenger passenger;

    public void addPassengers(Passenger passenger) {
        //insert code
        List<String> passengers = new ArrayList<>();
        passengers.add(String.valueOf(passenger));
        //this.passenger = passenger;
    }

    public Passenger dequeue() {
        //insert code
        return passenger;

    }
}

class Passenger {
    private String name;
    private int age;
    private boolean isPregnant;
    private boolean withChildren;

    Passenger(String name, int age, boolean isPregnant, boolean withChildren) {
        //insert code
        this.name = name;
        this.age = age;
        this.isPregnant = isPregnant;
        this.withChildren = withChildren;
    }

    //insert code
}
