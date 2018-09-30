package raw_data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Bus> buses = new LinkedList<>();
        while (n-- > 0){

            String[] carData = br.readLine().split("\\s+");
            Bus car = null;
            String model = carData[0];
            int engineSpeed = Integer.parseInt(carData[1]);
            int enginePower = Integer.parseInt(carData[2]);
            Engine engine = new Engine(engineSpeed,enginePower);
            int cargoWeight = Integer.parseInt(carData[3]);
            String cargotype = carData[4];
            Cargo cargo = new Cargo(cargotype,cargoWeight);
            List<Tire>tires = new ArrayList<>();
            for (int i = 5; i < carData.length - 1; i += 2) {
                double presure = Double.parseDouble(carData[i]);
                int age = Integer.parseInt(carData[i + 1]);
                Tire tire = new Tire(age,presure);
                tires.add(tire);

            }
            car = new Bus(model,engine,cargo,tires);
            buses.add(car);
        }
        String command = br.readLine();
        switch (command){
            case "fragile":
                buses.stream().filter(car -> car.getTires()
                .stream().filter(tire -> tire.getPressure() < 1)
                        .collect(Collectors.toList()).size() > 0)
                .filter(car -> car.getCargo().getType().equals("fragile"))
                .forEach(System.out::println);
                break;
            case "flamable":
                buses.stream().filter(car -> "flamable".equals(car.getCargo().getType()))
                        .filter(car -> car.getEngine().getPower() > 250)
                        .forEach(System.out::println);
                break;
        }
    }
}
