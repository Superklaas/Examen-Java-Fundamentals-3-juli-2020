package be.vdab.bank;

public class SavingsAccount extends Account {

    private double annualInterestRate;

    // constructor
    public SavingsAccount(Person person, double balance, double annualInterestRate)  {
        super(person,balance);
        this.annualInterestRate = annualInterestRate;
    }

    // getter & setter interest rate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // override withdraw & deposit methods
    public void withdraw(int amount, CheckingsAccount checkingsAccount) {
        super.withdraw(amount);
        checkingsAccount.setBalance(checkingsAccount.getBalance() + amount);
    }
    public void deposit(int amount, CheckingsAccount checkingsAccount) {
        super.deposit(amount);
        checkingsAccount.setBalance(checkingsAccount.getBalance() - amount);
    }

    // method to add annual interest on savings account
    public void addAnnualInterest() {
        double newBalance = getBalance() + getBalance()*(annualInterestRate/100);
        setBalance(newBalance);
    }


}
