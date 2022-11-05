package nextstep.blackjack;

import nextstep.blackjack.entity.RandomCardFactory;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RandomCardFactoryTest {

    @Test
    void 랜덤_카드_생성() {
        for (int i = 0; i < 52; i++) {
            RandomCardFactory.create();
        }

        Assertions.assertThatThrownBy(RandomCardFactory::create)
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("모든 카드를 다 사용했습니다.");
    }

}
