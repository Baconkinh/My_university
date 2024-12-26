package simplebank.v1;

public class MainApp {
    public static void main(String[] args) {
        Account acc = new Account("1234-0001", 100.);
        System.out.printf(
            "Account %s has been created with a balance of %.2f baht.\n",
            acc.getAccountNumber(), acc.getBalance());
        acc.deposit(500.);
        acc.withdraw(400.);
        // unauthroized direct updates are prohibited
        // acc.accountNumber = "1234-0002";
        // acc.balance += 500.
        
        //overdrawn balance
        acc.withdraw(800.);  
        System.out.printf(
            "Account %s now has a balance of %.2f baht.\n",
            acc.getAccountNumber(), acc.getBalance());

        // To delete the object, just remove the reference and let 
        // Garbage collector do its job.
        acc = null;
    }
}
