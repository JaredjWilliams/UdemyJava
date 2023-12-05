package com.example.udemyjavacourse.section_seven;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.udemy_section_seven.BankAccount;

import org.junit.Test;

public class ClassesChallengeTests {

    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount();
        account.setAccountBalance(100);
        account.withdraw(1);

        assertEquals(99, account.getAccountBalance(), 0);
    }

    @Test
    public void testWithdrawTooMuch() {
        BankAccount account = new BankAccount();
        account.setAccountBalance(100);
        account.withdraw(101);

        assertEquals(100, account.getAccountBalance(), 0);
    }
}
