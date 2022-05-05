import java.time.Period;

public class Day 
{ // An instance represents a unique day of the week
    // Class invariant: 0 <= dayNumber < 7

    private final String DAYS = "SUMOTUWETHFRSA";
    private int dayNumber;

    public Day() // default constructor
    {
        dayNumber = 0;
    }

    public Day(Day d) // copy constructor 
    {
        dayNumber = d.dayNumber;   
    }

    public Day(String s)
    {
        String ab = s.substring(0,2).toUpperCase(); // 2-char abbrev.
        dayNumber = DAYS.indexOf(ab) / 2;
    }

    public String toString()
    {
        switch (dayNumber){
            case 0: return "Sunday";
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            default: return "Saturday";
        }
    }

    public void advance(int n)
    {
        dayNumber = (dayNumber + n) % 7;
    }
    
    public Day prev()
    {
        int n = (dayNumber+6) % 7; // day number for previous day
        String ab = DAYS.substring(2*n,2*n+2); // 2-char abbrev.
        return new Day(ab);   
    }

    public static void main(String[] args) {
        Day today = new Day("Wed");
        System.out.println("Today is " + today + ", and yesterday was " + today.prev());
        Day heute = new Day(today);
        today.advance(4);
        System.out.println("In 4 days, today will be " + today + ", and yesterday will have been " +
            today.prev());
        System.out.println("But today is still " + heute + ", and yesterday was " + heute.prev());
    }
}
