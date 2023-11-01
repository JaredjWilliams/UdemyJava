package com.example.udemyjavacourse.codingExercises;


import java.time.temporal.ValueRange;
import java.util.List;

public class TeenNumberChecker {

    public boolean hasTeen(int valueOne, int valueTwo, int valueThree) {
        boolean isInTeens = false;

        List<Integer> values = List.of(valueOne, valueTwo, valueThree);

        for (Integer value : values) {
            isInTeens = isTeen(value);
            if (isTeen(value)) {
                return isInTeens;
            }

        }

        return isInTeens;
    }

    public boolean isTeen(int value) {
        return ValueRange.of(13, 19).isValidIntValue(value);
    }
}
