package nextstep.blackjack;

import nextstep.blackjack.entity.Dealer;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ParticipantTest {

    @Test
    void 딜러는_1명() {
        Dealer dealer1 = Dealer.getInstance();
        assertThat(dealer1).isInstanceOf(Dealer.class);

        Dealer dealer2 = Dealer.getInstance();
        assertThat(dealer1).isEqualTo(dealer2);
    }
}
