package nextstep.blackjack;

import nextstep.blackjack.entity.Card;
import nextstep.blackjack.entity.CardNumber;
import nextstep.blackjack.entity.CardShape;
import nextstep.blackjack.entity.Cards;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CardsTest {

    Cards cards = new Cards();

    Card card1 = Card.of(CardNumber.ACE, CardShape.CLOVER);
    Card card2 = Card.of(CardNumber.SIX, CardShape.SPADE);
    Card card3 = Card.of(CardNumber.SEVEN, CardShape.SPADE);
    Card card4 = Card.of(CardNumber.KING, CardShape.SPADE);

    @Test
    void Cards_생성() {
        cards.addCard(card1);
        cards.addCard(card2);

        assertThat(cards).isInstanceOf(Cards.class);
        assertThat(cards.getCount()).isEqualTo(2);
    }

    @Test
    void 카드_합_구하기() {
        cards.addCard(card1);
        cards.addCard(card2);

        assertThat(cards.getSum()).isEqualTo(7);
    }

    @Test
    void 딜러는_카드_합이_16_이하면_1장_더_받는다() {
        cards.addCard(card2);
        cards.addCard(card4);

        assertThat(cards.isDealerGetOneMoreCard()).isEqualTo(true);

        Cards newCards = new Cards();
        newCards.addCard(card3);
        newCards.addCard(card4);

        assertThat(newCards.isDealerGetOneMoreCard()).isEqualTo(false);
    }
}
