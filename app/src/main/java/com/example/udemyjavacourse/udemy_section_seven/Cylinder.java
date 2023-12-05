package com.example.udemyjavacourse.udemy_section_seven;

public class Cylinder extends Circle {

    double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height > -1 ? height : 0;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }
}
