public class Main {
   public static void main(String[] args) {
       Overloading overloaded = new Overloading();
       System.out.println("Sample of overloading.........");
       System.out.println("Using integer parameters: " + overloaded.add(2, 3));
       System.out.println("Using double parameters: " + overloaded.add(2.0, 3.0));

       System.out.println("");
       Solver solve = new Solver();
       System.out.println("Sample of overriding......");
       System.out.println("Parent class: " + solve.add(3, 4));
       Adder add = new Adder();
       System.out.println("Child class reference: " + add.add(3, 4));
   } 
}
