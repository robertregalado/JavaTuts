import java.util.Random;

public class Example0402 {
   public static void main(String[] args) {
       Random random = new Random();
       float sum = 0;
       for(int i = 0; i < 5; i++){
           float x = random.nextFloat();
           sum += x;
           System.out.println("\tx = " + x + "\t\tsum = " + sum);
       }
   } 
}
