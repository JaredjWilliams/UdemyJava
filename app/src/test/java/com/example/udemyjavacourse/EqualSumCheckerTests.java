package com.example.udemyjavacourse;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.codingExercises.EqualSumChecker;

import org.junit.Test;

public class EqualSumCheckerTests {

    EqualSumChecker equalSumChecker = new EqualSumChecker();

    // Method: boolean equalSumChecker(int valueOne, int valueTwo, int valueThree)
    // When: valueOne + valueTwo does not equal valueThree
    // Return: false
    @Test
    public void sumsDoNotEqual() {
        assertEquals(false, equalSumChecker.hasEqualSum(1, 2, 4));
    }

    // Method: boolean equalSumChecker(int valueOne, int valueTwo, int valueThree)
    // When: valueOne + valueTwo does equal valueThree
    // Return: true
    @Test
    public void sumsDoEqual() {
        assertEquals(true, equalSumChecker.hasEqualSum(1, 2, 3));
    }
}
