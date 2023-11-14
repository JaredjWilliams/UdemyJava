package com.example.udemyjavacourse.udemy_section_six.coding_exercises;

public class NumberInWord {

    public String printNumberInWord(int number) {
        return switch (number) {
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            default -> "OTHER";
        };
    }
}
