package com.example.udemyjavacourse;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.udemy_section_five.coding_exercises.SecondsAndMinutesChallenge;

import org.junit.Test;

public class SecondsAndMinutesChallengeTests {

    SecondsAndMinutesChallenge challenge = new SecondsAndMinutesChallenge();

    @Test
    public void testGetStringDuration() {
        assertEquals("1h 5m 45s", challenge.getDurationString(3945));
    }

    @Test
    public void testGetStringDurationMinutesAndSeconds() {
        assertEquals("1h 5m 45s", challenge.getDurationString(65, 45));
    }
}
