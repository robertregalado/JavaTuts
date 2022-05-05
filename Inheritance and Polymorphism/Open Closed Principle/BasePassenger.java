public class BasePassenger extends Passenger{
    private double BASE_COST = 7.50;
    private double totalPayment = 0;
    private double distance;
    
    public BasePassenger(double distance){
        this.distance = distance;

    }
    @Override 
    public double getRideCost(){
        totalPayment = BASE_COST;
        if (distance > 4){
            totalPayment += (distance - 4) * 1.50;
        }
        return totalPayment;
    }
}
