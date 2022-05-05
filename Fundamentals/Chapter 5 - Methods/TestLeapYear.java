import javax.management.BadBinaryOpValueExpException;

public class TestLeapYear {
   public static void main(String[] args) {
       test(1492);
       test(1592);
       test(1600);
       test(1700);
       test(1776);
       test(1992);
       test(1999);
       test(2000);
   }
   
   static boolean isLeapYear(int n)
   {
       if (n < 1582) return false;
       if (n % 400 == 0) return true;
       if (n % 100 == 0) return false;
       if (n % 4 == 0) return true;
       return false;
   }

   static void test(int n){
       if (isLeapYear(n)) System.out.println(n + " is a leap year.");
       else System.out.println(n + " is not a leap year.");
   }
}
