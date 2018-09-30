import java.util.Scanner;

public class Izpit03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        int result = 0;

        if (number1 >= number2){
            for (int i = 31; i >= 0; i--) {
                    result = (result << 1) | ((number1 >> i) & 1);
                    result = (result << 1) | ((number2 >> i) & 1);
            }
        }else{
            for (int i = 31; i >= 0; i -= 2) {
                result = (result << 1) | ((number1 >> i) & 1);
                result = (result << 1) | ((number1 >> i - 1) & 1);
                result = (result << 1) | ((number2 >> i) & 1);
                result = (result << 1) | ((number2 >> i - 1) & 1);
            }
        }
        System.out.println(result);
    }
}
