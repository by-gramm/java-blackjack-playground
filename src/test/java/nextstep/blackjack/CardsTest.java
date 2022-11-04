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
    Card card6 = Card.of(CardNumber.SIX, CardShape.SPADE);
    Card card7 = Card.of(CardNumber.SEVEN, CardShape.SPADE);
    Card card8 = Card.of(CardNumber.EIGHT, CardShape.DIAMOND);
    Card card9 = Card.of(CardNumber.NINE, CardShape.DIAMOND);
    Card card10 = Card.of(CardNumber.KING, CardShape.HEART);

    @Test
    void Cards_생성() {
        cards.addCard(card1);
        cards.addCard(card6);

        assertThat(cards).isInstanceOf(Cards.class);
        assertThat(cards.getCount()).isEqualTo(2);
    }

    @Test
    void 카드_합_구하기() {
        cards.addCard(card1);
        cards.addCard(card6);

        assertThat(cards.getSum()).isEqualTo(7);
    }

    @Test
    void 딜러는_카드_합이_16_이하면_1장_더_받는다() {
        cards.addCard(card6);
        cards.addCard(card10);

        assertThat(cards.isDealerGetOneMoreCard()).isEqualTo(true);

        Cards newCards = new Cards();
        newCards.addCard(card7);
        newCards.addCard(card10);

        assertThat(newCards.isDealerGetOneMoreCard()).isEqualTo(false);
    }

    @Test
    void 카드_합이_21을_초과하면_진다() {
        cards.addCard(card6);
        cards.addCard(card7);
        cards.addCard(card9);

        assertThat(cards.isOver21()).isEqualTo(true);
    }

    @Test
    void 블랙잭_여부_판단() {
        cards.addCard(card1);
        cards.addCard(card10);

        assertThat(cards.isBlackJack()).isEqualTo(true);
    }
}
