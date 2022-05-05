import java.net.SocketTimeoutException;

public class ChangingCase {
   public static void main(String[] args) {
       String sbis = "StringBufferInputStream";
       System.out.println(sbis);
       String sbislc = sbis.toLowerCase();
       System.out.println(sbislc);
       String sbisuc = sbis.toUpperCase();
       System.out.println(sbisuc);
   } 
}
