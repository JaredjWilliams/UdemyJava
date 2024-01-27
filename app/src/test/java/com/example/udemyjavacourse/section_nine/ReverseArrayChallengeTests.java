package com.example.udemyjavacourse.section_nine;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseArrayChallengeTests {

    @Test
    public void testReverseArray() {

        int[] input = new int[6];

        for (int i = 0; i < 6; i++) {
            input[i] = i + 1;
        }

        int[] output = {6, 5, 4, 3, 2, 1};

        boolean isEqual = Arrays.equals(output, reverse(input));

        assertTrue(isEqual);
    }

    public int[] reverse(int[] input) {

        for (int i = 0; i < input.length / 2; i++) {
            int temp = input[i];
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(input));

        return input;
    }

    private static int[] reversedCopy(int[] input) {

        int[] reversedArray = new int[input.length];
        int maxIndex = input.length - 1;

        for (int el : input) {
            reversedArray[maxIndex--] = el;
        }

        return reversedArray;
    }
}
