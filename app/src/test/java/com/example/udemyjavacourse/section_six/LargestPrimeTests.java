package com.example.udemyjavacourse.section_six;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.udemy_section_six.coding_exercises.LargestPrime;

import org.junit.Test;

public class LargestPrimeTests {

    @Test
    public void testGetLargestPrime() {
        assertEquals(7, LargestPrime.getLargestPrime(21));
    }

    @Test
    public void testGetLargestPrimeTwo() {
        assertEquals(31, LargestPrime.getLargestPrime(217));
    }

    @Test
    public void testGetLargestPrimeThree() {
        assertEquals(-1, LargestPrime.getLargestPrime(0));
    }

    @Test
    public void testGetLargestPrimeFour() {
        assertEquals(5, LargestPrime.getLargestPrime(45));
    }

    @Test
    public void testGetLargestPrimeFive() {
        assertEquals(-1, LargestPrime.getLargestPrime(-1));
    }
}
