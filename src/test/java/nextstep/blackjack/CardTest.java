package nextstep.blackjack;

import nextstep.blackjack.entity.Card;
import nextstep.blackjack.entity.CardNumber;
import nextstep.blackjack.entity.CardShape;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CardTest {

    @Test
    void 카드_생성() {
        Card card = Card.of(CardNumber.FIVE, CardShape.HEART);
        Assertions.assertThat(card).isInstanceOf(Card.class);
    }
}
