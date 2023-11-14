package com.example.udemyjavacourse.section_six;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.udemy_section_six.coding_exercises.SumOddRange;

import org.junit.Test;

public class SumOddRangeTests {

    SumOddRange challenge = new SumOddRange();

    @Test
    public void testSumOdd() {
        assertEquals(2500, challenge.sumOdd(1, 100));
    }

    @Test
    public void testSumOddTwo() {
        assertEquals(-1, challenge.sumOdd(-1, 100));
    }

    @Test
    public void testSumOddThree() {
        assertEquals(13, challenge.sumOdd(13, 13));
    }
}
