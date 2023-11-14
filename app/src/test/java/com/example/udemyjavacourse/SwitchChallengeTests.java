package com.example.udemyjavacourse;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.udemy_section_six.coding_exercises.SwitchChallenge;

import org.junit.Test;

public class SwitchChallengeTests {

    SwitchChallenge challenge = new SwitchChallenge();

    @Test
    public void testGetNatoCharacter() {
        assertEquals("C", challenge.getNatoLetter("Charlie"));
    }
}
