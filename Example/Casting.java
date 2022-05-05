public class Casting {
  public static void main(String[] args) {
        
		// Widening Casting
		int myInt = 9;
		double myDouble = myInt; // Automatic casting: int to double

		System.out.println(myInt);      // Outputs 9
		System.out.println(myDouble);   // Outputs 9.0
		
		// Narrowing Casting
		double myDouble1 = 9.78d;
		int myInt1 = (int) myDouble; // Manual casting: double to int

		System.out.println(myDouble1);   // Outputs 9.78
		System.out.println(myInt1);      // Outputs 9
  }
}