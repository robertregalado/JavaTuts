import java.net.SocketTimeoutException;

import javax.print.attribute.standard.Fidelity;

public class Concatenation {
   public static void main(String[] args) {
       String first = "James";
       String last = "Regalado";
       System.out.println(first + last);
       System.out.println(first + " " + last);
       System.out.println(first + ", " + last);
       String name = first + " " + last;
       System.out.println(name);
   } 
}
