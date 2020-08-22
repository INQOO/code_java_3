package edu.inqoo.account;

import java.math.BigDecimal;

public class NormalAccount implements Account {

    private BigDecimal balance = BigDecimal.ZERO;

    public void deposit(BigDecimal amountToAdd) {
        balance = balance.add(amountToAdd);
    }

    public void withdraw(BigDecimal amountToWithdraw) {
        if (balance.compareTo(amountToWithdraw) > 0) {
            balance = balance.subtract(amountToWithdraw);
        }
    }
}

