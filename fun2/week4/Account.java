import java.io.ObjectInputFilter;

public class Account {
    public enum Status{
        ACTIVE,CLOSED,SUSPENDED
    }
    Status status;
    String number;
    double balance;

    Account(String number,double balance,Status status){
        this.status=status;
        this.number=number;
        this.balance=balance;


}
public void show(){
    System.out.println("Account Number:"+", balance="+balance+"status ="+status);
}
}
