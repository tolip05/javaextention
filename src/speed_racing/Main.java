package speed_racing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Car> cars = new LinkedHashMap<>();
        int countOfCars = Integer.parseInt(br.readLine());

        while (countOfCars-- > 0) {

            String[] tokens = br.readLine().split("\\s+");

            Car car = new Car
                    (tokens[0], Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
            cars.putIfAbsent(tokens[0], car);
        }
        String line;
        while (true) {
            if ("end".equalsIgnoreCase(line = br.readLine())) {
                break;
            }
            String[] driveTokens = line.split("\\s+");
            try {
                cars.get(driveTokens[1]).drive(Integer.parseInt(driveTokens[2]));

            } catch (IllegalStateException ise) {
                System.out.println(ise.getMessage());
            }
        }
            cars.values().forEach(System.out::println);
    }
}
