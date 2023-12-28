package com.in28minutes.firstjavaproject.coding.exercise.time.converter;

//編碼練習 3： Coding Exercise: Time Converter
//我寫的
public class TimeConverter {
    public static int convertHoursToMinutes(int hours) {
        // Your task: complete this method
        int min = 0;
        if(hours >= 0){
            min = Math.abs(hours) * 60 ;
        }else{
            min = hours;
        }
        return min;
    }

    public static int convertDaysToMinutes(int days) {
        // Your task: complete this method
        int min = 0;
        if(days >= 0){
            min = Math.abs(days) * 24 * 60;
        }else{
            min = days;
        }
        return min;
    }
}
