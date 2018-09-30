package clases_box;

public class Box {
    private double lenght;
    private double width;
    private double height;

    public Box(double lenght, double width, double height) {
        this.lenght = lenght;
        this.setWidth(width);
        this.height = height;
    }

    public Box() {

    }

    public double getLenght() {
        return lenght;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width < 1){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    public double surface(){
        return (2 * this.lenght * this.width)+(2 * this.lenght * this.height)
                + (2 * this.width * this.height);
    }
    public double lateral() {
        return (2 * this.lenght * this.height) + (2 * this.width * this.height);
    }
    public double volume (){
        return this.lenght * this.width * this.height;
    }
}
