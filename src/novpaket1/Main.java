package novpaket1;

//import dice1.BankAccaunt;
//import personEx.BankAcaount;
import novpaket1.BancAccount;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, BancAccount>accounts = new HashMap<>();
        String command = scanner.nextLine();

        while (!command.equals("End")){
            String[] carg = command.split("\\s+");

            String commandType = carg[0];
            switch (commandType){
                case "Create":
                    BancAccount account = new BancAccount();
                    accounts.put(account.getId(),account);
                    System.out.printf("Acaunt %s Created%n",account);
                    break;
                case "Deposit":
                    executeAmaunt(accounts, carg);

                    break;
                case "SetInterest":
                    BancAccount.setInterestRate(Double.valueOf(carg[1]));
                    break;
                case "GetInterest":
                    System.out.println(accounts.get(Integer.valueOf(carg[1]))
                            .getInterestRate(Integer.valueOf(carg[2])));
                    break;

            }
            command = scanner.nextLine();
        }
    }

    private static void executeAmaunt(HashMap<Integer, BancAccount> accounts, String[] carg) {
        int id = Integer.valueOf(carg[1]);
        if (!accounts.containsKey(id)){
            System.out.println("Acaunts does not exist");
        }else{

            Integer amaunt = Integer.parseInt(carg[2]);
            accounts.get(id).deposit(amaunt);
        }
    }
}
