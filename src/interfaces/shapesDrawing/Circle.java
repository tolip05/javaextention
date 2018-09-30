package interfaces.shapesDrawing;

public class Circle implements Drawable {
    private int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
     double r_in = this.radius - 0.4;
     double r_out = this.radius + 0.4;

        for (double y = this.radius; y >= - this.radius ; --y) {
            for (double x = - this.radius; x < r_out; x += 0.5) {
                double valeu = y * y + x * x;
                if (valeu >= r_in * r_in && valeu <= r_out * r_out){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
