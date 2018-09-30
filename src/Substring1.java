import java.util.Scanner;

public class Substring1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fileName = "Ebasi mamata ti kazvam!";
        String name = fileName.substring(6,12);

        String second = fileName.substring(6);
        System.out.println(name);
        System.out.println(second);
    }
}
