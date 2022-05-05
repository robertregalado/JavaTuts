import java.net.SocketTimeoutException;
import java.util.Random;

public class Example0403 {
   public static void main(String[] args) {
       Random random = new Random();
       float x = random.nextFloat();
       System.out.println("x = " + x);
       int n = (int) Math.floor(99*x+2);
       for(int d = 2; d < n; d++)
            if (n % d == 0){
                System.out.println(n + " is not prime.");
                return;
            }
        System.out.println(n + " is prime.");
   } 
}
