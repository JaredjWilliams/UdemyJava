package com.example.udemyjavacourse.section_seven;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.udemy_section_seven.Calculator;
import com.example.udemyjavacourse.udemy_section_seven.Carpet;
import com.example.udemyjavacourse.udemy_section_seven.Floor;

import org.junit.Test;

public class FloorTests {

    @Test
    public void testGetTotalCost() {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);


        assertEquals(38.5, calculator.getTotalCost(), 0);
    }

    @Test
    public void testGetTotalCostTwo() {
        Carpet carpet = new Carpet(1.5);
        Floor floor = new Floor(5.4, 4.5);
        Calculator calculator = new Calculator(floor, carpet);

        assertEquals(36.45, calculator.getTotalCost(), 0);
    }
}
