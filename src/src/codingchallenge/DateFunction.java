package src.codingchallenge;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
//Write a program to format the date and time using the Date function in Java.
public class DateFunction {

    public static void main(String[] args) {
        // Create a Date object representing the current date and time
        Date now = new Date();

        // Create a DateFormat object with a custom format
        DateFormat formatter = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");

        // Use the formatter to format the date and time as a String
        String formattedDateTime = formatter.format(now);

        // Print the formatted date and time
        System.out.println("Formatted date and time: " + formattedDateTime);
    }
}
