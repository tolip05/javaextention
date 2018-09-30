import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ArrayDeckUpr4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] robotsTokens = scanner.nextLine().split(";");
        String[] robots = new String[robotsTokens.length];
        int[] proccesTime = new int[robotsTokens.length];
        int[] robotsCounter = new int[robotsTokens.length];

        for (int i = 0; i < robotsTokens.length; i++) {
            String[] robotToken = robotsTokens[i].split("-");
            robots[i] = robotToken[0];
            proccesTime[i] = Integer.parseInt(robotToken[1]);

        }
        String[]time = scanner.nextLine().split(":");
        long h = Long.parseLong(time[0]) *60 * 60;
        long m = Long.parseLong(time[1]) *60;
        long s = Long.parseLong(time[2]);
        long seconds = h + m + s;

        Deque<String>products = new ArrayDeque<>();
        String product ="";
        while (!"end".equalsIgnoreCase(product = scanner.nextLine())){
            products.offer(product);
        }
        while (!products.isEmpty()){
            seconds++;
            for (int i = 0; i < robots.length; i++) {
                if (robotsCounter[i] > 0){
                    robotsCounter[i]--;
                }
            }
            String curentProduct = products.poll();
            boolean isProductTaken = false;
            for (int i = 0; i < robots.length; i++) {
              if (robotsCounter[i] == 0){
                  robotsCounter[i] = proccesTime[i];
                  isProductTaken = true;
                  System.out.printf("%s - %s [%s]%n",robots[i],curentProduct,convertTime(seconds));
                  break;
              }

              }
            if (!isProductTaken){
                products.offer(curentProduct);
            }
        }


    }

    private static Object convertTime(long seconds) {
        long s = seconds%60;
        long m = (seconds / 60)%60;
        long h = (seconds / (60 * 60))%24;
        return String.format("%02d:%02d:%02d",h,m,s);
    }
}
