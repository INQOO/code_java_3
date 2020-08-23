package edu.inqoo.account;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {

    private TransactionType type;
    private LocalDateTime time;
    private BigDecimal value;

    public Transaction(TransactionType type, LocalDateTime time, BigDecimal value) {
        this.type = type;
        this.time = time;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "type=" + type +
                ", time=" + time +
                ", value=" + value +
                '}';
    }
}
