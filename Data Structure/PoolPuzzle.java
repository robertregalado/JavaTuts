/*Your job is to take code snippets from the 
pool and place them into the blank 
lines in the code. You may not use the 
same snippet more than once, and 
you won’t need to use all the snippets. Your goal is to make a class that 
will compile and run and produce the 
output listed. Don’t be fooled—this one’s 
harder than it looks.

System.out.print(“ ”);
System.out.print(“a“);
System.out.print(“n“);
System.out.print(“an“);

x > 0
x < 1
x > 1
x > 3
x < 4

x = x + 1;
x = x + 2;
x = x - 2;
x = x - 1;

System.out.print(“noys “);
System.out.print(“oise “);
System.out.print(“ oyster “);
System.out.print(“annoys”);
System.out.print(“noise”);

*/

/* OUTPUT
%java PoolPuzzleOne
a noise
annoys
an oyster 
*/

public class PoolPuzzle {
    public static void main(String [] args) {
        int x = 0;
        while ( x < 4 ) {
            System.out.print("a");
            
            if(x < 1) {
                System.out.print(" ");
            }
            System.out.print("n");
            if ( x > 1 ) {
                System.out.print(" oyster");
                x = x + 2;
            }
            if ( x == 1 ) {
                System.out.print("noys");
            }
            if ( x < 1 ) {
                System.out.print("oise");
            }
            
            System.out.println("");
            x = x + 1;
        }
    }
}
