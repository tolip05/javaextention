package vehicles;

public class Car extends Vehicle {

    public Car(double fuelQuantity, double fuelConsumptioInLitersPerKm) {
        super(fuelQuantity, fuelConsumptioInLitersPerKm);
    }

    @Override
    protected void setFuelConsumptioInLitersPerKm(double fuelConsumptioInLitersPerKm) {
        super.setFuelConsumptioInLitersPerKm(fuelConsumptioInLitersPerKm + 0.9);
    }

    @Override
    protected void setFuelQuantity(double fuelQuantity) {
        super.setFuelQuantity(fuelQuantity);
    }

    @Override
    public void drive(double distance) {
        double needFuel = super.getFuelConsumptioInLitersPerKm() * distance;
        if (needFuel > super.getFuelQuantity()){
            throw new IllegalStateException("Car needs refueling");
        }
        super.setFuelQuantity(super.getFuelQuantity() - needFuel);
    }

    @Override
    public void refuel(double litres) {
     super.setFuelQuantity(super.getFuelQuantity() + litres);
    }
}
