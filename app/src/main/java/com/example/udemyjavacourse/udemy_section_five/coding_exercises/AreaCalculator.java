package com.example.udemyjavacourse.udemy_section_five.coding_exercises;

public class AreaCalculator {

    public double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }

        return Math.PI * Math.pow((float) radius, 2);
    }

    public double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }

        return x * y;
    }
}
