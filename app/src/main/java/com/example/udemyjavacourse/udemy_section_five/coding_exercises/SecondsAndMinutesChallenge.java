package com.example.udemyjavacourse.udemy_section_five.coding_exercises;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.SimpleFormatter;

public class SecondsAndMinutesChallenge {

    String format = "HH mm ss";

    public SecondsAndMinutesChallenge() {

    }

    public String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid number for seconds";
        }

        return getDurationString(seconds / 60, seconds % 60);
    }

    public String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return "Invalid minutes";
        }

        if (seconds <= 0 || seconds >= 59) {
            return "invalid seconds";
        }

        int hours = minutes / 60;
        int remainderMinutes = minutes % 60;

        return "" + hours + "h " + remainderMinutes + "m " + seconds + "s";
    }
}
