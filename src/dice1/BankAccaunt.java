package dice1;

public class BankAccaunt {
    private int id;
    private double balance;

    public void setId(int id){
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }
    public void deposid(double amaunt){
        if (amaunt < 0){
            throw new IllegalArgumentException("Should be positive");
        }
        this.balance += amaunt;
    }
    public void witdraw(double amaunt){
        if (amaunt > this.balance){
            throw new IllegalStateException("Insunificient ballanced!");
        }
        this.balance -= amaunt;
    }

    @Override
    public String toString() {
        return "Id" + this.id;
    }
}
