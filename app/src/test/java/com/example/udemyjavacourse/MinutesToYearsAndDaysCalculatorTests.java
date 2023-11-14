package com.example.udemyjavacourse;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.udemy_section_five.coding_exercises.MinutesToYearsAndDaysCalculator;

import org.junit.Test;

public class MinutesToYearsAndDaysCalculatorTests {

    MinutesToYearsAndDaysCalculator challenge = new MinutesToYearsAndDaysCalculator();

    @Test
    public void testPrintYearsAndDays() {
        assertEquals("1 y and 0 d", challenge.printYearsAndDays(525600));
    }

    @Test
    public void testPrintYearsAndDaysTwo() {
        assertEquals("2 y and 0 d", challenge.printYearsAndDays(1051200));
    }

    @Test
    public void testPrintYearsAndDaysThree() {
        assertEquals("2 y and 0 d", challenge.printYearsAndDays(1051200));
    }

    @Test
    public void testPrintYearsAndDaysFour() {
        assertEquals("2 y and 0 d and 1 m", challenge.printYearsAndDays(1051201));
    }
}
