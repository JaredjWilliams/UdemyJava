package com.example.udemyjavacourse.section_nine;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VarargsTests {

    @Test
    public void test() {

        String[] splitStrings = "Hello World again".split(" ");


        printText(splitStrings);
        assertTrue(true);

        printText("Hello", "World", "Again");

        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(", ", sArray));
    }

    private void printText(String... textList) {
        for(String t: textList) {
            System.out.println(t);
        }
    }
}
