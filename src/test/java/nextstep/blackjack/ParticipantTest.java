package nextstep.blackjack;

import nextstep.blackjack.entity.Dealer;
import nextstep.blackjack.entity.Player;
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

    @Test
    void 플레이어_생성() {
        Player player = Player.of("playerName", 10000);
        assertThat(player).isInstanceOf(Player.class);
    }

    @Test
    void 베팅_금액은_0_이상() {
        assertThatThrownBy(() -> Player.of("name", -1000))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("베팅 금액은 0 이상이어야 합니다.");
    }

    @Test
    void 게임_시작시_카드_2장_받기() {
        Player player = Player.of("playerName", 10000);
        player.startGame();

        assertThat(player.getCardCount()).isEqualTo(2);
    }
}
