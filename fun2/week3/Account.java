
public class Account {

    private String account_number;
    private double balance;

    public Account(String accNumber, double initialbalance) {
        this.account_number = accNumber;
        this.balance = initialbalance;
    }

    public void print() {
        System.out.println("Account" + account_number + ", balance = " + balance);
    }
}
