package vehicle02;

public abstract class Vehicle {
    private double fuelQuantity;
    private double fuelPerKm;

    public Vehicle(double fuelQuantity, double fuelPerKm) {
        this.setFuelQuantity(fuelQuantity);
        this.setFuelPerKm(fuelPerKm);
    }

    protected void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    protected void setFuelPerKm(double fuelPerKm) {
        this.fuelPerKm = fuelPerKm;
    }
    public void drive(double distance){
        double needFuel = fuelPerKm * distance;
        if (needFuel > fuelQuantity){
            throw new IllegalStateException
                    (String.format("%s needs refueling",this.getClass().getSimpleName()));
        }
        this.fuelQuantity -= needFuel;
    }
    public void refuel(double litres){
        this.fuelQuantity += litres;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f",this.getClass().getSimpleName(),this.fuelQuantity);
    }
}
