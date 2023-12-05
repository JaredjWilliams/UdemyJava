package com.example.udemyjavacourse.udemy_section_six.coding_exercises;

public class NumbersToWords {

    public static String numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
            return "";
        }

        if(number == 0) {
            System.out.println("Zero");
        }
        int reversedNumber = reverse(number);
        int digitCount = getDigitCount(number);

        while (digitCount > 0) {
            int endNumber = reversedNumber % 10;
            switch (endNumber) {
                case 0 -> { System.out.println("Zero"); }
                case 1 -> { System.out.println("One"); }
                case 2 -> { System.out.println("Two"); }
                case 3 -> { System.out.println("Three"); }
                case 4 -> { System.out.println("Four"); }
                case 5 -> { System.out.println("Five"); }
                case 6 -> { System.out.println("Six"); }
                case 7 -> { System.out.println("Seven"); }
                case 8 -> { System.out.println("Eight"); }
                case 9 -> { System.out.println("Nine"); }
                default -> { System.out.println("Not a value"); }
            }
            reversedNumber /= 10;
            digitCount--;
        }

        return "";
    }

    public static int reverse(int number) {
        int originalNumber = number;
        if(number < 0) {
            originalNumber *= -1;
        }
        int inverseNumber = 0;
        while (originalNumber != 0) {
            int lastDigit = originalNumber % 10;
            originalNumber /= 10;
            inverseNumber += lastDigit;
            if (originalNumber != 0) {
                inverseNumber = inverseNumber * 10;
            }
        }
        if(number < 0) {
            inverseNumber *= -1;
        }
        return inverseNumber;
    }

    public static int getDigitCount(int number) {
        if(number < 0) {
            return -1;
        }
        if(number == 0) {
            return 1;
        }
        int digitCount = 0;
        while (number > 0) {
            digitCount++;
            number /= 10;
        }
        return digitCount;
    }
}
