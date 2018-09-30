package vehicle02;

public class Truck extends Vehicle {
    public Truck(double fuelQuantity, double fuelPerKm) {
        super(fuelQuantity, fuelPerKm);
    }

    @Override
    protected void setFuelPerKm(double fuelPerKm) {
        super.setFuelPerKm(fuelPerKm + 1.6);
    }

    @Override
    public void setFuelQuantity(double litries) {
        double quantity = litries * 0.95;
        super.setFuelQuantity(quantity);
    }
}
