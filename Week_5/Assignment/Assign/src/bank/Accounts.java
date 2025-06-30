package bank;
import java.time.LocalDate;

public class Accounts 
{
    private int Account_num;
    private String Account_type;
    private int Acc_holder_id;
    private double balance;
    private LocalDate acc_creation;

    public Accounts(int Acc_holder_id, String Account_type, LocalDate acc_creation, double balance) 
    {
        this.Acc_holder_id = Acc_holder_id;
        this.Account_type = Account_type;
        this.acc_creation = acc_creation;
        this.balance = balance;
    }
    

    public int getAccount_num() {
        return Account_num;
    }

    public String getAccount_type() {
        return Account_type;
    }

    public void setAccount_type(String Account_type) {
        this.Account_type = Account_type;
    }

    public int getAcc_holder_id() {
        return Acc_holder_id;
    }

    public void setAcc_holder_id(int Acc_holder_id) {
        this.Acc_holder_id = Acc_holder_id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public LocalDate getAcc_creation() {
        return acc_creation;
    }

    public void setAcc_creation(LocalDate acc_creation) 
    {
        this.acc_creation = acc_creation;
    }
    
}
