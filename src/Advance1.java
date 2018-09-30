import java.math.BigDecimal;
import java.util.Scanner;

public class Advance1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double quantity = Double.parseDouble(scanner.nextLine());

       BigDecimal exchange = new BigDecimal("4210500000000");
       BigDecimal price = new BigDecimal(1.20 * quantity);
        BigDecimal totalPrice = price.multiply(exchange);
        System.out.printf("%.2f marks",totalPrice);

    }
}
