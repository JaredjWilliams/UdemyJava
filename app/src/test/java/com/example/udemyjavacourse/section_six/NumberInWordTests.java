package com.example.udemyjavacourse.section_six;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.udemy_section_six.coding_exercises.NumberInWord;

import org.junit.Test;

public class NumberInWordTests {
    NumberInWord challenge = new NumberInWord();

    @Test
    public void testNumberInWordZero() {
        assertEquals("ZERO", challenge.printNumberInWord(0));
    }
    @Test
    public void testNumberInWordOne() {
        assertEquals("ONE", challenge.printNumberInWord(1));
    }
    @Test
    public void testNumberInWordTwo() {
        assertEquals("TWO", challenge.printNumberInWord(2));
    }
}
