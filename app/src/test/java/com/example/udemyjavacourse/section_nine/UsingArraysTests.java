package com.example.udemyjavacourse.section_nine;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class UsingArraysTests {

    @Test
    public void usingArraysTests() {

        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));

        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(fourthArray));

        int[] smallArray = Arrays.copyOf(thirdArray,5);
        System.out.println(Arrays.toString(smallArray));

        int[] largeArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largeArray));

        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Mark") >= 0) {
            System.out.println("Found Mark in the list");
        }

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5};

        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }


        assertTrue(true);
    }

    @Test
    public void arraysChallenge() {


        int[] numArray = {11, 5, 7, 19, 6};
        System.out.println(Arrays.toString(numArray));
        Arrays.sort(numArray);
        reverseArray(numArray);

        System.out.println(Arrays.toString(numArray));

        assertTrue(true);
    }

    public void reverseArray(int[] numArray) {


        for (int i = 0; i < numArray.length / 2; i++) {
            int temp = numArray[i];

            numArray[i] = numArray[numArray.length - i - 1];

            numArray[numArray.length - i - 1] = temp;
        }

    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];

        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }

    private void codingChallenge() {
        Scanner scanner = new Scanner(System.in);
        int[] numArray = new int[5];

        int i = 0;
        while(scanner.hasNextInt()) {
            int input = scanner.nextInt();
            numArray[i] = input;
            i++;
        }

    }

    public static int[] getIntegers(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] numArray = new int[size];

        int i = 0;
        while(i != size) {
            int input = scanner.nextInt();
            numArray[i] = input;

            i++;
        }

        return numArray;
    }

}
