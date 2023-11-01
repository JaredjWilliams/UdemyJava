package com.example.udemyjavacourse;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.codingExercises.PositiveNegativeZero;

import org.junit.Test;

public class PositiveNegativeZeroTests {

    PositiveNegativeZero positiveNegativeZero = new PositiveNegativeZero();

    @Test
    public void testPositive() {
        assertEquals("positive", positiveNegativeZero.positiveNegativeZero(1));
    }

    @Test
    public void testNegative() {
        assertEquals("negative", positiveNegativeZero.positiveNegativeZero(-1));
    }

    @Test
    public void testZero() {
        assertEquals("zero", positiveNegativeZero.positiveNegativeZero(0));
    }
}
