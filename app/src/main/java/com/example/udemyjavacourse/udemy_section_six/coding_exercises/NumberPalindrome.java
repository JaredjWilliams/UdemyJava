package com.example.udemyjavacourse.udemy_section_six.coding_exercises;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        int originalNumber = number;
        int inverseNumber = 0;

        if (number < 0) {
            number *= -1;
            originalNumber *= -1;
        }

        while (number != 0) {
            int lastDigit = number % 10;
            number /= 10;
            inverseNumber += lastDigit;

            if (number != 0) {
                inverseNumber = inverseNumber * 10;
            }
        }

        return originalNumber == inverseNumber;
    }
}
