package com.example.udemyjavacourse.codingExercises;

import java.math.BigDecimal;

public class MegaBytesConverter {

    public String printMegaBytesAndKiloBytes(int kilobytes) {

        if (kilobytes < 0) {
            System.out.println("Invalid Value");
            return "Invalid Value";
        }

        int kilos = kilobytes / 1024;
        int remainder = kilobytes % 1024;

        return "" + kilobytes + " KB = " + kilos + " MB " + "and " + remainder + " KB";
    }
}
