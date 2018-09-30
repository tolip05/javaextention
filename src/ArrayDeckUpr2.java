import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ArrayDeckUpr2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int comandCount = Integer.parseInt(scanner.nextLine());
        Deque<Integer> someNumbers = new ArrayDeque<>();
        Deque<Integer> maxNumbers = new ArrayDeque<>();

        for (int i = 0; i < comandCount; i++) {
            String[] comands = scanner.nextLine().split(" ");

            int command = Integer.parseInt(comands[0]);
            int maxValue = Integer.MIN_VALUE;
            switch (command) {
                case 1:
                    int number = Integer.parseInt(comands[1]);
                    if (number >= maxValue) {
                        maxValue = number;
                        maxNumbers.push(maxValue);
                    }
                    someNumbers.push(number);
                    break;
                case 2:
                    int delitedItem = someNumbers.pop();
                    if (delitedItem == maxValue) {
                        maxNumbers.pop();
                        if (!maxNumbers.isEmpty()) {
                            maxValue = maxNumbers.peek();
                        } else {
                            maxValue = Integer.MIN_VALUE;
                        }
                        break;
                    }
                        case 3:
                            System.out.println(maxNumbers.peek());
                            break;
                    }
            }
        }

    }
