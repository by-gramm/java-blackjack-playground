package nextstep.blackjack;

import nextstep.blackjack.entity.Dealer;
import nextstep.blackjack.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class Game {

    public static final int MIN_PLAYER_COUNT = 1;
    public static final int MAX_PLAYER_COUNT = 7;

    private final Dealer dealer = Dealer.getInstance();
    private final List<Player> gamePlayers = new ArrayList<>();

    public void addPlayer(Player player) {
        gamePlayers.add(player);
    }

    private Game() {
    }

    private Game(List<Player> players) {
        gamePlayers.addAll(players);
    }

    public static Game of(List<Player> players) {
        if (players.size() < MIN_PLAYER_COUNT || players.size() > MAX_PLAYER_COUNT) {
            throw new IllegalArgumentException("플레이어는 1명 이상 7명 이하여야 합니다.");
        }
        return new Game(players);
    }

    public Integer getPlayerCount() {
        return gamePlayers.size();
    }
}
