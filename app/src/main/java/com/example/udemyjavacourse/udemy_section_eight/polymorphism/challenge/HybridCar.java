package com.example.udemyjavacourse.udemy_section_eight.polymorphism.challenge;

public class HybridCar extends Car {

    private double avgKmPerCharge;
    private int batterySize = 6;
    private int cylinders;
    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLiter, int cylinders, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerLiter;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    public String startEngine() {
        return String.format("Hybrid -> %d cylinders are fired up.%n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage below average:L %.2f %n", avgKmPerCharge);
    }

}
