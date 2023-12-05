package com.example.udemyjavacourse.udemy_section_six.scanners;

import androidx.annotation.NonNull;

import java.util.Scanner;

public class ReadingUserInput {

    public static String printResults() {

        int currentYear = 2023;

        try {
            System.out.println(getInputFromConsole(currentYear));
            return getInputFromConsole(currentYear);
        } catch (NullPointerException e) {
            System.out.println();
            return getInputFromScanner(currentYear);
        }
    }

    @NonNull
    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, whats your name");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + " , thanks for taking the course.");

        System.out.println("What year were you born?");
        String dateOfBirth = scanner.nextLine();

        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }
    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, what's your name");
        System.out.println("Hi " + name + " , thanks for taking the course.");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }
}
