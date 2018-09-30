package vehicles01;

public class Car extends Vehicle {
    public Car(double fuelQuantity, double fuelPerKm) {
        super(fuelQuantity, fuelPerKm);
    }

    @Override
    protected void setFuelPerKm(double fuelPerKm) {
        super.setFuelPerKm(fuelPerKm + 0.9);
    }
}
