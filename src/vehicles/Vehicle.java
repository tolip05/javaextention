package vehicles;

public abstract class Vehicle {
    private double fuelQuantity;
    private double fuelConsumptioInLitersPerKm;

    protected Vehicle(double fuelQuantity, double fuelConsumptioInLitersPerKm) {
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumptioInLitersPerKm(fuelConsumptioInLitersPerKm);
    }

    protected double getFuelConsumptioInLitersPerKm() {
        return this.fuelConsumptioInLitersPerKm;
    }

    protected double getFuelQuantity() {
        return this.fuelQuantity;
    }

    protected void setFuelConsumptioInLitersPerKm(double fuelConsumptioInLitersPerKm) {
        this.fuelConsumptioInLitersPerKm = fuelConsumptioInLitersPerKm;
    }

    protected void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    protected abstract void drive(double distance);

    protected abstract void refuel(double litres);

    @Override
    public String toString() {
        return String.format("%s: %.2f",this.getClass().getSimpleName()
                ,this.fuelQuantity);
    }
}
