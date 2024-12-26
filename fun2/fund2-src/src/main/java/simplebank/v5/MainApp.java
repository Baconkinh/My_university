package simplebank.v5;

public class MainApp {
    public static void main(String[] args) {
        AccountManager manager = new AccountManager();
        manager.openAccount(100.);
        manager.openAccount(200.);
        manager.openAccount(300.);
        manager.openAccount(400.);
        manager.openAccount(500.);

        System.out.println("Newly created accounts:");
        Account[] accounts = manager.listAccounts();
        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i]);
        }

        accounts[1].close();
        manager.getAccount(accounts[3].getAccountNumber()).close();

        accounts[0].withdraw(100.);
        Account acc = manager.getAccount("1234-0003");
        acc.withdraw(150.);

        try {
            manager.getAccount("1234-0004").withdraw(200);
        } catch (IllegalStateException e) {
            System.out.printf("Exception caught: %s\n", e.getMessage());
        }

        System.out.println("After closing some accounts:");
        accounts = manager.listAccounts();
        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i]);
        }
    }
}
