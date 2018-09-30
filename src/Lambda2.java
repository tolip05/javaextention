import java.util.function.Function;

public class Lambda2 {
    public static void main(String[] args) {
        Function<Integer,Integer> sqr = x -> x + x;
        System.out.println(sqr.apply(100));
    }
}
