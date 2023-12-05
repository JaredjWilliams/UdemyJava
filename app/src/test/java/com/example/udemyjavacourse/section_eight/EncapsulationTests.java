package com.example.udemyjavacourse.section_eight;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.udemy_section_eight.encapsulation.Player;

import org.junit.Test;

public class EncapsulationTests {

    @Test
    public void testPlayer() {

        Player player = new Player("Jared");

        int damage = 10;

        player.loseHealth(damage);

        assertEquals(90, player.healthRemaining());
    }
}
