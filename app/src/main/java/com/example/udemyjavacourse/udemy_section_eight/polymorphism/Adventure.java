package com.example.udemyjavacourse.udemy_section_eight.polymorphism;

public class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println(" I like adventure movies.");

    }
}
