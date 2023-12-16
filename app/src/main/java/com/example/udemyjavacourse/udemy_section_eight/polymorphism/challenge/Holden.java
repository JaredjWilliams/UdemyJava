package com.example.udemyjavacourse.udemy_section_eight.polymorphism.challenge;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}
