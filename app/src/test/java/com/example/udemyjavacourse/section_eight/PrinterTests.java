package com.example.udemyjavacourse.section_eight;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.udemy_section_eight.Printer;

import org.junit.Test;

public class PrinterTests {

    @Test
    public void testPrintPages() {
        Printer printer = new Printer(99, true);

        assertEquals(3, printer.printPages(5));
    }

    @Test
    public void testPrintPagesDuplexFalse() {
        Printer printer = new Printer(99, false);

        assertEquals(5, printer.printPages(5));
    }
}
