import java.net.SocketTimeoutException;

public class TestShort {
   public static void main(String[] args) 
   {
      short m = 22;
      System.out.println("short m = " + m);
      Short x = new Short(m);                   // converts short to Short
      System.out.println("Short x = " + x);
      String s = x.toString();                  // converts Short to String
      System.out.println("String s = " + s);
      m = Short.parseShort(s);                  // converts String to short
      System.out.println("short m = " + m);
      s = Short.toString(m);                    // converts short to String
      System.out.println("String s = " + s);
      x = Short.decode(s);                      // converts String to Short
      System.out.println("Short x = " + x);
      m = x.shortValue();                       // converts Short to short
      System.out.println("short m = " + m);
      System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);
      System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);

   } 
}
