package com.example.udemyjavacourse.section_eight;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.udemy_section_eight.polymorphism.challenge.Car;
import com.example.udemyjavacourse.udemy_section_eight.polymorphism.challenge.ElectricCar;
import com.example.udemyjavacourse.udemy_section_eight.polymorphism.challenge.Ford;
import com.example.udemyjavacourse.udemy_section_eight.polymorphism.challenge.Holden;
import com.example.udemyjavacourse.udemy_section_eight.polymorphism.challenge.HybridCar;
import com.example.udemyjavacourse.udemy_section_eight.polymorphism.challenge.Mitsubishi;

import org.junit.Test;

public class PolymorphismTests {

    @Test
    public void testFord() {
        Car ford = new Ford(6, "Ford Falcon");
        assertEquals("Ford -> startEngine()", ford.startEngine());
    }

    @Test
    public void testMitsubishi() {
        Car mitsubishi = new Mitsubishi(4, "mitsu");
        assertEquals("Mitsubishi -> startEngine()", mitsubishi.startEngine());
    }

    @Test
    public void testHolder() {
        Car holden = new Holden(4, "holder");
        assertEquals("Holden -> startEngine()", holden.startEngine());
    }

    @Test
    public void testHybridCar() {
        Car hybrid = new HybridCar("Hybrid", 20.2, 6, 20);
        assertEquals(String.format("Hybrid -> %d cylinders are fired up.%n", 6), hybrid.startEngine());
    }

    @Test
    public void testElectricCar() {
        Car electric = new ElectricCar("Electric", 20.4, 20);
        assertEquals(String.format("BEV -> switch %d kWh battery on, Ready!%n", 20), electric.startEngine());
    }
}
