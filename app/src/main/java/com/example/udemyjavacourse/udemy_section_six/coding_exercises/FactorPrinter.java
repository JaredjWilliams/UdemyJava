package com.example.udemyjavacourse.udemy_section_six.coding_exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FactorPrinter {

    public static List<Integer> printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return List.of(-1);
        }

        List<Integer> factors = new ArrayList<>();
        int start = 1;

        while (start <= number) {

            if (number % start == 0) {
                factors.add(start);
            }

            start++;
        }

        return factors;
    }
}
