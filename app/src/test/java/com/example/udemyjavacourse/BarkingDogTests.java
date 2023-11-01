package com.example.udemyjavacourse;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.codingExercises.BarkingDog;

import org.junit.Test;

public class BarkingDogTests {

    BarkingDog barkingDog = new BarkingDog();

    @Test
    public void testDogBarkingAfterEight() {
        assertEquals(false, barkingDog.shouldWakeUp(true, 9));
    }

    @Test
    public void testDogBarkingBeforeEight() {
        assertEquals(true, barkingDog.shouldWakeUp(true, 7));
    }

    @Test
    public void testDogNotBarkingBeforeEight() {
        assertEquals(false, barkingDog.shouldWakeUp(false, 1));
    }

    @Test
    public void testHourOfDayLessThanZero() {
        assertEquals(false, barkingDog.shouldWakeUp(true, -9));
    }

    @Test
    public void testHourOfDayGreaterThanTwentyThree() {
        assertEquals(false, barkingDog.shouldWakeUp(true, 25));
    }

    @Test
    public void testDogBarkingAfterTwentyTwo() {
        assertEquals(true, barkingDog.shouldWakeUp(true, 23));
    }

}
