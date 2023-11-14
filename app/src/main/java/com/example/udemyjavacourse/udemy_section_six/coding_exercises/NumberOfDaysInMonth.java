package com.example.udemyjavacourse.udemy_section_six.coding_exercises;

import com.example.udemyjavacourse.codingExercises.LeapYearCalculator;

public class NumberOfDaysInMonth {

    LeapYearCalculator leapYearCalculator = new LeapYearCalculator();

    public int getDaysInMonth(int month, int year) {

        if (month < 1 || month > 12) {
            return -1;
        }

        if (year < 1 || year > 9999) {
            return -1;
        }

        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> { yield leapYearCalculator.isLeapYear(year) ? 29 : 28; }
            default -> 30;
        };
    }

}
