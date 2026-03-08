import java.text.DecimalFormat;

public class Account {
    private String accNumber;
    private double balance;

    // Default constructor
    public Account() {
        this.accNumber = "";
        this.balance = 0.0;
    }

    // Parameterized constructor
    public Account(String aNo, double bal) {
        this.accNumber = aNo;
        this.balance = bal;
    }

    // Setters
    public void setAccNumber(String aNo) {
        this.accNumber = aNo;
    }

    public void setBalance(double bal) {
        this.balance = bal;
    }

    // Getters
    public String getAccNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdraw method
    public boolean withdraw(double amount) {
        if (hasSufficientFunds(amount)) {
            balance -= amount;
            return true;
        }
        return false;
    }

    // Check sufficient funds
    public boolean hasSufficientFunds(double amount) {
        return balance >= amount;
    }

    // Validate account number format (e.g., ABC-123456)
    public boolean isValidAccountNumber() {
        return accNumber.matches("^[A-Z]{3}-\\d{6}$");
    }

    // toString method with DecimalFormat
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return "Account Number: " + accNumber + "\nBalance: R" + df.format(balance);
    }
}
