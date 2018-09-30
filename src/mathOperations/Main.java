package mathOperations;

import com.sun.org.apache.regexp.internal.RE;

public class Main {
    public static void main(String[] args) {
//        MathOperation math = new MathOperation();
//        System.out.println(math.add(2,2));
//        System.out.println(math.add(3,3,3));
        Rectangle rec = new Rectangle(5.0,3.0);
        Square sc = new Square(4.0);
        Rectangle rectangle = new Square(8.0);
        System.out.println(rectangle.perimeter());

        System.out.println(sc.calculateArea());
    }
}
