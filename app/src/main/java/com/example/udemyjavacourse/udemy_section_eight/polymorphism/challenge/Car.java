package com.example.udemyjavacourse.udemy_section_eight.polymorphism.challenge;

public class Car {

    private String description;
    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public Car(String description) {
        this.description = description;
    }

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public String startEngine() {
        System.out.println("Car -> startEngine");
        return "Car -> startEngine()";
    }

    public String accelerate() {
        System.out.printf("Car -> accelerating, type is " + getClass().getSimpleName());
        return "Car -> accelerate()";
    }

    public String brake() {
        System.out.println("Car -> braking, type is " + getClass().getSimpleName());
        return "Car -> brake()";
    }

    public void drive() {
        System.out.println("Car -> driving, type is " + getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine() {
        System.out.println("Car -> runEngine");
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
