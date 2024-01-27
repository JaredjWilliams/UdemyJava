package com.example.udemyjavacourse.section_nine;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MinumumElementChallenge {

    @Test
    public void test() {

        int[] intArray = { 7, 2, 1, 4, 5, 6};
        int min = findMin(intArray);

        assertEquals(1, min);
    }

    public int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of comma separated numbers.");
        String input = scanner.nextLine();

        String[] strings = input.split(",");

        return Arrays.stream(strings)
                .map(String::trim)
                .mapToInt(Integer::valueOf)
                .toArray();
    }

    public int findMin(int[] intArray) {
        return Collections.min(Arrays.stream(intArray).boxed().collect(Collectors.toList()));
    }
}
