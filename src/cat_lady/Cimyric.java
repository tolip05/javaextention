package cat_lady;

public class Cimyric extends Cat {

    private double lenghtFur;

    protected Cimyric(String name,String type,double lenghtFur) {
        super(name,type);
        this.lenghtFur = lenghtFur;
    }
    @Override
    public String toString() {
        return String.format("%s %.2f",super.toString(),this.lenghtFur);
    }
}
