import java.util.Scanner;

public class Badvance14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float km = Float.parseFloat(scanner.nextLine());
        String input = scanner.nextLine();
        double sas = 0.0D;

        if (input.equals("day") && km < 20){
            sas = 0.70+(km * 0.79);
            System.out.printf("%.2f",sas);
        }
        else if (input.equals("night") && km < 20){
            sas = 0.70+(km * 0.90);
            System.out.printf("%.2f",sas);
        }
        else if(km >= 20 && km <100){
            sas = km * 0.09;
            System.out.printf("%.2f",sas);
        }
        else if(km >=100){
            sas = km * 0.06;
            System.out.printf("%.2f",sas);
        }
    }
}
