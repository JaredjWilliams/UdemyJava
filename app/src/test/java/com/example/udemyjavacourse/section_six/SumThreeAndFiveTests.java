package com.example.udemyjavacourse.section_six;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.udemy_section_six.coding_exercises.SumThreeAndFive;

import org.junit.Test;

public class SumThreeAndFiveTests {

    SumThreeAndFive challenge = new SumThreeAndFive();


    @Test
    public void testSumThreeAndFiveTwo() {
        assertEquals(150, challenge.sumValues(1000));
    }
}
