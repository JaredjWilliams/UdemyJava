package com.example.udemyjavacourse.codingExercises;

public class DecimalComparator {

    public boolean areEqualByThreeDecimalPlaces(double valueOne, double valueTwo) {
        boolean isUpToThree = false;

        if (valueOne == valueTwo) {
            return true;
        } else if (("" + valueOne).length() < 4 || ("" + valueTwo).length() < 4) {
            return false;
        }

        String substringOne = ("" + valueOne).substring(0, 5);
        String substringTwo = ("" + valueTwo).substring(0, 5);

        if ((substringOne.equals(substringTwo)) || valueOne == valueTwo) {
            isUpToThree = true;
        }

        return isUpToThree;
    }
}
