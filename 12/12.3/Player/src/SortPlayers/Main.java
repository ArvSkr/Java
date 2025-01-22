package SortPlayers;

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
        players.sort((p1, p2) -> {
            if (p2.score != p1.score) {
                return p2.score - p1.score; // Descending by score
            } else {
                return p1.name.compareTo(p2.name); // Alphabetically by name
            }
        });
        players.forEach(player ->
                System.out.println(players)
        );
    }
}