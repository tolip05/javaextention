import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Regex7 {
    public static void main(String[] args) throws IOException {
        //Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder text = new StringBuilder();
        while (true){
            String line = reader.readLine();
            if ("END".equalsIgnoreCase(line)){
                break;
            }
            text.append(line);
        }
    }
}
