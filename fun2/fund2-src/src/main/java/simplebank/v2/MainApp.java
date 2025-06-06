package simplebank.v2;

public class MainApp {
    public static void main(String[] args) {
        Account acc = new Account("1234-0001", 100.);
        System.out.printf(
            "Account %s has been created with a balance of %.2f baht.\n",
            acc.getAccountNumber(), acc.getBalance());
        acc.deposit(500.);
        acc.withdraw(400.);
        System.out.printf("Account %s now has a balance of %.2f baht.\n", 
            acc.getAccountNumber(), acc.getBalance());
        acc = null;
    }
}
