package avatar.benders;

public class AirBender extends Bender {
    private double aerialIntegirty;

    public AirBender(String name, int power, double aerialIntegirty) {
        super(name, power);
        this.aerialIntegirty = aerialIntegirty;
    }

    @Override
    public String toString() {
        return String.format("###Air Bender: %s, Power: %d, Aerial Integrity: %.2f"
        ,super.getName(),super.getPower(),this.aerialIntegirty);
    }

    @Override
    public double getTotalPower() {
        return getPower() * this.aerialIntegirty;
    }
}
