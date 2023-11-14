package com.example.udemyjavacourse.udemy_section_five.coding_exercises;

public class EqualityPrinter {

    public void printEqual(int numOne, int numTwo, int numThree) {
        if (numOne < 0 || numTwo < 0 || numThree < 0) {
            System.out.println("Invalid Value");
        } else if (numOne == numTwo && numOne == numThree) {
            System.out.println("All numbers are equal");
        } else if (numOne == numTwo || numTwo == numThree || numThree == numOne) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are different");
        }
    }

}
