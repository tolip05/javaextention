package shapes01;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.calculatePerimeter();
        this.calculateArea();
    }

    @Override
    public void calculatePerimeter() {
        super.setPerimeter(this.radius * Math.PI * 2);
    }

    @Override
    public void calculateArea() {
     super.setArea(this.radius * this.radius * 3.14);
    }
}
