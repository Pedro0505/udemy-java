package tratamentoDeExcecoes.model.entities;

import tratamentoDeExcecoes.model.exceptions.OutOfWithDrawLimitExeption;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(int number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) throws OutOfWithDrawLimitExeption {
        if (amount > this.withdrawLimit) {
            throw new OutOfWithDrawLimitExeption("The amount exceeds withdraw limit");
        }

        if (amount > this.balance) {
            throw new OutOfWithDrawLimitExeption("Not enough balance");
        }

        this.balance -= amount;
    }

    @Override
    public String toString() {
        return String.format("New balance: %.2f\n", this.getBalance()); 
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public String getHolder() {
        return holder;
    }

    public int getNumber() {
        return number;
    }
}
