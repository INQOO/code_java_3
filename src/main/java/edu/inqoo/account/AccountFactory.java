package edu.inqoo.account;

public class AccountFactory {

    private AccountFactory(){}

    public static Account createAccount(AccountType accountType){
        if(AccountType.NORMAL.equals(accountType)){
            return new NormalAccount();
        }else{
            return new HistoryAccount();
        }

    }
}
