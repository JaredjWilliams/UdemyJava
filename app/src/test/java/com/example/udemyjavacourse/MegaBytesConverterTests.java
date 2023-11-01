package com.example.udemyjavacourse;

import static org.junit.Assert.assertEquals;

import androidx.core.widget.TextViewCompat;

import com.example.udemyjavacourse.codingExercises.MegaBytesConverter;

import org.junit.Test;

public class MegaBytesConverterTests {

    MegaBytesConverter megaBytesConverter = new MegaBytesConverter();

    @Test
    public void testPrintMegaBytesAndKiloBytes() {
        assertEquals("2500 KB = 2 MB and 452 KB", megaBytesConverter.printMegaBytesAndKiloBytes(2500));
    }

    @Test
    public void testPrintMegaBytesAndKiloBytesInvalidValue() {
        assertEquals("Invalid Value", megaBytesConverter.printMegaBytesAndKiloBytes(-1));
    }
}
