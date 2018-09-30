package vehicles01;

public  class Vehicle {
    private double fuelQuantity;
    private double fuelPerKm;

    protected Vehicle(double fuelQuantity, double fuelPerKm) {
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
        double needFuel = this.fuelPerKm * distance;
        if (needFuel > this.fuelQuantity){
            throw new IllegalStateException
                    (String.format("%s needs refueling",this.getClass().getSimpleName()));
        }
        this.fuelQuantity -= needFuel;
    }
    public void refuel(double litries){
        this.fuelQuantity += litries;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f",this.getClass().getSimpleName(),this.fuelQuantity);
    }
}
