package football_team;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Team> teams = new HashMap<>();
        while (true) {
            String[] line = br.readLine().split(";");
            if ("end".equalsIgnoreCase(line[0])) {
                break;
            }
            String teamName;
            switch (line[0]) {
                case "Team":
                    Team team = new Team(line[1]);

                    teams.putIfAbsent(team.getName(), team);

                    break;
                case "Add":
                    try {
                        teamAddPlayer(teams, line);
                    }catch (IllegalArgumentException iea){
                        System.out.println(iea.getMessage());
                    }
                    break;
                case "Remoove":
                    teamName = line[1];
                    String playerName = line[2];
                    try {

                        teams.get(teamName).remoovePlayer(playerName);
                    } catch (IllegalArgumentException ie) {
                        System.out.println(ie.getMessage());
                    }
                    break;
                case "Rating":
                    teamName = line[1];
                    if (teams.containsKey(teamName)) {
                        System.out.println(String.format("%s - %.0f", teamName, teams.get(teamName).getRating()));

                    } else {
                        System.out.println(String.format("%s does not exist.", teamName));
                    }
                    break;

            }
        }
    }

    private static void teamAddPlayer(Map<String, Team> teams, String[] line) {
        String teamName = line[1];
        if (teams.containsKey(teamName)) {
            Player player = new Player(line[2], Integer.parseInt(line[3]), Integer.parseInt(line[4]),
                    Integer.parseInt(line[5]), Integer.parseInt(line[6]), Integer.parseInt(line[7]));
            teams.get(teamName).addPlayer(player);
        } else {
            System.out.println(String.format("%s does not exist.", teamName));
        }
    }
}
