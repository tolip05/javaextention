import java.util.Scanner;

public class Regex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder(scanner.nextLine());
        String target = scanner.nextLine();

        while (true){
            int firstIndex = input.indexOf(target);
            int lastIndex = input.lastIndexOf(target);
            if (firstIndex == -1 || lastIndex == -1 || "".equals(target)){
                System.out.println("No shake.");
                break;
            }
            input = input.replace(firstIndex,firstIndex + target.length(),"");
            input = input.replace(lastIndex - target.length(),lastIndex,"");
            int index = target.length()/2;
            target = target.substring(0,index) + target.substring(index+1);
            System.out.println("Shaked it.");
        }
        System.out.println(input);
    }
}
