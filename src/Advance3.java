import java.util.Scanner;

public class Advance3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();
        double kilometer = 0;
        if (km < 20){
            if (time.equals("day")) {
                kilometer = (double)(0.7 + 0.79 * km);
            }else if (time.equals("night")){
                kilometer = (double)(0.7 + 0.9 * km);
            }

        }
        else if (km >= 20 && km < 100){
            kilometer = (double)(km * 0.09);
        }
        else if (km >=100){
            kilometer = (double)(km * 0.06);
        }
        System.out.printf("%.2f",kilometer);
    }
}
