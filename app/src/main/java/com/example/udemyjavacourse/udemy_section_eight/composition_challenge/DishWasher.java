package com.example.udemyjavacourse.udemy_section_eight.composition_challenge;

public class DishWasher {

    boolean hasWorkToDo;
    public String doDishes() {
        return hasWorkToDo ? "Doing dishes" : "No work to be done";
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
