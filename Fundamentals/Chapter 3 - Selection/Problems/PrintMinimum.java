package Problems;

import java.util.Random;

public class PrintMinimum {
   public static void main(String[] args) {
       Random random = new Random();
       int m = random.nextInt();
       System.out.println("m = " + m);
       int n = random.nextInt();
       System.out.println("n = " + n);
       if (m < n) System.out.println("Their minimum is " + m);
       else 
       System.out.println("Their minimum is " + n);

   } 
}
