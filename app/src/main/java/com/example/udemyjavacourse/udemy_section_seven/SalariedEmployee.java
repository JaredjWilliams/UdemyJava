package com.example.udemyjavacourse.udemy_section_seven;

public class SalariedEmployee extends Employee {

    private double annualSalary;
    private boolean isRetired;
    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {

        double paycheck = annualSalary / 26;
        double adjustedpay = isRetired ? 0.9 * paycheck : paycheck;
        return (int) adjustedpay;
    }

    public void retire() {
        terminate("11/21/2023");
        isRetired = true;
    }
}
