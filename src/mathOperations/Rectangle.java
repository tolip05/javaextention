package mathOperations;

public class Rectangle {
    private double sideA;
    private double sideB;

    public Rectangle (double sideA){
        this.sideA = sideA;
    }


    public  Rectangle(double sideA,double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }
    protected double getSideA(){
        return this.sideA;
    }
    public double perimeter(){
        return this.sideA * 2 + this.sideB * 2;
    }

    public double calculateArea(){
        return this.sideA * this.sideB;
    }
}
