package com.example.udemyjavacourse.section_six;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.udemy_section_six.coding_exercises.DigitSumChallenge;

import org.junit.Test;

public class DigitSumChallengeTests {

    DigitSumChallenge challenge = new DigitSumChallenge();

    @Test
    public void testSumDigitsOne() {
        assertEquals(8, challenge.sumDigits(125));
    }

    @Test
    public void testSumDigitsTwo() {
        assertEquals(1, challenge.sumDigits(1000));
    }

    @Test
    public void testSumDigitsThree() {
        assertEquals(7, challenge.sumDigits(7));
    }

    @Test
    public void testSumDigitsExitsWhenNumberNegative() {
        assertEquals(-1, challenge.sumDigits(-7));
    }

}
