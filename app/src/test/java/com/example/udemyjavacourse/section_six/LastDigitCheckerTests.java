package com.example.udemyjavacourse.section_six;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.example.udemyjavacourse.udemy_section_six.coding_exercises.LastDigitChecker;

import org.junit.Test;

public class LastDigitCheckerTests {

    @Test
    public void testHasSameLastDigitTrue() {
        assertTrue(LastDigitChecker.hasSameLastDigit(41, 22, 71));
    }

    @Test
    public void testHasSameLastDigitFalseWhenNotInRange() {
        assertFalse(LastDigitChecker.hasSameLastDigit(9, 99, 999));
    }

    @Test
    public void testHasSameLastDigitFalse() {
        assertFalse(LastDigitChecker.hasSameLastDigit(82, 54, 845));
    }
}
