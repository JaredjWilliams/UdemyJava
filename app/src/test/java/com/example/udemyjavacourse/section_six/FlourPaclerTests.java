package com.example.udemyjavacourse.section_six;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.udemy_section_six.coding_exercises.FlourPacker;

import org.junit.Test;

public class FlourPaclerTests {

    @Test
    public void testCanPackOne() {
        assertEquals(false, FlourPacker.canPack(1, 0, 4));
    }

    @Test
    public void testCanPackTwo() {
        assertEquals(true, FlourPacker.canPack(1, 0, 5));
    }

    @Test
    public void testCanPackThree() {
        assertEquals(true, FlourPacker.canPack(0, 5, 4));
    }

    @Test
    public void testCanPackFour() {
        assertEquals(true, FlourPacker.canPack(2, 2, 11));
    }

    @Test
    public void testCanPackFive() {
        assertEquals(false, FlourPacker.canPack(-3, 2, 12));
    }

    @Test
    public void testCanPackSix() {
        assertEquals(true, FlourPacker.canPack(2, 1, 5));
    }
}
