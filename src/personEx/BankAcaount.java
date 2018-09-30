package personEx;

import dice1.BankAccaunt;

public class BankAcaount extends BankAccaunt {
    public static final double DEFAULT_INTEREST_RATE = 0.02;

    private static int accauntsCount;
    private static double curentInterestRate;


    private int id;
    private double balance;


    public BankAcaount(){
      this.id = ++accauntsCount;
      curentInterestRate = DEFAULT_INTEREST_RATE;
    }

    public int getId() {
        return this.id;
    }
    public static void setInterestRate(double interestRate){
        curentInterestRate = interestRate;
    }
    public void deposit(double amount){
        this.balance += amount;
    }
    public double getInterest(int years){
        return this.balance * curentInterestRate * years;
    }

    @Override
    public String toString() {
        return "ID " + this.id;
    }
}
