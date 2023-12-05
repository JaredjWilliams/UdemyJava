package com.example.udemyjavacourse.udemy_section_eight.composition_challenge_two;

import com.example.udemyjavacourse.udemy_section_seven.Wall;

public class Bedroom {

    String name;
    Wall wall1;
    Wall wall2;
    Wall wall3;
    Wall wall4;
    Ceiling ceiling;
    Bed bed;
    Lamp lamp;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public void makeBed() {
        System.out.println("Bed is being made.");
        bed.make();
    }

    public Lamp getLamp() {
        return lamp;
    }
}
