import java.util.Random;

public class Example0404 {
   public static void main(String[] args) {
       Random random = new Random();
       float x = random.nextFloat();
       System.out.println("x = " + x);
       int n = (int)Math.floor(101*x);
       boolean isNotPrime = (n < 2);
       for (int d = 2; d < n; d++){
           isNotPrime = (n % d == 0);
           if (isNotPrime) break;
       }
       if (isNotPrime) System.out.println(n + " is not prime.");
       else System.out.println(n + " is prime.");
   } 
}
