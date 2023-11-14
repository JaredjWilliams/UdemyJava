package com.example.udemyjavacourse.udemy_section_six.coding_exercises;

public class MiniChallengeForLoop {

    public static void calculateInterest(int amount) {
        for (double rate = 7.5; rate < 10; rate += 0.25) {
            System.out.println("interest at " + rate + " is: " + amount * rate);
        }
    }
}
