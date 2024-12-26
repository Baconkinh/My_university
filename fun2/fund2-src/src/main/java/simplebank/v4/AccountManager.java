package simplebank.v4;

import java.util.NoSuchElementException;

public class AccountManager {
    public static final int MAX_ACCOUNTS = 100;

    private Account[] accounts = new Account[MAX_ACCOUNTS];
    private int numAccounts = 0;

    private int findAccountIndex(String accountNumber) {
        for (int i = 0; i < numAccounts; i++) 
            if (accounts[i].getAccountNumber().contentEquals(accountNumber))
                return i;
        throw new NoSuchElementException("No such account number.");
    }

    private int countActiveAccounts() {
        int count = 0;
        for (int i = 0; i < numAccounts; i++) 
            if (accounts[i].getStatus() == Account.Status.ACTIVE)
                count++;
        return count;
    }

    public Account openAccount(double initialBalance) {
        if (numAccounts >= MAX_ACCOUNTS) 
            throw new IllegalStateException("Too many opened accounts.");
        Account account = new Account(initialBalance);
        accounts[numAccounts++] = account;
        
        return account;
    }

    public Account getAccount(String accountNumber) {
        return accounts[findAccountIndex(accountNumber)];
    }

    public Account[] listAccounts() {
        Account[] results = new Account[countActiveAccounts()];

        int idx = 0;
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getStatus() == Account.Status.ACTIVE) 
                results[idx++] = accounts[i];
        }
        return results;
    }
}
