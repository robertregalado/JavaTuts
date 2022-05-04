package com.passport;// Java Program to Convert String to Date

// Importing required classes
import java.time.Instant;
import java.time.format.DateTimeParseException;

// Main class
public class GFG {

    // Method
    // To convert String to Date
    public static Instant getDateFromString(String string)
    {
        // Creating an instant object
        Instant timestamp = null;

        // Parsing the string to Date
        timestamp = Instant.parse(string);

        // Returning the converted timestamp
        return timestamp;
    }

    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
        // Getting the string
        String string = "2018-10-28T15:23:01Z";

        // Try block to check for exceptions
        try {

            // Getting the Date from String by
            // creating object of Instant class
            Instant timestamp = getDateFromString(string);

            // Printing the converted date
            System.out.println(timestamp);
        }

        // Catch block to handle exceptions
        catch (DateTimeParseException e) {

            // Throws DateTimeParseException
            // if the string cannot be parsed
            System.out.println("Exception: " + e);
        }
    }
}

