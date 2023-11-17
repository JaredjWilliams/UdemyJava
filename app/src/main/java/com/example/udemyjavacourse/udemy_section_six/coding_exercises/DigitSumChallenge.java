package com.example.udemyjavacourse.udemy_section_six.coding_exercises;

public class DigitSumChallenge {

    public int sumDigits(int number) {

        String stringNumber = String.valueOf(number);
        int end = stringNumber.length() - 1;
        int total = 0;
        int start = 0;

        if (number < 0) {
            return -1;
        }

        while (start <= end) {
            int valueToAdd = Character.getNumericValue(stringNumber.charAt(start));

            total += valueToAdd;

            start++;
        }

        return total;
    }
}
