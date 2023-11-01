package com.example.udemyjavacourse;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.codingExercises.TeenNumberChecker;

import org.junit.Test;

public class TeenNumberCheckerTests {

    TeenNumberChecker teenNumberChecker = new TeenNumberChecker();

    // Method: boolean hasTeen(int valueOne, int valueTwo, int valueThree)
    // When: one of the values is between 12 - 19
    // Return: true
    @Test
    public void testValueInTheTeens() {
        assertEquals(true, teenNumberChecker.hasTeen(11, 12, 13));
    }

    // Method: boolean hasTeen(int valueOne, int valueTwo, int valueThree)
    // When: all of the values are not between 12 - 19
    // Return: false
    @Test
    public void testValueNotInTheTeens() {
        assertEquals(false, teenNumberChecker.hasTeen(10, 11, 12));
    }

    // Method: boolean hasTeen(int valueOne, int valueTwo, int valueThree)
    // When: all of the values are 0
    // Return: false
    @Test
    public void testValueAreZero() {
        assertEquals(false, teenNumberChecker.hasTeen(0, 0, 0));
    }
}
