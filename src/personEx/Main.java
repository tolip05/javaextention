package personEx;

import dice1.BankAccaunt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashMap;

public class Main {



        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            HashMap<Integer,BankAccaunt> accaunts = new HashMap<>();
            String command = br.readLine();
            while (!command.equalsIgnoreCase("end")){
                String[]commandArgs = command.split("\\s+");
                String comandType = commandArgs[0];
                switch (comandType){
                    case "Create":
                    BankAcaount acaunt = new BankAcaount();
                    accaunts.put(Integer.valueOf(commandArgs[0]),acaunt);
                         System.out.printf("Acaunt %s Created%n", acaunt);
                        break;
                    case "Deposit":
                     accaunts.get(Integer.valueOf(commandArgs[1])).deposid(Integer.valueOf(commandArgs[2]));
                        break;
                    case "SetInterest":
                        BankAcaount.setInterestRate(Double.valueOf(commandArgs[1]));

                        break;
                    case "GetInterest":
                        System.out.println(accaunts.get(Integer.valueOf(commandArgs[1])));
                        break;
                }

                command = br.readLine();
            }
        }




    }


