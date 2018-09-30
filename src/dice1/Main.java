package dice1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BankAccaunt acaunt = new BankAccaunt();

       // acaunt.setId(1);
       // acaunt.getBalance();
//        try {
//        acaunt.witdraw(10);
//        }catch (IllegalStateException ise){
//            System.out.println(ise.getMessage());
//        }
        //System.out.println(acaunt);
        HashMap<Integer,BankAccaunt>accaunts = new HashMap<>();
        String command = br.readLine();
        while (!command.equalsIgnoreCase("end")){
            String[]commandArgs = command.split("\\s+");
            String comandType = commandArgs[0];
            switch (comandType){
                case "Create":
                    createAccaunt(accaunts, commandArgs[1]);
                    break;
                case "Deposit":
                    executeDeposit(accaunts,commandArgs);
                    break;
                case "Withdraw":
                    executeWithdraw(accaunts,commandArgs);
                    break;
                case "Print":
                    executePrint(accaunts,commandArgs);
                    break;
            }

            command = br.readLine();
        }
    }

    private static void executePrint
            (HashMap<Integer, BankAccaunt> accaunts, String[] commandArgs) {
        Integer id = Integer.valueOf(commandArgs[1]);
        if (!accaunts.containsKey(id)) {
            System.out.println("Accaunts does not exist");
            return;
        }
        BankAccaunt accaunt = accaunts.get(id);
        System.out.printf("Accaunts %s, balance: %.2f%n",accaunt,accaunt.getBalance());
    }

    private static void executeWithdraw
            (HashMap<Integer, BankAccaunt> accaunts, String[] commandArgs) {
        Integer id = Integer.valueOf(commandArgs[1]);
        double amaunt = Double.valueOf(commandArgs[2]);
        if (!accaunts.containsKey(id)){
            System.out.println("Accaunts does not exist");
            return;
        }
        try {
            accaunts.get(id).witdraw(amaunt);
        }catch (IllegalStateException iae){
            System.out.println(iae.getMessage());
        }
    }

    private static void executeDeposit
            (HashMap<Integer, BankAccaunt> accaunts, String[] commandArgs) {
        Integer id = Integer.valueOf(commandArgs[1]);
        double amaunt = Double.valueOf(commandArgs[2]);
          if (!accaunts.containsKey(id)){
              System.out.println("Accaunts does not exist");
              return;
          }
        try {
            accaunts.get(id).deposid(amaunt);
        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
    }

    private static void createAccaunt(HashMap<Integer, BankAccaunt> accaunts, String commandArg) {
        int id = Integer.valueOf(commandArg);
        if (accaunts.containsKey(id)){
            System.out.println("Accaunt already exists!");
        }else{
            BankAccaunt account = new BankAccaunt();
            account.setId(id);
            accaunts.put(id,account);
        }
    }
}
