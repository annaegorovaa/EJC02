package com.epam.hw4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BalanceTest {
    private Balance balance;

    @Before
    public void setup() {
        balance = new Balance();
    }

    @Test
    public void testDepositOK() {
        balance.deposit(25);
        Assert.assertEquals(25, balance.getBalance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDepositWrongInput() {
        balance.deposit(-100);
    }

    @Test
    public void testWithdrawOK() {
        balance.deposit(100);
        balance.withdraw(50);
        Assert.assertEquals(50, balance.getBalance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithdrawForbiddenWhenNotEnoughAmount() {
        balance.deposit(50);
        balance.withdraw(51);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithdrawWrongInput() {
        balance.withdraw(-100);
    }
}
