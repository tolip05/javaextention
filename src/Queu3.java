import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Queu3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfPumps = Integer.parseInt(br.readLine());
        ArrayDeque<String>allPumps = new ArrayDeque<>();
        String[] alfa = new String[numberOfPumps];

        for (int i = 0; i < numberOfPumps; i++) {
            String a = br.readLine();
            allPumps.addLast(a);
            alfa[i]= a;
        }
        int count = 0;
        Long ourFuel = 0L;
        String b = "";
        while (allPumps.size() > 0){

            //boolean found = false;

            //count ++;
            String pump = allPumps.pop();
             b = pump;
            String[] curentPump = pump.split(" ");
            Long curentFuel = Long.valueOf(curentPump[0]);
            Long distance = Long.valueOf(curentPump[1]);
            if (ourFuel + curentFuel< distance){
                allPumps.addLast(pump);
                count ++;
            }else{
                ourFuel += curentFuel;
                ourFuel -= distance;
            }

        }
        for (int i = 0; i < alfa.length; i++) {
            if (alfa[i].equals(b)){
                System.out.println(i + 1);
            }
        }
    }
}

