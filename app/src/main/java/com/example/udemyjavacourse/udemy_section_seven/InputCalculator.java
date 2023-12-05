package com.example.udemyjavacourse.udemy_section_seven;

import java.util.Scanner;

public class InputCalculator {


    public void inputThenPrintSumAndAverage() {
        Scanner getInput = new Scanner(System.in);

        int sum = 0;
        long avg = 0;
        int inputs = 0;

        while(getInput.hasNextInt()) {
            inputs++;

            int input = getInput.nextInt();

            sum += input;
            avg = Math.round((double) sum / inputs);
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
