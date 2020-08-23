package edu.inqoo.account.abstractFactory;

import edu.inqoo.account.Account;
import edu.inqoo.account.NormalAccount;

public class NormalAbstractAccountFactory implements AbstractAccountFactory {
    @Override
    public Account createAccount() {
        return new NormalAccount();
    }
}
