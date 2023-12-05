package com.example.udemyjavacourse.udemy_section_six.coding_exercises;

import java.math.BigInteger;

public class LargestPrime {

    public static int getLargestPrime(int number) {

        if(number <= 1) {
            return -1;
        }

        int highest = 0;
        int start = number;

        while (start > 0) {

            BigInteger bigInteger1 = new BigInteger(String.valueOf(start));

            if(bigInteger1.isProbablePrime(100) && bigInteger1.intValue() > highest && number % start == 0) {
                highest = bigInteger1.intValue();
            }

            start--;
        }
        return highest;
    }
}
