package nextstep.blackjack.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cards {

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
        return getSum() < 17;
    }
}
