package com.in28minutes.firstjavaproject.coding.exercise.time.converter;

public class TimeConverterRunner {
    public static void main(String[] args) {
        TimeConverter run  = new TimeConverter();
        TimeConverter2 run2 = new TimeConverter2();

        run.convertHoursToMinutes(1);
        run2.convertDaysToMinutes(1);
    }
}
