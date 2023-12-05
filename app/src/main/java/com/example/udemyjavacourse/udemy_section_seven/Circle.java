package com.example.udemyjavacourse.udemy_section_seven;

public class Circle {

    double radius;

    public Circle(double radius) {
        this.radius = radius > -1 ? radius : 0;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
