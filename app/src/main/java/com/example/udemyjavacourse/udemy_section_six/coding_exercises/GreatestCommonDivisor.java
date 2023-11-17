package com.example.udemyjavacourse.udemy_section_six.coding_exercises;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        int start = 1;
        int highest = 0;
        if (first < 10 || second < 10) {
            return -1;
        }
        while (start <= first) {
            if(first % start == 0 && second % start == 0 && start > highest) {
                highest = start;
            }
            start++;
        }
        return highest;
    }
}
