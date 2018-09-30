package mathOperations;

public class Square extends Rectangle {
    public Square (double side){
        super(side);
    }
    @Override
    public double perimeter(){
        return this.getSideA() * 4;
    }
    @Override
    public double calculateArea(){
    return this.getSideA() * this.getSideA();
    }
}
