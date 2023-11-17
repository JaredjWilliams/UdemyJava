package com.example.udemyjavacourse.udemy_section_six.coding_exercises;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {

        if(number < 0) {
            return false;
        }

        int start = 1;
        int total = 0;

        while (start < number) {

            if(number % start == 0) {
                total += start;
            }

            start++;
        }

        return total == number;
    }
}
