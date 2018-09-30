import java.util.*;

public class HashMap02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,List<String>> personEmails = new LinkedHashMap<>();

        String name ="";
        while (!"stop".equalsIgnoreCase(name = scanner.nextLine())){
            String email = scanner.nextLine();
            int dotIndex = email.lastIndexOf('.');
            String domein = email.substring(dotIndex + 1);
               switch (domein.toLowerCase()){
                   case "us":
                   case "com":
                   case "uk":
                       continue;
               }
            if (!personEmails.containsKey(name)){
                personEmails.put(name,new ArrayList<>());
            }
            personEmails.get(name).add(email);
        }
        for (Map.Entry<String, List<String>> entry : personEmails.entrySet()) {
            System.out.printf("%s -> %s%n",entry.getKey(),String.join(", ",entry.getValue()));
        }
    }
}
