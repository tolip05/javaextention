package vehicles01;

public class Truck extends Vehicle {
    public Truck(double fuelQuantity, double fuelPerKm) {
        super(fuelQuantity, fuelPerKm);
    }

    @Override
    protected void setFuelPerKm(double fuelPerKm) {
        super.setFuelPerKm(fuelPerKm + 1.6);
    }

    @Override
    protected void setFuelQuantity(double fuelQuantity) {
        double quantity = fuelQuantity * 0.95;
        super.setFuelQuantity(quantity);
    }
}
