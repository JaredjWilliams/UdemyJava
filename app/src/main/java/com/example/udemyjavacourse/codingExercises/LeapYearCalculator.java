package com.example.udemyjavacourse.codingExercises;

public class LeapYearCalculator {

    public boolean isLeapYear(int year) {
        boolean isLeapYear = false;

        if (year < 1 || year > 9999) {
            return false;
        }

        if (year % 4 == 0 && year % 100 != 0) {
            isLeapYear = true;
        } else if (year % 100 == 0 && year % 400 == 0) {
            isLeapYear = true;
        }

        return isLeapYear;
    }
}
