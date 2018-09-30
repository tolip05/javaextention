import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static sun.misc.Version.print;

public class Izpit7 {
    private static List<BigInteger> list = new ArrayList<>();
    private static Integer curentIndex = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().trim().split(" ");
        for (String s : input) {
            list.add(new BigInteger(s));
        }
        String command = br.readLine();
        while (!command.equals("stop")){
            String[]remeinder = command.trim().split(" ");
            int offset = Integer.valueOf(remeinder[0]);
            BigInteger operand = new BigInteger(remeinder[2]);
            String operation = remeinder[1];

            finedIndex(offset);

            opperationExequte(operation,operand);
            command = br.readLine();

        }
        System.out.println(list);
       // opperationExequte(operation,operand);
        //print();
    }

    private static void opperationExequte(String operation, BigInteger operand) {
        switch (operation){
            case "&":
                  list.set(curentIndex,list.get(curentIndex).and(operand));
                  break;
            case "|":
                list.set(curentIndex,list.get(curentIndex).or(operand));
                break;
            case "^":
                list.set(curentIndex,list.get(curentIndex).xor(operand));
                break;
            case "+":
                list.set(curentIndex,list.get(curentIndex).and(operand));
                break;
            case "-":
                list.set(curentIndex,list.get(curentIndex).subtract(operand));
                break;
            case "*":
                list.set(curentIndex,list.get(curentIndex).multiply(operand));
                break;
            case "/":
                list.set(curentIndex,list.get(curentIndex).divide(operand));
                break;
                default:
                    break;
        }
    }

    private static void finedIndex(int offset) {
       // offset = offset % list.size();
//        if (curentIndex + offset >= list.size()){
//            curentIndex = (curentIndex+ offset) % list.size();
//        }else if (curentIndex + offset < 0){
//            curentIndex = list.size() + offset;
//        }else{
//            curentIndex += offset;
//        }
        curentIndex += offset;
        curentIndex = curentIndex  % list.size() >= 0 ?
                curentIndex % list.size():
                list.size() + curentIndex % list.size();
    }
}
