
import java.util.Scanner;

public class biteParty {
    public static void main(String[] args) {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int[]numbers = new int[a];
        for (int i = 0; i < a; i++) {
            int b = Integer.parseInt(scanner.nextLine());
             numbers[i]= b;
        }
        while (true){
            String []command = scanner.nextLine().split(" ");
            if (command.equals("party over")){
                for (Integer number : numbers) {
                    System.out.println(number);
                }
              break;
            }
            int action = Integer.parseInt(command[0]);
            int position = Integer.parseInt(command[1]);
            switch (action){
                case -1:
                    for (int i = 0; i < numbers.length; i++) {
//                        System.out.println(Integer.toBinaryString(numbers[i]));
//                        System.out.println(Integer.toBinaryString(1<<position));
                        numbers[i] = (numbers[i]^(1 << position));
//                        System.out.println(Integer.toBinaryString(numbers[i]));
//                        System.out.println("---------");
                    }
                    break;
                case 0:
                    int mask = ~(1 << position);
                    for (int i = 0; i < numbers.length; i++) {

                        numbers[i]= numbers[i] & mask;
                    }
                    break;
                case 1:
                    int mask1 = 1 << position;
                    for (int i = 0; i < numbers.length; i++) {

                        numbers[i]= numbers[i] | mask1;
                    }
                    break;
                    default:
                        break;
            }
        }
    }
}
