
public class Account {

    private String accountNumber;
    private double balance;
    private boolean checkTF = true;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;

        if (initialBalance <= 0.) {
            throw new IllegalArgumentException("Initial balance must be positive."); 
        }else {
            this.balance = initialBalance;
        }
    }

    public void suspend() {
        this.checkTF = false;

    }

    public void reactivate() {
        this.checkTF = true;

    }

    public boolean isActive() {
        return checkTF;
    }

    public void deposit(double amount) {
        if (checkTF == false) {
            throw new IllegalStateException("Account is suspended.");
        } else {
            if (amount <= 0.) {
                throw new IllegalArgumentException("Amount must be positive."); 
            }else {
                balance += amount;
            }
        }
    }

    public void withdraw(double amount) {
        if (checkTF == false) {
            throw new IllegalStateException("Account is suspended.");
        }else{
        if (amount <= 0. || amount > balance) {
            throw new IllegalArgumentException("Amount must be positive and not exceeding balance."); 
        }else {
            balance -= amount;
        }
    }}

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
