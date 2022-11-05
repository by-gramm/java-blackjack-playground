package nextstep.blackjack.entity;

public class Player extends Participant {

    private final String playerName;
    private final int bettingCost;

    public static Player of(String playerName, int bettingCost) {
        if (bettingCost < 0) {
            throw new IllegalArgumentException("베팅 금액은 0 이상이어야 합니다.");
        }
        return new Player(playerName, bettingCost);
    }

    public Player(String playerName, int bettingCost) {
        this.playerName = playerName;
        this.bettingCost = bettingCost;
    }
}
