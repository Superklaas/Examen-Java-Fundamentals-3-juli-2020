package be.vdab.bank;

public class TestApp {
    public static void main(String[] args) {

        // instantiating objects
        Person peter = new Person("Peter");
        CheckingsAccount c1 = new CheckingsAccount(peter,2000);
        SavingsAccount s1 = new SavingsAccount(peter,5000,1.5);

        // test getBalance
        System.out.println("initial balances");
        System.out.println(c1.getBalance());
        System.out.println(s1.getBalance());

        // test withdraw
        s1.withdraw(2000, c1);
        System.out.println("balances after withdrawal €2000 from savings");
        System.out.println(c1.getBalance());
        System.out.println(s1.getBalance());

        // test deposit
        s1.deposit(1000, c1);
        System.out.println("balances after deposit €1000 to savings");
        System.out.println(c1.getBalance());
        System.out.println(s1.getBalance());

        // test add anual interest to savings account
        s1.addAnnualInterest();
        System.out.println("balance savings after addition annual interest");
        System.out.println(s1.getBalance());

    }
}
