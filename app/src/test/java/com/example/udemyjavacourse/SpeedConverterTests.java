package com.example.udemyjavacourse;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.codingExercises.SpeedConverter;

import org.junit.Test;

public class SpeedConverterTests {

    SpeedConverter speedConverter = new SpeedConverter();

    @Test
    public void testToMilesPerHour() {
        assertEquals("10.0 km/h = 6 mi/h", speedConverter.printConversion(10));
    }

    @Test
    public void testInvalidValue() {
        assertEquals("Invalid Value", speedConverter.printConversion(-10));
    }
}
