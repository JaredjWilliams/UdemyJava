package com.example.udemyjavacourse.section_six;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.example.udemyjavacourse.udemy_section_six.coding_exercises.PerfectNumber;

import org.junit.Test;

public class PerfectNumberTests {

    @Test
    public void testIsPerfectNumber() {
        assertTrue(PerfectNumber.isPerfectNumber(6));
    }

    @Test
    public void testIsPerfectNumberTwo() {
        assertTrue(PerfectNumber.isPerfectNumber(28));
    }

    @Test
    public void testIsPerfectNumberThree() {
        assertFalse(PerfectNumber.isPerfectNumber(5));
    }

    @Test
    public void testIsPerfectNumberFour() {
        assertFalse(PerfectNumber.isPerfectNumber(-1));
    }
}
