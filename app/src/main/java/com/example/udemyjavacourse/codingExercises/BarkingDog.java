package com.example.udemyjavacourse.codingExercises;

public class BarkingDog {

    public boolean shouldWakeUp(boolean isBarking, int hourOfDay) {

        boolean isInWindow =  hourOfDay < 8 || hourOfDay > 22;
        boolean shouldWakeUp = false;

        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        if (isBarking && isInWindow) {
            shouldWakeUp = true;
        }

        return shouldWakeUp;
    }
}
