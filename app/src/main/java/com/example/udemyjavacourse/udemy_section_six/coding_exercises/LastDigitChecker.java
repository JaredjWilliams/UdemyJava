package com.example.udemyjavacourse.udemy_section_six.coding_exercises;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int numberOne, int numberTwo, int numberThree) {
        int firstEndNumber = numberOne % 10;
        int secondEndNumber = numberTwo % 10;
        int thirdEndNumber = numberThree % 10;

        if (!isValid(numberOne) || !isValid(numberTwo) || !isValid(numberThree)) {
            return false;
        }

        return firstEndNumber == secondEndNumber || firstEndNumber == thirdEndNumber || secondEndNumber == thirdEndNumber;
    }

    public static boolean isValid(int number) {
        return number > 9 && number <= 1000;
    }
}
