import java.util.Scanner;

public class String2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String dash = scanner.next();
        String [] grade = scanner.nextLine().split(", ");
        Double d0 = Double.parseDouble(grade[0]);
        Double d1 = Double.parseDouble(grade[1]);
        Double d2 = Double.parseDouble(grade[2]);
        Double average = (d0 + d1 + d2)/3;

        String header = String.format("%-10s|%7s|%7s|%7s|%7s","Name","JavaAdv","JavaOOP","OOPadvanced","Average");
        String s = String.format("%-10s|%7.2f|%7.2f|%7.2f|%7.4f",name,d0,d1,d2,average);
        System.out.println(header);
        System.out.println(s);
    }
}
