package com.example.udemyjavacourse.udemy_section_five.coding_exercises;

public class MinutesToYearsAndDaysCalculator {

    public String printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return "Invalid Value";
        }

        long remainderMinutes = minutes % 1440;
        long days = minutes / 1440;
        long remainderDays = days % 365;
        long years = days / 365;

        return printYearsAndDays(remainderMinutes, remainderDays, years);
    }

    public String printYearsAndDays(long remainderMinutes, long remainderDays, long years) {
        if (remainderMinutes < 1) {
            return "" + years + " y and " + remainderDays + " d";
        }

        return "" + years + " y and " + remainderDays + " d and " + remainderMinutes + " m";
    }
}
