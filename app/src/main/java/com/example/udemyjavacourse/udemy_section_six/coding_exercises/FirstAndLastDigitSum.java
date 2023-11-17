package com.example.udemyjavacourse.udemy_section_six.coding_exercises;

public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        int lastNumber = number % 10;
        int firstNumber = 0;

        if (number < 0) {
            return -1;
        }

        if (number < 9) {
            firstNumber = lastNumber;
        }

        while (number > 9) {

            number /= 10;

            if (number < 10) {
                firstNumber = number;
            }
        }

        return firstNumber + lastNumber;
    }
}
