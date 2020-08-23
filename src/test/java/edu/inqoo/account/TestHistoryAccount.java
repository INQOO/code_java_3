package edu.inqoo.account;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static edu.inqoo.account.TransactionType.DEPOSIT;
import static edu.inqoo.account.TransactionType.WITHDRAW;

public class TestHistoryAccount {
    @Test
    public void should() {
        Account account = new HistoryAccount();
        account.deposit(BigDecimal.valueOf(5000));
        account.deposit(BigDecimal.valueOf(30000));
        account.withdraw(BigDecimal.valueOf(3000));
        account.showHistory();
    }

}
