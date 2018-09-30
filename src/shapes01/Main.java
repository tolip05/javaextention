package shapes01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double[] recToken = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        double[] sercToken = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        Shape rect = new Rectangle(recToken[0],recToken[1]);
        Shape cerc = new Circle(sercToken[0]);
        List<Shape> listShape = new ArrayList<>();
        listShape.add(rect);
        listShape.add(cerc);
        for (Shape shape : listShape) {
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());

        }
    }
}
