package com.example.udemyjavacourse.udemy_section_six.coding_exercises;

public class SumThreeAndFive {

    public int sumValues(int numbers) {
        int count = 0;
        int amount = 0;

        for (int number = 1; count < 5 && number <= numbers; number++) {
            if (number % 3 == 0 && number % 5 == 0) {
                count++;
                amount += number;
            }
        }

        return amount;
    }
}
