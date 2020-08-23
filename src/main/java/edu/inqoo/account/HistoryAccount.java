package edu.inqoo.account;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.TreeSet;

import static edu.inqoo.account.TransactionType.DEPOSIT;
import static edu.inqoo.account.TransactionType.WITHDRAW;

public class HistoryAccount implements Account {

    private BigDecimal balance = BigDecimal.ZERO;
    private Set<Transaction> history = new TreeSet<>();

    public void deposit(BigDecimal amountToAdd) {
        history.add(new Transaction(DEPOSIT, LocalDateTime.now(), amountToAdd));
        balance = balance.add(amountToAdd);
    }

    public void withdraw(BigDecimal amountToWithdraw) {
        history.add(new Transaction(WITHDRAW, LocalDateTime.now(), amountToWithdraw));
        if (balance.compareTo(amountToWithdraw) > 0) {
            balance = balance.subtract(amountToWithdraw);
        }
    }




    @Override
    public void showHistory() {
        for (Transaction transaction:history
             ) {
            transaction.toString();
        }
    }
}
