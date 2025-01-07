
public class Accounttest {//array
    public static void main(String[] args) {
        Account[] accounts=new Account[5];
        for (int i = 0 ;i < 5; i++) {
            String number="000"+(i+1);
            double amount =(i+1)*100;
            Account.Status status=Math.random() >0.5? Account.Status.ACTIVE:Account.Status.CLOSED;

            accounts[i]=new Account(number, amount, status);
        }
        for(Account a: accounts)
            a.show();
    }
}
