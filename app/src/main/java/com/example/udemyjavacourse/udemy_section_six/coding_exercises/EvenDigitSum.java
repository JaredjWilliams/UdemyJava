package com.example.udemyjavacourse.udemy_section_six.coding_exercises;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        int total = 0;

        if (number < 0) {
            return -1;
        }

        while (number > 1) {

            int endNumber = number % 10;

            if (endNumber % 2 == 0) {
                total += endNumber;
            }

            number /= 10;
        }

        return total;
    }
}
