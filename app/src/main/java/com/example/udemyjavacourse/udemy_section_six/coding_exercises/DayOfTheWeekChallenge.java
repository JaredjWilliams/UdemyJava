package com.example.udemyjavacourse.udemy_section_six.coding_exercises;

public class DayOfTheWeekChallenge {

    public String printDayOfWeek(int dayOfWeek) {
        return switch (dayOfWeek) {
            case 0 -> "Monday";
            case 1 -> "Tuesday";
            case 2 -> "Wednesday";
            case 3 -> "Thursday";
            case 4 -> "Friday";
            case 5 -> "Saturday";
            case 6 -> "Sunday";
            default -> "This is not a day of the week.";
        };
    }
}
