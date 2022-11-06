package nextstep.blackjack.entity;

public class Player extends Participant {

    private final String playerName;
    private final int bettingCost;

    public Player(String playerName, int bettingCost) {
        this.playerName = playerName;
        this.bettingCost = bettingCost;
    }

    @Override
    public boolean canGetOneMoreCard() {
        return cards.isUnder21();
    }
}
