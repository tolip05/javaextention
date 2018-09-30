package football_team;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Team {
    private String name;
    private Map<String,Player> players;
    private double rating;

    public Team(String name) {
        this.name = name;
        this.players = new HashMap<>();
        this.rating = 0.0;
    }

    public String getName() {
        return this.name;
    }

    public double getRating() {
        if (this.players.size() != 0){
        this.rating += this.players.values().stream()
                .mapToDouble(Player::stateAverageValue).average()
                .getAsDouble();
        }
        return this.rating;
    }
    public void addPlayer(Player player){
        this.players.putIfAbsent(player.getName(),player);
    }
    public void remoovePlayer(String playerName){
        if (!this.players.containsKey(playerName)){
            throw new IllegalArgumentException(String.format("Player %s is not in %s team."
            ,playerName,this.name));
        }
        this.players.remove(playerName);
    }
}
