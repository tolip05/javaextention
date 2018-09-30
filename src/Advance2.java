import java.util.Scanner;

public class Advance2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();

        if (firstName != null && firstName.isEmpty()){
            firstName = "*****";
        }
        if (secondName != null && secondName.isEmpty()){
            secondName = "*****";
        }
        System.out.printf("Hello, %s %s!",firstName,secondName);


    }
}
