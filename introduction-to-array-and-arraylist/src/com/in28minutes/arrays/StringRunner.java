package com.in28minutes.arrays;

public class StringRunner {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        String dayWithMostCharacters ="";
        for(String day:daysOfWeek){
            if(day.length()>dayWithMostCharacters.length()){
                dayWithMostCharacters = day;
            }
        }

        System.out.println("Day with Most number " + dayWithMostCharacters);

        for(int i=0; i <daysOfWeek.length;i++){
            System.out.println(daysOfWeek[i]);
        }
    }
}
