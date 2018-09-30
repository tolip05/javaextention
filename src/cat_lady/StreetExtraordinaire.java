package cat_lady;

public class StreetExtraordinaire extends Cat {

    private  double decibelOfMows;


    protected StreetExtraordinaire(String name,String type,double decibelOfMows) {
        super(name,type);
        this.decibelOfMows = decibelOfMows;
    }
    @Override
    public String toString() {
        return String.format("%s %.2f",super.toString(),this.decibelOfMows);
    }
}
