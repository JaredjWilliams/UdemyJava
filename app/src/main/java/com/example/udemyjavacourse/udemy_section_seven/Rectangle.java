package com.example.udemyjavacourse.udemy_section_seven;

public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width > -1 ? width : 0;
        this.length = length > -1 ? length : 0;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return length * width;
    }

}
