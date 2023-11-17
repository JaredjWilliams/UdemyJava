package com.example.udemyjavacourse.udemy_section_six.coding_exercises;

import java.util.ArrayList;
import java.util.List;

public class TheWhileLoopChallenge {

    public boolean isEvenNumber(int number) {
        return number % 2 ==0;
    }

    public List<Integer> printEvenNumbers(int start, int end) {
        List<Integer> evenNumbers = new ArrayList<>();

        while (start <= end) {

            if (isEvenNumber(start)) {
                evenNumbers.add(start);
            }
            start++;
        }

        return evenNumbers;
    }

    public int printTotalEvenNumbers(int start, int end) {
        int total = 0;

        while (start <= end && total != 5) {
            if (isEvenNumber(start)) {
                total++;
            }

            start++;
        }

        return total;
    }
}
