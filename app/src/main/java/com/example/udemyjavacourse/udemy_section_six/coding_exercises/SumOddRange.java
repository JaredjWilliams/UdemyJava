package com.example.udemyjavacourse.udemy_section_six.coding_exercises;

public class SumOddRange {

    public boolean isOdd(int number) {

        if (number < 0) {
            return false;
        }

        return number % 2 == 1;
    }

    public int sumOdd(int start, int end) {
        int total = 0;

        if (start < 0 || end < 0) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                total += i;
            }
        }

        return total;
    }
}
