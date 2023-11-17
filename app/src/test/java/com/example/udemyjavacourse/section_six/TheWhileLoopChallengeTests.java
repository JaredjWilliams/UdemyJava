package com.example.udemyjavacourse.section_six;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.udemy_section_six.coding_exercises.TheWhileLoopChallenge;

import org.junit.Test;

import java.util.Arrays;

public class TheWhileLoopChallengeTests {

    TheWhileLoopChallenge challenge = new TheWhileLoopChallenge();

    @Test
    public void testPrintEvenNumbers() {
        assertEquals(Arrays.asList(6, 8, 10, 12, 14, 16, 18, 20, 22, 24), challenge.printEvenNumbers(5, 25));
    }

    @Test
    public void testPrintTotalEvenNumbers() {
        assertEquals(3, challenge.printTotalEvenNumbers(5, 10));
    }

    @Test
    public void testPrintTotalEvenNumbersTwo() {
        assertEquals(5, challenge.printTotalEvenNumbers(5, 24));
    }
}
