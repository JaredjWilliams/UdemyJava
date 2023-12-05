package com.example.udemyjavacourse.section_seven;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.udemy_section_seven.ComplexNumber;

import org.junit.Test;

public class ComplexNumberTests {

    @Test
    public void testAddComplexNumber() {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber two = new ComplexNumber(2.5, -1.5);

        one.add(1, 1);

        assertEquals(2.0, one.getReal(), 0);
        assertEquals(2.0, one.getImaginary(), 0);
    }

}
