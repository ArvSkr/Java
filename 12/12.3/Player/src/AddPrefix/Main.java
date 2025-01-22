package AddPrefix;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>(List.of(
                new Player("Alice", 20),
                new Player("Bob", 30),
                new Player("Charlie", 25),
                new Player("Daisy", 10)
        ));
        players.forEach(player -> player.name = "Player-" + player.name);
        players.forEach(player ->
                System.out.println(players)
        );
    }
}