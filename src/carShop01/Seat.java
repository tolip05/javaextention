package carShop01;

public class Seat implements Car{
    private String model;
    private String color;
    private int hp;
    private String country;

    public Seat(String model, String color, int hp, String country) {
        this.model = model;
        this.color = color;
        this.hp = hp;
        this.country = country;
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
