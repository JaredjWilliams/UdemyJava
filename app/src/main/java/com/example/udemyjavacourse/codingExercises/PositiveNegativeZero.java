package com.example.udemyjavacourse.codingExercises;

public class PositiveNegativeZero {

    public String positiveNegativeZero(int number) {
        if (number > 0) {
            return "positive";
        } else if (number < 0) {
            return "negative";
        } else {
            return "zero";
        }
    }
}
