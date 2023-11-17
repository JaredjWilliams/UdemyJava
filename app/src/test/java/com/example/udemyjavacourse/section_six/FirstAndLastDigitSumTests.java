package com.example.udemyjavacourse.section_six;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.udemy_section_six.coding_exercises.FirstAndLastDigitSum;

import org.junit.Test;

public class FirstAndLastDigitSumTests {

    @Test
    public void testFirstAndLastDigitSumOne() {
        assertEquals(4, FirstAndLastDigitSum.sumFirstAndLastDigit(252));
    }
    @Test
    public void testFirstAndLastDigitSumTwo() {
        assertEquals(9, FirstAndLastDigitSum.sumFirstAndLastDigit(257));
    }
    @Test
    public void testFirstAndLastDigitSumThree() {
        assertEquals(0, FirstAndLastDigitSum.sumFirstAndLastDigit(0));
    }
    @Test
    public void testFirstAndLastDigitSumFour() {
        assertEquals(10, FirstAndLastDigitSum.sumFirstAndLastDigit(5));
    }
    @Test
    public void testFirstAndLastDigitSumFive() {
        assertEquals(-1, FirstAndLastDigitSum.sumFirstAndLastDigit(-10));
    }
}
