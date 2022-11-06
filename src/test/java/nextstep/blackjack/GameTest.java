package nextstep.blackjack;

import nextstep.blackjack.entity.Player;
import nextstep.blackjack.entity.PlayerFactory;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class GameTest {

    List<Player> players = new ArrayList<>();

    @Test
    void 플레이어_저장() {
        players.add(PlayerFactory.create("player1", 10000));
        players.add(PlayerFactory.create("player2", 10000));

        Game game = Game.of(players);
        assertThat(game.getPlayerCount()).isEqualTo(2);
    }

    @Test
    void 플레이어는_1명_이상_7명_이하() {
        for (int i = 0; i < 8; i++) {
            Player player = PlayerFactory.create(Integer.toString(i), i + 10000);
            players.add(player);
        }

        assertThatThrownBy(() -> Game.of(players))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("플레이어는 1명 이상 7명 이하여야 합니다.");
    }

}
