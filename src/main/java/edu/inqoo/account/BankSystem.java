package edu.inqoo.account;

import java.util.ArrayList;
import java.util.List;

public class BankSystem {

    List<Account> accountList = new ArrayList<>();

    public void createAccount(AccountType accountType){
        accountList.add(AccountFactory.createAccount(accountType));
    }

}
