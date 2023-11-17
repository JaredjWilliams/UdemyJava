package com.example.udemyjavacourse.section_six;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.example.udemyjavacourse.udemy_section_six.coding_exercises.NumberPalindrome;

import org.junit.Test;

public class NumberPalindromeTests {

    @Test
    public void testIsPalindrome() {
        assertTrue(NumberPalindrome.isPalindrome(101));
    }

    @Test
    public void testIsPalindromeIsFalse() {
        assertFalse(NumberPalindrome.isPalindrome(100));
    }

    @Test
    public void testIsPalindromeIsTrueTwo() {
        assertTrue(NumberPalindrome.isPalindrome(123454321));
    }

    @Test
    public void testIsPalindromeIsTrueNegative() {
        assertTrue(NumberPalindrome.isPalindrome(-123454321));
    }

}
