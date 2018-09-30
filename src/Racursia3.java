import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Racursia3 {
    private static int numberOfLoops;
    private static int[]loops;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        numberOfLoops = Integer.parseInt(br.readLine());
        loops = new int [numberOfLoops];
        simulatorLoops(0);

    }

    private static void simulatorLoops(int current) {
        if (current == numberOfLoops){
            printLoop();
            return;
        }
        for (int i = 1; i <= numberOfLoops; i++) {
           loops[current] = i;
           simulatorLoops(current + 1);
        }
    }

    private static void printLoop() {
        System.out.println(Arrays.toString(loops).replaceAll("[\\[\\],]",""));
    }


}
