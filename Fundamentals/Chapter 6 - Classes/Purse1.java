import java.lang.module.ResolutionException;

import javax.print.FlavorException;

public class Purse1 
 { // An object represents a coin purse
    // Class invariant: the sum of the field values is minimal and >= 0;
    // enforced by the reduce() method

    private int pennies;
    private int dimes;
    private int quarters;
    private int nickels;

    private int cents()
    {
        return pennies + 5*nickels + 10*dimes + 25*quarters;
    }

    public float dollars()
    {
        return (float)cents()/100;
    }
    
    public void clear()
    {
        pennies = nickels = dimes = quarters = 0;
    }

    public void reduce()
    {
        pennies = cents();
        if (pennies < 0)
        {
            clear();
            return;
        }
        quarters = pennies / 25;
        pennies %= 25;
        dimes = pennies / 10;
        pennies %= 10;
        nickels = pennies / 5;
        pennies %= 5;

    }

    public void insert(double dollars)
    {
        pennies += 100*dollars;
        reduce();
    }

    public void remove(double dollars)
    {
        int p = cents() - (int)Math.round(100.0*dollars);
        clear();
        pennies = p;
        reduce();
    }

    public String toString()
    {
        return new String(quarters + " quarters + "
                        + dimes + " dimes + "
                        + nickels + " nickels + "
                        + pennies + " pennies + "
                        + dollars());
                        
    }

   public static void main(String[] args) {
        Purse1 purse = new Purse1();
        System.out.println(purse);
        purse.insert(0.48);     
        System.out.println(purse);
        purse.insert(0.93);     
        System.out.println(purse);
        purse.remove(0.57);     
        System.out.println(purse);
        purse.remove(1.00);     
        System.out.println(purse);
   } 
}
