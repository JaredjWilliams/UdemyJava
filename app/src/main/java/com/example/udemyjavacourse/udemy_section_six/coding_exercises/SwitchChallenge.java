package com.example.udemyjavacourse.udemy_section_six.coding_exercises;

public class SwitchChallenge {

    public String getNatoLetter(String word) {
        return switch (word) {
            case "Able" -> "A";
            case "Baker" -> "B";
            case "Charlie" -> "C";
            case "Dog" -> "D";
            default -> "Not a letter";
        };
    }
}
