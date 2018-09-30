package importance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String level = br.readLine();
        Logger logger = new Logger(Importance.valueOf(level));
        String command = "";
        while (true){
            if ("end".equalsIgnoreCase(command = br.readLine())){
                break;
            }
            int indeks = command.indexOf(":");
            String first = command.substring(0,indeks);
            String content = command.substring(indeks + 2);
            logger.record(new Message(Importance.valueOf(first),content));
        }
        for (Message message : logger.getMessages()) {
            System.out.println(message);
        }
    }

}
