package com.example.udemyjavacourse.udemy_section_seven;

public class InheritanceChallenge {

    public static String testingInheritanceEmployees() {
        SalariedEmployee jared = new SalariedEmployee(
                "Jared", "10/16/1997", "January 6th", 65000);

        System.out.println(jared);
        System.out.println("Age = " + jared.getAge());
        System.out.println("Pay = " + jared.collectPay());


        SalariedEmployee emily = new SalariedEmployee("Emily", "12/15/2000", "11/21/2023", 50000);
        System.out.println(emily);
        System.out.println("Age = " + emily.getAge());
        System.out.println("Pay = " + emily.collectPay());
        System.out.println("Emily's Paycheck = $" + emily.collectPay());

        emily.retire();

        System.out.println("Emily's Pension check = $" + emily.collectPay());


        return "";
    }
}
