package com.example.udemyjavacourse.section_six;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.udemy_section_six.coding_exercises.GreatestCommonDivisor;

import org.junit.Test;

public class GreatestCommonDivisorTests {

    @Test
    public void testGetGreatestCommonDivisor() {
        assertEquals(5, GreatestCommonDivisor.getGreatestCommonDivisor(25, 15));
    }

    @Test
    public void testGetGreatestCommonDivisorTwo() {
        assertEquals(6, GreatestCommonDivisor.getGreatestCommonDivisor(12, 30));
    }

    @Test
    public void testGetGreatestCommonDivisorThree() {
        assertEquals(-1, GreatestCommonDivisor.getGreatestCommonDivisor(9, 18));
    }

    @Test
    public void testGetGreatestCommonDivisorFour() {
        assertEquals(9, GreatestCommonDivisor.getGreatestCommonDivisor(81, 153));
    }
}
