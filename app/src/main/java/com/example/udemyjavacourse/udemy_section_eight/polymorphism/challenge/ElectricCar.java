package com.example.udemyjavacourse.udemy_section_eight.polymorphism.challenge;

import java.util.Locale;

public class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;


    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }


    @Override
    public String startEngine() {
        return String.format("BEV -> switch %d kWh battery on, Ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> usage under the average:L %.2f %n", avgKmPerCharge);
    }
}
