package com.example.udemyjavacourse.udemy_section_seven;

public class Floor {

    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = width > -1 ? width : 0;
        this.length = length > -1 ? length : 0;
    }

    public double getArea() {
        return this.width * this.length;
    }
}
