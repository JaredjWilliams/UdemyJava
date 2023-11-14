package com.example.udemyjavacourse.section_six;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.udemy_section_six.coding_exercises.NumberOfDaysInMonth;

import org.junit.Test;

public class NumberOfDaysInMonthTests {

    NumberOfDaysInMonth challenge = new NumberOfDaysInMonth();

    @Test
    public void testDaysInMonthJanuary() {
        assertEquals(31, challenge.getDaysInMonth(1, 2020));
    }

    @Test
    public void testDaysInMonthFebruaryWhenLeapYear() {
        assertEquals(29, challenge.getDaysInMonth(2, 2020));
    }

    @Test
    public void testDaysInMonthFebruaryWhenNotLeapYear() {
        assertEquals(28, challenge.getDaysInMonth(2, 2018));
    }
}
