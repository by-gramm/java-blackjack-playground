package nextstep.blackjack.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomCardFactory {

    private static final int CARD_COUNT = 52;

    private static Random random = new Random();
    private static final List<Card> cards = new ArrayList<>();
    private static Integer leftCount = CARD_COUNT;

    static {
        initializeCards();
    }

    private static void initializeCards() {
        for (CardShape shape : CardShape.values()) {
            addCards(shape);
        }
    }

    private static void addCards(CardShape shape) {
        for (CardNumber number : CardNumber.values()) {
            cards.add(Card.of(number, shape));
        }
    }

    public static Card create() {
        if (leftCount == 0) {
            throw new IllegalStateException("모든 카드를 다 사용했습니다.");
        }

        int index = random.nextInt(leftCount);
        leftCount--;
        return cards.remove(index);
    }
}
