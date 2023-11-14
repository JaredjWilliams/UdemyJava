package com.example.udemyjavacourse;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.udemy_section_five.coding_exercises.AreaCalculator;

import org.junit.Test;

public class AreaCalculatorTests {

    AreaCalculator challenge = new AreaCalculator();

    @Test
    public void testAreaOfRectangle() {
        assertEquals(4.0, challenge.area(2,2), 0);
    }

    @Test
    public void testAreaOfCircle() {
        assertEquals(78.53981633974483, challenge.area(5.0), 0);
    }
}
