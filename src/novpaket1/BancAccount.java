package novpaket1;

import personEx.BankAcaount;

public class BancAccount {
    public static final double DEFAULT_INTEREST_RATE = 0.02;
    private static int accountCount;
    private static double curentInterestRate = DEFAULT_INTEREST_RATE;
    private int id;
    private double balance;

    public BancAccount(){
      this.id = ++accountCount;
    }

    public int getId() {
        return this.id;
    }
    public static void setInterestRate(double interestRate){
        curentInterestRate = interestRate;
    }
    public void deposit(Integer amaount){
        this.balance += amaount;
    }
    public double getInterestRate(int years){
        return this.balance * curentInterestRate * years;
    }

    @Override
    public String toString() {
        return "ID " + this.id;
    }
}
