package nextstep.blackjack;

import nextstep.blackjack.entity.Card;
import nextstep.blackjack.entity.CardNumber;
import nextstep.blackjack.entity.CardShape;
import nextstep.blackjack.entity.Cards;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CardsTest {

    @Test
    void Cards_생성() {
        Cards cards = new Cards();

        cards.addCard(Card.of(CardNumber.ACE, CardShape.CLOVER));
        cards.addCard(Card.of(CardNumber.TWO, CardShape.SPADE));

        assertThat(cards).isInstanceOf(Cards.class);
        assertThat(cards.getCount()).isEqualTo(2);
    }
}
