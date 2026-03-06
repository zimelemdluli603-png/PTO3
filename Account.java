
public class Account
{
    private String accNumber;
    private double balance;
    
    public Account()
    {
        this.accNumber = "";
        this.balance = 0.0;
        
    }

    public Account(String aNo, double bal)
    {
        this.accNumber = aNo;
        this.balance = bal;
    }
    public void setAccNumber(String aNo)
    {
        this.accNumber = aNo;
    }
    public void setBalance(double bal) 
    {
        this.balance = bal;
    }
    public String getAccNumber() 
    {
        return accNumber;
    }
    public double getBalance()
    {
        return balance;
    }
    public void deposit(double amount) 
    {
        if (amount > 0) 
        {
            balance += amount;
        }
    }
    public boolean withdraw(double amount) 
    {
        if (hasSufficientFunds(amount)) 
        {
            balance -= amount;
            return true;
        }
        return false;
    }
    
    public boolean hasSufficientFunds(double amount)
    {
        return balance >= amount;
    }
    public boolean isValidAccountNumber() 
    {
        return accNumber.matches("^[A-Z]{3}-\\d{6}$");
    }
    public String toString()
    {
        return "Account Number: " + accNumber + "\nBalance: R" + String.format("%.2f", balance);
    }
}