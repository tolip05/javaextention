import jdk.nashorn.internal.objects.annotations.Function;

import java.util.Scanner;

public class Lambda5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine().split(", ");
        java.util.function.Function<String, Double> vat = x -> Double.parseDouble(x) * 1.2;
        for (int i = 0; i < input.length; i++) {
            System.out.println(String.format("%.2f",vat.apply(input[i])));
        }
    }
}
