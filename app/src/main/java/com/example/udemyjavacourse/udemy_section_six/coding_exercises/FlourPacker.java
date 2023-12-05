package com.example.udemyjavacourse.udemy_section_six.coding_exercises;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        while (bigCount > 0) {

            if(goal - 5 < 0) {
                break;
            }

            goal -= 5;
            bigCount--;
        }

        while (smallCount > 0) {

            smallCount--;
            goal--;

        }

        return goal <= 0 ;
    }
}
