package com.example.udemyjavacourse.section_six;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.udemy_section_six.scanners.ReadingUserInput;

import org.junit.Test;

public class ReadingUserInputTests {

    @Test
    public void testReadingUserInput() {
        assertEquals("", ReadingUserInput.printResults());
    }
}
