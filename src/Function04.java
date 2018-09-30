import java.util.function.Function;

public class Function04 {
    public static void main(String[] args) {
        String [] nums = "1.8 2.5 5 5.4".split(" ");

        Function<String,Double> func = x -> Double.parseDouble(x) * 1.2;

        for (String num : nums) {
            System.out.println(String.format("%.2f",func.apply(num)));
        }
    }
}
