package com.example.udemyjavacourse.section_seven;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.udemy_section_seven.InheritanceChallenge;
import com.example.udemyjavacourse.udemy_section_seven.TheObjectClass;

import org.junit.Test;

public class TheObjectClassTests {

    @Test
    public void test() {
        assertEquals("fail", TheObjectClass.theObjectClass());
    }

    @Test
    public void testInheritance() {
        assertEquals("fails", InheritanceChallenge.testingInheritanceEmployees());
    }
}
