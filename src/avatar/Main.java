package avatar;

import avatar.benders.Bender;
import avatar.benders.monuments.Monument;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        StringBuilder wars = new StringBuilder();
        int counterWar = 1;

        while (true){
            String[] line = br.readLine().split(" ");
            if (line[0].equals("Quit")){
                break;
            }
          switch (line[0]){
              case "Bender":
                  Factory.createBender(line[1],line[2],Integer.valueOf(line[3]),
                          Double.valueOf(line[4]));
                  break;
              case "Monument":
                  Factory.createMonument(line[1],line[2],Integer.valueOf(line[3]));
                  break;
              case "Status":
                  result.append(Controler.getStatus(line[1]));
                  break;
              case "War":
                  wars.append(String.format("War %d issued by %s%n",counterWar++,line[1]));
                  Controler.beginWar();
                  break;
                  default:
                      break;
          }
        }
        System.out.print(result);
        System.out.println(wars);
    }
}
