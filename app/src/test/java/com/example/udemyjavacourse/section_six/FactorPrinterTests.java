package com.example.udemyjavacourse.section_six;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.udemy_section_six.coding_exercises.FactorPrinter;

import org.junit.Test;

import java.util.Arrays;

public class FactorPrinterTests {

    @Test
    public void testPrintFactors() {
        assertEquals(Arrays.asList(1, 2, 3, 6), FactorPrinter.printFactors(6));
    }

    @Test
    public void testPrintFactorsTwo() {
        assertEquals(Arrays.asList(1, 2, 4, 8, 16, 32), FactorPrinter.printFactors(32));
    }

    @Test
    public void testPrintFactorsThree() {
        assertEquals(Arrays.asList(1, 2, 5, 10), FactorPrinter.printFactors(10));
    }

}
