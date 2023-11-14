package com.example.udemyjavacourse.udemy_section_six.coding_exercises;

import java.math.BigInteger;
import java.util.Arrays;

public class PrimeNumber {

    public static boolean isPrime(int wholeNumber) {

        BigInteger number = new BigInteger(String.valueOf(wholeNumber));


        return number.isProbablePrime(1);
    }
}
