package com.example.udemyjavacourse.udemy_section_seven;

public class Customer {
    public String name;
    public int creditLimit;
    public String emailAddress;

    public Customer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public Customer() {
        this("Jared", 700, "Jared.Williams101697@gmail.com");
    }

    public Customer(String name, String emailAddress) {
        this(name, 700, emailAddress);
    }
    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
