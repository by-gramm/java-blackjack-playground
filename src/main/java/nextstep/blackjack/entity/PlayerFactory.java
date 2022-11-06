package nextstep.blackjack.entity;

import java.util.HashSet;
import java.util.Set;

public class PlayerFactory {

    private static final Set<String> playerNames = new HashSet<>();

    public static Player create(String playerName, int bettingCost) {
        if (bettingCost < 0) {
            throw new IllegalArgumentException("베팅 금액은 0 이상이어야 합니다.");
        }
        if (playerNames.contains(playerName)) {
            throw new IllegalArgumentException("플레이어 이름은 중복될 수 없습니다.");
        }
        return new Player(playerName, bettingCost);
    }
}
