public class DiscountedPassenger extends Passenger{
    private double BASE_COST = 6.80;
    private double totalPayment = 0;
    private double distance;
    
    public DiscountedPassenger(double distance){
        this.distance = distance;

    }
    
    @Override 
    public double getRideCost(){
        totalPayment = BASE_COST;
        if (distance > 4){
            totalPayment += (distance - 4) * 1.50;
        }
        return totalPayment * 0.80; // 20% discount to senior citizens
    }
}
