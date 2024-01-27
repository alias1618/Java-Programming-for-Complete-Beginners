package com.conditionals.in.java.programming.Exercises.Weather.Advisor;

public class WeatherAdviserRunner {
    public static void main(String[] args) {
        WeatherAdviser adviser = new WeatherAdviser();

        //System.out.println(adviser.provideWeatherAdvisory(-5));
        // Output: "It's freezing! Wear a heavy coat."

        //System.out.println(adviser.provideWeatherAdvisory(5));
        // Output: "It's cold! Bundle up."

        //System.out.println(adviser.provideWeatherAdvisory(15));
        // Output: "It's cool! A light jacket will do."

        System.out.println(adviser.provideWeatherAdvisory(25));
        // Output: "It's warm! Enjoy the day."
    }
}
