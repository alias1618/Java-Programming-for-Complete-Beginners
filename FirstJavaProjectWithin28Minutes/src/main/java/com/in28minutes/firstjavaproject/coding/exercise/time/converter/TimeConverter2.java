package com.in28minutes.firstjavaproject.coding.exercise.time.converter;

//老師寫的
public class TimeConverter2 {
    public static int convertHoursToMinutes(int hours) {
        // Check for invalid cases
        if (hours < 0) {
            return -1;
        }

        // Convert hours to minutes
        return hours * 60;
    }

    public static int convertDaysToMinutes(int days) {
        // Check for invalid cases
        if (days < 0) {
            return -1;
        }

        // Convert days to minutes (24 hours per day * 60 minutes per hour)
        return days * 24 * 60;
    }
}
