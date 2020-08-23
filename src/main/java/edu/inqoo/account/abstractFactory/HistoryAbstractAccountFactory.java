package edu.inqoo.account.abstractFactory;

import edu.inqoo.account.Account;
import edu.inqoo.account.HistoryAccount;

public class HistoryAbstractAccountFactory implements AbstractAccountFactory {
    @Override
    public Account createAccount() {
        return new HistoryAccount();
    }
}
