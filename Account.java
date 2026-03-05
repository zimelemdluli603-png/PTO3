public class Account
{
    private String accNumber;
    private double balance;
    
    
    public Account()
    {
        this.accNumber = "";
        this.balance = 0;
       
        
    }
    public Account(String accNumber, double balance)
    {
        this.accNumber = accNumber;
        this.balance = balance;
        
        
    }
    public void setAccNumber(String accNumber)
    {
        this.accNumber = accNumber;
    }
    public void setBalance(double bal)
    {
        this.balance = bal;
    }
    public String getAccNumber()
    {
        return accNumber;
    }
    public double getbalance()
    {
        return balance;
    }
    public void deposite(double amount)
    {
        if(amount > 0)
        {
            balance += amount;
        }
    }
    
}

