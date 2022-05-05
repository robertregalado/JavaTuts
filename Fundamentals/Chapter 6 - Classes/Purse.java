public class Purse 
{ // An object represents a coin purse

   private int pennies;
   private int nickels;
   private int dimes;
   private int quarters;

   public float dollars()
   {
      int p = pennies + 5*nickels + 10*dimes + 25*quarters;
      return (float)p/100;
   }

   public void insert(int p, int n, int d, int q)
   {
      pennies += p;
      nickels += n;
      dimes += d;
      quarters += q;
   }

   public void remove(int p, int n, int d, int q){
      pennies -= p;
      nickels -= n;
      dimes -= d;
      quarters -= q;
   }

   public String toString()
   {
      return new String(quarters + " quarters + " + dimes + " dimes + "
                                 + nickels + " nickels + "
                                 + pennies + " pennies = $"
                                 + dollars());
   }

   public static void main(String[] args) 
   {
      Purse purse = new Purse(); // invokes the default constructor
      System.out.println(purse);       
      purse.insert(3, 0, 2, 1);
      System.out.println(purse);
      purse.insert(3, 1, 1, 3);
      System.out.println(purse);
      purse.remove(3, 1, 0, 2);
      System.out.println(purse);
      purse.remove(0, 0, 0, 4);
      System.out.println(purse);
   } 
}
