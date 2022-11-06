package nextstep.blackjack.entity;

public abstract class Participant {

    private final Cards cards = new Cards();

    private int profit = 0;

    public void startGame() {
        Card card1 = RandomCardFactory.create();
        Card card2 = RandomCardFactory.create();

        cards.addCard(card1);
        cards.addCard(card2);
    }

    public Integer getCardCount() {
        return cards.getCount();
    }
}
