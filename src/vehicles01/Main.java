package vehicles01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String,Vehicle> vehicles = new HashMap<>();

        String[]carTokens = br.readLine().split(" ");
        Vehicle car = new Car(Double.parseDouble(carTokens[1]),Double.parseDouble(carTokens[2]));
        String[]truckTokens = br.readLine().split(" ");
        Vehicle truck = new Truck
                (Double.parseDouble(truckTokens[1]),Double.parseDouble(truckTokens[2]));

        vehicles.putIfAbsent("Car",car);
        vehicles.putIfAbsent("Truck",truck);

        int comands = Integer.parseInt(br.readLine());

        String pattern = "#.##";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        while (comands -- > 0){
            String [] comandTokens = br.readLine().split(" ");
            switch (comandTokens[0]){
                case "Drive":
                    try {
                        double distance = Double.parseDouble(comandTokens[2]);
                        vehicles.get(comandTokens[1]).drive(distance);
                        System.out.println(String.format("%s travelled %s km",comandTokens[1],
                                decimalFormat.format(distance)));
                    }catch (IllegalStateException ise){
                        System.out.println(ise.getMessage());
                    }
                    break;
                case "Refuel":
                    vehicles.get(comandTokens[1]).refuel(Double.parseDouble(comandTokens[2]));
                    break;
            }
        }
        vehicles.values().forEach(System.out::println);
    }
}
