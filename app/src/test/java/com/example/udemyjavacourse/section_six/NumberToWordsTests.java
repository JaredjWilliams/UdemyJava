package com.example.udemyjavacourse.section_six;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.udemy_section_six.coding_exercises.NumbersToWords;

import org.junit.Test;

public class NumberToWordsTests {

    @Test
    public void testGetDigitCountOne() {
        assertEquals(1, NumbersToWords.getDigitCount(0));
    }

    @Test
    public void testGetDigitCountTwo() {
        assertEquals(3, NumbersToWords.getDigitCount(123));
    }

    @Test
    public void testGetDigitCountThree() {
        assertEquals(-1, NumbersToWords.getDigitCount(-12));
    }

    @Test
    public void testGetDigitCountFour() {
        assertEquals(4, NumbersToWords.getDigitCount(5200));
    }

    @Test
    public void testReverseOne() {
        assertEquals(-121, NumbersToWords.reverse(-121));
    }

    @Test
    public void testReverseTwo() {
        assertEquals(2121, NumbersToWords.reverse(1212));
    }

    @Test
    public void testReverseThree() {
        assertEquals(4321, NumbersToWords.reverse(1234));
    }

    @Test
    public void testReverseFour() {
        assertEquals(1, NumbersToWords.reverse(100));
    }

    @Test
    public void testNumberToWordsOne() {
        assertEquals("One Two Three", NumbersToWords.numberToWords(123));
    }

    @Test
    public void testNumberToWordsTwo() {
        assertEquals("One Zero One Zero", NumbersToWords.numberToWords(1010));
    }

    @Test
    public void testNumberToWordsThree() {
        assertEquals("One Zero Zero Zero", NumbersToWords.numberToWords(10));
    }

    @Test
    public void testNumberToWordsFour() {
        assertEquals("Invalid Value", NumbersToWords.numberToWords(-12));
    }
}
