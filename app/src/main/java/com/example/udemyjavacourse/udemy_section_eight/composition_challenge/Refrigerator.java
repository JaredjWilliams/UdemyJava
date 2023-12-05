package com.example.udemyjavacourse.udemy_section_eight.composition_challenge;

public class Refrigerator {

    boolean hasWorkToDo;

    public String orderFood() {
        return hasWorkToDo ? "Ordering food" : "No work to be done";
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
