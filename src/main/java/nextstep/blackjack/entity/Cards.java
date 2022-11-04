package nextstep.blackjack.entity;

import java.util.ArrayList;
import java.util.List;

public class Cards {

    public static final int BLACKJACK_POINT = 21;
    public static final int DEALER_GET_ONE_MORE_CARD_POINT = 17;

    private final List<Card> cards = new ArrayList<>();

    public void addCard(Card card) {
        cards.add(card);
    }

    public Integer getCount() {
        return cards.size();
    }

    public Integer getSum() {
        return cards.stream()
                .mapToInt(Card::getScore)
                .sum();
    }

    public boolean isDealerGetOneMoreCard() {
        return getSum() < DEALER_GET_ONE_MORE_CARD_POINT;
    }

    public boolean isOver21() {
        return getSum() > BLACKJACK_POINT;
    }

    public boolean isBlackJack() {
        return getAceCount() == 1 && getCount() == 2 && getSum() == BLACKJACK_POINT - 10;
    }

    private int getAceCount() {
        return (int) cards.stream().filter(Card::isAce).count();
    }
}
