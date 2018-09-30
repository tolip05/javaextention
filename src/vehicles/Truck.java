package vehicles;

public class Truck extends Vehicle {
    public Truck(double fuelQuantity, double fuelConsumptioInLitersPerKm) {
        super(fuelQuantity, fuelConsumptioInLitersPerKm);
    }

    @Override
    protected void setFuelQuantity(double fuelQuantity) {
        double truckFuelQuantity = fuelQuantity * 0.95;
        super.setFuelQuantity(truckFuelQuantity);
    }

    @Override
    protected void setFuelConsumptioInLitersPerKm(double fuelConsumptioInLitersPerKm) {
        super.setFuelConsumptioInLitersPerKm(fuelConsumptioInLitersPerKm + 1.6);
    }

    @Override
    protected void drive(double distance) {
        double needFuel = super.getFuelConsumptioInLitersPerKm() * distance;
     if (needFuel > super.getFuelQuantity()){
         throw new IllegalStateException("Truck needs refueling");
     }
     super.setFuelQuantity(super.getFuelQuantity() - needFuel);
    }

    @Override
    protected void refuel(double litres) {
       super.setFuelQuantity(super.getFuelQuantity() + litres);
    }
}
