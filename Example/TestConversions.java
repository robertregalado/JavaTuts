public class TestConversions {
   public static void main(String[] args) {
       String today = "May 18, 1998";
       String todaysDayString = today.substring(4,6);
       int todaysDayInt = Integer.parseInt(todaysDayString);
       int nextWeeksDayInt = todaysDayInt + 7;
       String nextWeek = today.substring(0, 4) + nextWeeksDayInt + today.substring(6);
       System.out.println("Today's date is " + today);
       System.out.println("Today's date is " + todaysDayInt);
       System.out.println("Next week's day is " + nextWeeksDayInt);
       System.out.println("Next week's date is " + nextWeek);
   } 
}
