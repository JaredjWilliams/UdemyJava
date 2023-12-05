package com.example.udemyjavacourse.udemy_section_eight.composition_challenge;

public class CoffeeMaker {

    boolean hasWorkToDo;


    public String brewCoffee() {
        return hasWorkToDo ? "Brewing Coffee" : "No work to do";
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
