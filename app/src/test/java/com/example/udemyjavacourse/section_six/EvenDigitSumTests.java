package com.example.udemyjavacourse.section_six;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.udemy_section_six.coding_exercises.EvenDigitSum;

import org.junit.Test;

public class EvenDigitSumTests {

    @Test
    public void testGetEvenDigitSum() {
        assertEquals(20, EvenDigitSum.getEvenDigitSum(123456789));
    }

    @Test
    public void testGetEvenDigitSumTwo() {
        assertEquals(4, EvenDigitSum.getEvenDigitSum(252));
    }

    @Test
    public void testGetEvenDigitSumThree() {
        assertEquals(-1, EvenDigitSum.getEvenDigitSum(-22));
    }
}
