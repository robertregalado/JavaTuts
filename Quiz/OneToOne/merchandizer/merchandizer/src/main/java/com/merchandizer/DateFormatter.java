package com.merchandizer;

import java.time.LocalDate; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class DateFormatter {
    public static void main(String[] args) {
        LocalDate myDateObj = LocalDate.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM-dd-yyyy");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}
