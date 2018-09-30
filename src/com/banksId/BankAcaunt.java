package com.banksId;

public class BankAcaunt {
    private static double interestRate = 0.02;
    private static int counter = 1;
    private int id;
    private double balance;

    public static void setInterestRate(double interestRate) {
        BankAcaunt.interestRate = interestRate;
    }

    double getInterestRate(int years) {
        return BankAcaunt.interestRate * years * this.balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int id, double balance) {
        this.balance = balance;
        this.id = id;

    }

    BankAcaunt() {
        this.id = counter++;
    }

    BankAcaunt(double balance) {
        this();
        this.balance = balance;


    }


    void deposit(double amaunt) {
        this.balance += amaunt;
    }



    @Override
    public String toString() {
        return String.format("Accaunt ID%d, balance %.2f", this.id, this.balance);
    }
}

