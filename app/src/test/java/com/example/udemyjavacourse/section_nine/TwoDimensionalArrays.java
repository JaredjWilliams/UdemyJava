package com.example.udemyjavacourse.section_nine;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TwoDimensionalArrays {



    @Test
    public void test() {

        Object[] anyArray = new Object[3];

        anyArray[0] = new String[][] {
                {"1", "2"},
                {"3", "4", "5"},
                {"6", "7", "8", "9"}
        };
        anyArray[1] = new String[] {"a", "b", "c"};

        anyArray[2] = new int[2][2][2];
//        anyArray[2] = "Hello"; Will throw ClassCastException because String is cast to an Object[]

        System.out.println(Arrays.deepToString(anyArray));

        for (Object element : anyArray) {
            System.out.println("class: " + element.getClass().getSimpleName());
            System.out.println(Arrays.deepToString((Object[]) element));
        }

        assertTrue(true);
    }

    @Test
    public void testImmutabilityOfListOf() {

        String[] days = new String[] {"Sunday", "Monday", "Tuesday"};
        List<String> listOfDays = List.of(days);

        listOfDays.set(0, "Thursday");

        System.out.println(listOfDays);


        assertTrue(true);
    }
}
