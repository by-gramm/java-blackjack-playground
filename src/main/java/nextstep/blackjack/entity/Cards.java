package nextstep.blackjack.entity;

import java.util.ArrayList;
import java.util.List;

public class Cards {

    private final List<Card> cards = new ArrayList<>();

    public void addCard(Card card) {
        cards.add(card);
    }

    public Integer getCount() {
        return cards.size();
    }
}
