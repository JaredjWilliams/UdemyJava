package com.example.udemyjavacourse.section_seven;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.udemy_section_seven.Point;

import org.junit.Test;

public class PointTests {

    @Test
    public void testDistanceNoParams() {
        Point first = new Point(6, 5);

        assertEquals(7.810249675906654, first.distance(), 0);
    }

    @Test
    public void testDistanceOneParam() {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

        assertEquals(5.0, first.distance(second), 0);
    }

    @Test
    public void testDistanceTwoParams() {
        Point first = new Point(6, 5);

        assertEquals(5.0, first.distance(2, 2), 0);
    }

    @Test
    public void testDistancePointZero() {
        Point point = new Point();

        assertEquals(0.0, point.distance(), 0);
    }
}
