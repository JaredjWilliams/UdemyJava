package com.example.udemyjavacourse.udemy_section_seven;

public class Carpet {

    private double cost;

    public Carpet(double cost) {
        this.cost = cost > -1 ? cost : 0;
    }

    public double getCost() {
        return cost;
    }
}
