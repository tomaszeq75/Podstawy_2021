package stream_lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaSorting {

    public static void main(String[] args) {

        List<Player> players = new ArrayList<>();
        players.add(new Player("Rambo", 33));
        players.add(new Player("Rocky", 1));
        players.add(new Player("Terminator", 9999));
        players.add(new Player("Adam", 555));
        players.add(new Player("Zenon", 6666));

        Comparator<Player> playerComparator = new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

//        players.sort(playerComparator);
//        Collections.sort(players, playerComparator);
//        players.sort((Player p1, Player p2) -> p1.getName().compareTo(p2.getName()));
        players.sort(Comparator.comparing(Player::getName));
//        List<Player> sortedPlayers = players.stream().sorted(Comparator.comparing(Player::getName)).collect(Collectors.toList());

        System.out.println(players);


    }

}
