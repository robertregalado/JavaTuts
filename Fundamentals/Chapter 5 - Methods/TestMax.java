import java.util.Random;

public class TestMax {
   public static void main(String[] args) {
       Random random = new Random();
       for (int i = 0; i < 5; i ++){
           float x = random.nextFloat();
           int a = Math.round(100*x);
           x = random.nextFloat();
           int b = Math.round(100*x);
           x = random.nextFloat();
           int c = Math.round(100*x);
           System.out.println("max(" + a + "," + b + "," + c + ") = " + max(a,b,c));
       }
   }
   static int max(int m, int n)
   {
       if (m > n) return m;
       return n;
   } 
   
   static int max(int n1, int n2, int n3){
       return max(max(n1, n2), n3); 
   }
}
