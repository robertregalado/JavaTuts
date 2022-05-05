public class Main {
   public static void main(String[] args) {
       Passenger passenger1 = new BasePassenger(4.5);
       Passenger passenger2 = new DiscountedPassenger(3);

       Transportation bus = new Transportation();
       bus.addPassenger(passenger1);
       bus.addPassenger(passenger2);
       System.out.println(bus.calculateTotalEarnings());
   } 
}
