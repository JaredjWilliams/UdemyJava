package com.example.udemyjavacourse;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MethodChallengeTests {
    MethodChallenge methodChallenge = new MethodChallenge();

    @Test
    public void testMethodChallenge() {
        assertEquals("Jared managed to get to scoring position: 1", methodChallenge.methodChallenge("Jared", 1001));
    }

    @Test
    public void testMethodChallengeTwo() {
        assertEquals("Jared managed to get to scoring position: 2", methodChallenge.methodChallenge("Jared", 999));
    }

    @Test
    public void testMethodChallengeThree() {
        assertEquals("Jared managed to get to scoring position: 3", methodChallenge.methodChallenge("Jared", 499));
    }

    @Test
    public void testMethodChallengeFour() {
        assertEquals("Jared managed to get to scoring position: 4", methodChallenge.methodChallenge("Jared", 99));
    }
}
