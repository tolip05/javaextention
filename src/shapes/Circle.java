package shapes;

import sun.security.provider.SHA;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.calculateArea();
        this.calculatePerimeter();
    }

    @Override
    public void calculatePerimeter() {
        setPerimeter(radius * Math.PI * 2);
    }

    @Override
    public void calculateArea() {
       setArea(this.radius * this.radius * 3.14);
    }
}
