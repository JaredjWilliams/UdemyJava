package com.example.udemyjavacourse.udemy_section_six.coding_exercises;

import java.math.BigInteger;

public class TheForLoopChallenge {

    public int findPrimeNumbers(int totalNumbers) {
        int amount = 0;
        for (int number = 2; number <= totalNumbers; number++) {

            BigInteger integer = new BigInteger(String.valueOf(number));

            if (integer.isProbablePrime(100)) {
                amount++;
            }
        }

        return amount;
    }
}
