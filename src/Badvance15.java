import java.math.BigInteger;
import java.util.Scanner;

public class Badvance15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        BigInteger product = BigInteger.ONE;
        do {
            BigInteger number = new BigInteger(""+n);
            product = product.multiply(number);
            n++;
        }while (n <= m);
        System.out.printf("product[%d..%d] = %d\n",n,m,product);
        int c = 520;
        int right = c >> 2;
        int left = c << 2;
        System.out.println(c);
        System.out.println(Integer.toBinaryString(c));
        System.out.println(Integer.toBinaryString(right));
        System.out.println(Integer.toBinaryString(left));
        System.out.println(right);
        System.out.println(left);
    }
}
