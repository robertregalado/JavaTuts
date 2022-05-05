package Problems;

import java.util.Random;

public class Testpositive {
   public static void main(String[] args) {
       Random random = new Random();
       int n = random.nextInt();
       System.out.println("n = " + n);
       if (n > 0) System.out.println("n > 0");
   } 
}
