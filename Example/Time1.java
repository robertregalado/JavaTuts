// import java.time.LocalTime; // import the LocalTime class

// public class Time1 {
  // public static void main(String[] args) {
    // LocalTime myObj = LocalTime.now();
    // System.out.println(myObj);
  // }
// }

// import java.time.LocalDateTime; // import the LocalDateTime class

// public class Time1 {
  // public static void main(String[] args) {
    // LocalDateTime myObj = LocalDateTime.now();
    // System.out.println(myObj);
  // }
// }


import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class Time1 {
  public static void main(String[] args) {
    LocalDateTime myDateObj = LocalDateTime.now();
    System.out.println("Before formatting: " + myDateObj);
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    String formattedDate = myDateObj.format(myFormatObj);
    System.out.println("After formatting: " + formattedDate);
  }
}