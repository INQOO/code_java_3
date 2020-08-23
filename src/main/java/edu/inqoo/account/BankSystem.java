package edu.inqoo.account;

import edu.inqoo.account.abstractFactory.AbstractAccountFactory;
import edu.inqoo.account.abstractFactory.HistoryAbstractAccountFactory;
import edu.inqoo.account.abstractFactory.NormalAbstractAccountFactory;

import java.util.ArrayList;
import java.util.List;

public class BankSystem {

    List<Account> accountList = new ArrayList<>();

    AbstractAccountFactory normalAbstractAccountFactory = new NormalAbstractAccountFactory();
    AbstractAccountFactory historyAbstractAccountFactory = new HistoryAbstractAccountFactory();

    public void createAccount(AccountType accountType){
        accountList.add(AccountFactory.createAccount(accountType));
    }

    public void creatNormalAccount(){
        accountList.add(normalAbstractAccountFactory.createAccount());
    }

    public void createHistoryAccount(){
        accountList.add(historyAbstractAccountFactory.createAccount());
    }

}
