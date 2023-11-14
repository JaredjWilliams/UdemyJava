package com.example.udemyjavacourse;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.udemy_section_six.coding_exercises.DayOfTheWeekChallenge;

import org.junit.Test;

public class DayOfWeekChallengeTests {

    DayOfTheWeekChallenge challenge = new DayOfTheWeekChallenge();

    @Test
    public void testPrintDayOfWeekMonday() {
        assertEquals("Monday", challenge.printDayOfWeek(0));
    }
    @Test
    public void testPrintDayOfWeekTuesday() {
        assertEquals("Tuesday", challenge.printDayOfWeek(1));
    }
    @Test
    public void testPrintDayOfWeekWednesday() {
        assertEquals("Wednesday", challenge.printDayOfWeek(2));
    }
    @Test
    public void testPrintDayOfWeekThursday() {
        assertEquals("Thursday", challenge.printDayOfWeek(3));
    }
    @Test
    public void testPrintDayOfWeekFriday() {
        assertEquals("Friday", challenge.printDayOfWeek(4));
    }
    @Test
    public void testPrintDayOfWeekSaturday() {
        assertEquals("Saturday", challenge.printDayOfWeek(5));
    }
    @Test
    public void testPrintDayOfWeekSunday() {
        assertEquals("Sunday", challenge.printDayOfWeek(6));
    }
    @Test
    public void testPrintDayOfWeekNotDayOfWeek() {
        assertEquals("This is not a day of the week.", challenge.printDayOfWeek(7));
    }
}
