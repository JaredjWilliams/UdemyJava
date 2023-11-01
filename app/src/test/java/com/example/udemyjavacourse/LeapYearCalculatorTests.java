package com.example.udemyjavacourse;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.codingExercises.LeapYearCalculator;

import org.junit.Test;

public class LeapYearCalculatorTests {

    LeapYearCalculator leapYearCalculator = new LeapYearCalculator();

    @Test
    public void testIsLeapYear() {
        assertEquals(false, leapYearCalculator.isLeapYear(2023));
    }

    // METHOD: boolean isLeapYear(int year)
    // WHEN: year is greater than 9999
    // RETURN: False
    @Test
    public void testYearNotGreaterThanOrEqualToOne() {
        assertEquals(false, leapYearCalculator.isLeapYear(10000));
    }


    // METHOD: boolean isLeapYear(int year)
    // WHEN: year is less than one
    // RETURN: False
    @Test
    public void testYearIsLessThanOne() {
        assertEquals(false, leapYearCalculator.isLeapYear(0));
    }

    // METHOD: boolean isLeapYear(int year)
    // WHEN: year is not divisible by 4
    // RETURN: False
    @Test
    public void testYearIsNotDivisibleByFour() {
        assertEquals(false, leapYearCalculator.isLeapYear(1700));
    }
    // METHOD: boolean isLeapYear(int year)
    // WHEN: year is divisible by 4
    // AND: year is not divisible by 100
    // RETURN: False
    @Test
    public void testYearIsNotDivisbleByOneHundred() {
        assertEquals(true, leapYearCalculator.isLeapYear(1616));
    }

    // METHOD: boolean isLeapYear(int year)
    // WHEN: year is divisible by 4
    // AND: divisible by 100
    // And: divisible by 400
    // RETURN: True
    @Test
    public void testYearHas366DaysReturnsTrue() {
        assertEquals(true, leapYearCalculator.isLeapYear(1600));
    }
}
