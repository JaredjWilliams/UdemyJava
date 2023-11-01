package com.example.udemyjavacourse;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.codingExercises.DecimalComparator;

import org.junit.Test;

public class DecimalComparatorTests {

    DecimalComparator decimalComparator = new DecimalComparator();

    // METHOD: boolean areEqualByThreeDecimalPlaces(double valueOne, double valueTwo)
    // WHEN: decimals are not equal in any value place
    // RETURN: False
    @Test
    public void testNotEqualInAnyValuePlace() {
        assertEquals(false, decimalComparator.areEqualByThreeDecimalPlaces(4.456, 7.912));
    }

    // METHOD: boolean areEqualByThreeDecimalPlaces(double valueOne, double valueTwo)
    // WHEN: decimal places are equal up to one value place
    // RETURN: False

    @Test
    public void testEqualUpToOneValuePlace() {
        assertEquals(false, decimalComparator.areEqualByThreeDecimalPlaces(3.123, 3.145));
    }

    // METHOD: boolean areEqualByThreeDecimalPlaces(double valueOne, double valueTwo)
    // WHEN: decimal places are equal up to two value place
    // RETURN: False
    @Test
    public void testEqualUpToTwoValuePlaces() {
        assertEquals(false, decimalComparator.areEqualByThreeDecimalPlaces(3.123, 3.124));
    }
    // METHOD: boolean areEqualByThreeDecimalPlaces(double valueOne, double valueTwo)
    // WHEN: decimal places are equal up to three value place
    // RETURN: True
    @Test
    public void testEqualsThreeValuePlaces() {
        assertEquals(true, decimalComparator.areEqualByThreeDecimalPlaces(3.123, 3.123));
    }

    // METHOD: boolean areEqualByThreeDecimalPlaces(double valueOne, double valueTwo)
    // WHEN: number is whole and not equal
    // RETURNS: False
    @Test
    public void testWholeNumbersAreNotEqual() {
        assertEquals(false, decimalComparator.areEqualByThreeDecimalPlaces(4, 5));
    }
    // METHOD: boolean areEqualByThreeDecimalPlaces(double valueOne, double valueTwo)
    // WHEN: numbers are whole and equal
    // RETURNS: True
    @Test
    public void testWholeNumbersAreEqual() {
        assertEquals(true, decimalComparator.areEqualByThreeDecimalPlaces(0, 0));
    }
}
