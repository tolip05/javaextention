package shapes;

public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
        this.calculateArea();
        this.calculatePerimeter();
    }

    @Override
    public  void calculatePerimeter(){
     super.setPerimeter(2 * this.height + 2 * this.width);
    }

    @Override
    public void calculateArea(){
     super.setArea(this.height * this.width);
    }
}
