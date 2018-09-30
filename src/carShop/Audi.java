package carShop;

public class Audi implements Rentable {
    private String model;
    private String color;
    private int hp;
    private String country;
    private int minRentDay;
    private double pricePerDay;

    public Audi(String model, String color, int hp, String country, int minRentDay, double pricePerDay) {
        this.model = model;
        this.color = color;
        this.hp = hp;
        this.country = country;
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public int getMinRentDay() {
        return this.minRentDay;
    }

    @Override
    public double getPricePerDay() {
        return this.pricePerDay;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getHorsePower() {
        return this.hp;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires",
                this.model,this.country,Car.TIRES);
    }
}
