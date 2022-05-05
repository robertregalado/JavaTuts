package Problems;

import java.util.Random;

public class MaxFour {
   public static void main(String[] args) {
    Random random = new Random(); 
    int nl = random.nextInt(); 
    System.out.println("n1= " + nl); 
    int n2 = random.nextInt(); 
    System.out .println("n2 = " + n2); 
    int n3 = random. nextInt(); 
    System.out.println("n3 = " + n3); 
    int n4 = random.nextInt(); 
    System.out .println("n4 = " + n4); 
    int max = nl; 
    if (n2 > max) max = n2; 
    if (n3 > max) max = n3; 
    if (n4 > max) max = n4; 
    System.out .println("Their maximum is " + max);
   } 
}
