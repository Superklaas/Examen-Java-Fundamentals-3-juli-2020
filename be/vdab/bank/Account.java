package be.vdab.bank;

public abstract class Account {

    // data fields
    private double balance;
    private Person person;

    // constructor
    public Account() {};
    public Account(Person person, double balance)  {
        this.person = person;
        this.balance = balance;
    }

    // getters & setters
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // methods for withdraw & deposit
    public void withdraw(int amount)    {
        balance -= amount;
    }
    public void deposit(int amount) {
        balance += amount;
    }

}
