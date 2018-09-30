package speed_racing;

public class Car {
    public static final int DISTANCCED_TRAVELLED = 0;
    private String model;
    private double fuel;
    private double pricePerKilometer;
    private int distanccedTravelled;

    public Car(String model, double fuel, double pricePerKilometer) {
        this.model = model;
        this.fuel = fuel;
        this.pricePerKilometer = pricePerKilometer;
        this.distanccedTravelled = DISTANCCED_TRAVELLED;
    }

    public void drive(int kilometers) {
        double fuelForDrive = kilometers * this.pricePerKilometer;
        if (fuelForDrive > this.fuel){
            throw new IllegalStateException("Insufficient fuel for the drive");
        }else{
            this.distanccedTravelled += kilometers;
            this.fuel -= fuelForDrive;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d",this.model,this.fuel,this.distanccedTravelled);
    }
}
