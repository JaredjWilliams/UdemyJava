package com.example.udemyjavacourse.udemy_section_six.coding_exercises;

public class DiagonalStar {

    public static String printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
        }
        int row = 0;

        while (row < number) {

            StringBuilder string = new StringBuilder();
            int column = 0;

            while (column < number) {

                if (row == number - 1 || row == 0) {
                  string.append("*");
                } else if (column == 0 || column == number - 1) {
                    string.append("*");
                } else if (column == row || column == number - row -1) {
                    string.append("*");
                } else {
                    string.append(" ");
                }

                column++;
            }

            System.out.println(string);

            row++;
        }

        return "";
    }
}
