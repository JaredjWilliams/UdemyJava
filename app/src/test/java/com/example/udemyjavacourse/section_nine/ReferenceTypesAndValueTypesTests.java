package com.example.udemyjavacourse.section_nine;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Arrays;

public class ReferenceTypesAndValueTypesTests {

    @Test
    public void tests() {

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
        // reference to the same object.

        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherArray));

        myIntArray[0] = 1;

        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherArray));

        assertTrue(true);
    }
}
