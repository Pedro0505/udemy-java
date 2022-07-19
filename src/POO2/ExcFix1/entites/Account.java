package POO2.ExcFix1.entites;

public class Account {
    private int accountNumber;
    private String name;
    private double balance;

    public Account(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public Account(int accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = 0.00;
    }

    public void deposit(double money) {
        this.balance += money;
    }

    public void withdraw(double money) {
        double result = this.balance - money;

        if (result < 0) {
            this.balance = 0;
            return;
        }

        this.balance -= money;
    }    

    public int getAccountNumber() {
        return accountNumber;
    }
    
    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("Account %d, Holder: %s, Balance: R$ %.2f\n", this.accountNumber, this.name, this.balance);
    }
}
