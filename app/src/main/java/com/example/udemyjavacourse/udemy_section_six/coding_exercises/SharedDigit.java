package com.example.udemyjavacourse.udemy_section_six.coding_exercises;

public class SharedDigit {

    public static boolean hasSharedDigit(int numberOne, int numberTwo) {

        boolean isShared = false;

        if (numberOne < 10 || numberOne > 99 || numberTwo < 10 || numberTwo > 99) {
            return false;
        }

        while (numberOne >= 1) {

            int endNumber = numberOne % 10;
            int originalSecondNumber = numberTwo;
            while (originalSecondNumber >= 1) {

                int otherEndNumber = originalSecondNumber % 10;

                if (endNumber == otherEndNumber) {
                    isShared = true;
                }

                originalSecondNumber /= 10;
            }
            numberOne /= 10;
        }

        return isShared;
    }
}
