package com.example.udemyjavacourse.section_six;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.udemy_section_six.coding_exercises.TheForLoopChallenge;

import org.junit.Test;

public class TheForLoopChallengeTests {

    TheForLoopChallenge challenge = new TheForLoopChallenge();

    @Test
    public void testFindPrimeAmount() {
        assertEquals(168, challenge.findPrimeNumbers(1000));
    }
}
