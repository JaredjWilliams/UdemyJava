package com.example.udemyjavacourse.section_six;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.example.udemyjavacourse.udemy_section_six.coding_exercises.SharedDigit;

import org.junit.Test;

public class SharedDigitTests {

    @Test
    public void testHasSharedDigitReturnsTrue() {
        assertTrue(SharedDigit.hasSharedDigit(12, 13));
    }

    @Test
    public void testHasSharedDigitReturnsFalseWhenNotInRange() {
        assertFalse(SharedDigit.hasSharedDigit(9, 99));
    }

    @Test
    public void testHasSharedDigitReturnsFalseTwo() {
        assertFalse(SharedDigit.hasSharedDigit(15, 34));
    }

}
