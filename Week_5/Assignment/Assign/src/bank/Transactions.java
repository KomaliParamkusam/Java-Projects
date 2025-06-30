package bank;


import java.time.LocalDateTime;

public class Transactions 
{
    private int Trans_id;
    private String Trans_type;
    private double trans_balance;
    private LocalDateTime trans_Date;
    private int acc_num;

    public Transactions(String Trans_type, int acc_num, LocalDateTime trans_Date, double trans_balance) 
    {
        this.Trans_type = Trans_type;
        this.acc_num = acc_num;
        this.trans_Date = trans_Date;
        this.trans_balance = trans_balance;
    }

    public int getTrans_id() 
    {
        return Trans_id;
    }
    
    public String getTrans_type() 
    {
        return Trans_type;
    }
    public void setTrans_type(String trans_type) 
    {
        Trans_type = trans_type;
    }
    public double getTrans_balance() 
    {
        return trans_balance;
    }
    public void setTrans_balance(double trans_balance) 
    {
        this.trans_balance = trans_balance;
    }
    public LocalDateTime getTrans_Date() 
    {
        return trans_Date;
    }
    public void setTrans_Date(LocalDateTime trans_Date) 
    {
        this.trans_Date = trans_Date;
    }
    public int getAcc_num() 
    {
        return acc_num;
    }
    public void setAcc_num(int acc_num) 
    {
        this.acc_num = acc_num;
    }
    
}
