import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportSampleTest {
    Airport airport;
    @Before
    public void init(){
        airport = new Airport();
    }

    @Test
    public void ___DS___OO___CS___SL___with_elderly_in_line_sub_group1() {
        Passenger passenger1 = new Passenger("Henry", 27, false, false);
        Passenger passenger2 = new Passenger("Jen", 25, true, false);
        Passenger passenger3 = new Passenger("Nica", 67, false, false);

        airport.addPassengers(passenger1);
        airport.addPassengers(passenger2);
        airport.addPassengers(passenger3);

        assertEquals(passenger3, airport.dequeue());

    }

    @Test
    public void ___DS___OO___CS___SL___pregnant_and_with_children_in_line() {
        Passenger passenger1 = new Passenger("Mart",59, false, false);
        Passenger passenger2 = new Passenger("Max", 27, false, false);
        Passenger passenger3 = new Passenger("Janine", 21, true, true);
        Passenger passenger4 = new Passenger("Marie", 28, true, false);

        airport.addPassengers(passenger1);
        airport.addPassengers(passenger2);
        airport.addPassengers(passenger3);
        airport.addPassengers(passenger4);

        assertEquals(passenger3, airport.dequeue());
    }

    @Test
    public void ___DS___OO___CS___SL___dequeue_then_enqueue() {
        Passenger passenger1 = new Passenger("Henry", 27, false, false);
        Passenger passenger2 = new Passenger("Jen", 25, true, false);
        Passenger passenger3 = new Passenger("Nica", 67, false, false);
        Passenger passenger4 = new Passenger("Mark", 45, false, true);

        airport.addPassengers(passenger1);
        airport.addPassengers(passenger2);
        airport.addPassengers(passenger3);

        airport.dequeue();
        airport.addPassengers(passenger4);
        airport.dequeue();

        assertEquals(passenger4, airport.dequeue());
    }

    @Test
    public void ___DS___OO___CS___SL___dequeue_then_enqueue_with_same_priority() {
        Passenger passenger1 = new Passenger("Henry", 27, false, false);
        Passenger passenger2 = new Passenger("Jen", 25, true, false);
        Passenger passenger3 = new Passenger("Nica", 67, false, false);
        Passenger passenger4 = new Passenger("Mark", 75, false, false);

        airport.addPassengers(passenger1);
        airport.addPassengers(passenger2);
        airport.addPassengers(passenger3);

        airport.dequeue();
        airport.addPassengers(passenger4);

        assertEquals(passenger4, airport.dequeue());
    }

}
