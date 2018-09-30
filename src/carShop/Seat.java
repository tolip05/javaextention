package carShop;

public class Seat implements Sellable {
    private String model;
    private String color;
    private int hp;
    private String country;
    private double price;

    public Seat(String model, String color, int hp, String country, double price) {
        this.model = model;
        this.color = color;
        this.hp = hp;
        this.country = country;
        this.price = price;
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
    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires",this.model,
                this.country,Car.TIRES);
    }
}
