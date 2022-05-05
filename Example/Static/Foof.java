
// non-static final variables
public class Foof {
    // A final variable means you can't change its value
   final int size = 3; // now you can't change size
   final int whuffie; 

   Foof() {
       whuffie = 42; // now you can't change whuffie
   }

   void doStuff(final int x) {
       // you can't change x
   }

   void doMore() {
       final int z = 7;
       // you can't change z
   }
   
}
