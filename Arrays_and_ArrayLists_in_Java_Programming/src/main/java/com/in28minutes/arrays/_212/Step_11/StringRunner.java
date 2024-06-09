package com.in28minutes.arrays._212.Step_11;

public class StringRunner {
    public static void main(String[] args) {
        String[] dayOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        String dayWithMostCharacters = "";
        for(String day:dayOfWeek){
            if(day.length() > dayWithMostCharacters.length()){
                dayWithMostCharacters = day;
            }
        }

        System.out.println("Day with Most number of characters " + dayWithMostCharacters);

        //正向印出
        for(int i = 0; i<dayOfWeek.length;i++){
            System.out.println(dayOfWeek[i]);
        }

        //反向印出
        for(int i = dayOfWeek.length - 1; i >= 0 ;i--){
            System.out.println(dayOfWeek[i]);
        }
    }
}
