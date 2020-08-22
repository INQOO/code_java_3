package edu.inqoo.account;

import java.math.BigDecimal;

public interface Account {

    void deposit(BigDecimal amountToAdd);

    void withdraw(BigDecimal amountToWithdraw);

    void showHistory();

}
