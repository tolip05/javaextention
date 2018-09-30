package com.banksId;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main1 {
    private static Map<Integer,BankAcaunt> bankAcaunts = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String[]line = br.readLine().trim().split(" ");
            if ("end".equalsIgnoreCase(line[0])){
                break;
            }
            switch (line[0]){
                case "Create":
                    createBankAcaunt();
                    break;
                case "Deposit":
                    depositSum(Integer.valueOf(line[1]),Double.valueOf(line[2]));
                    break;
                case "SetInterest":
                    setInterest(Integer.valueOf(line[1]));
                    break;
                case "GetInterest":
                    getInterest(Integer.valueOf(line[1]),Integer.valueOf(line[2]));
                    break;
            }
        }


    }

    private static void getInterest(Integer id, Integer years) {
         if (bankAcaunts.containsKey(id)){
             System.out.printf("%.2f%n",bankAcaunts.get(id).getInterestRate(years));
         }else{
             System.out.println("Account does not exist");
         }
    }


    private static void depositSum(Integer id, Double amaunt) {
        if (bankAcaunts.containsKey(id)){
            bankAcaunts.get(id).deposit(amaunt);
            System.out.printf("Deposited %.0f to ID%d%n",amaunt,id);
        }
    }

    private static void createBankAcaunt() {

          BankAcaunt ba = new BankAcaunt();
          bankAcaunts.put(ba.getId(),ba);

    }

    public static void setInterest(Integer interest) {
        BankAcaunt.setInterestRate(interest);
    }
}
