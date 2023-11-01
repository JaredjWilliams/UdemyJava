package com.example.udemyjavacourse.codingExercises;

public class SpeedConverter {

    public long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609);
    }

    public String printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);

        if (kilometersPerHour < 0) {
            String invalidValue = "Invalid Value";
            System.out.println(invalidValue);
            return invalidValue;
        }
        String toMilesPerHourString = "" + kilometersPerHour + " km/h = " + milesPerHour + " mi/h";
        System.out.println(toMilesPerHourString);
        return toMilesPerHourString;
    }
}
