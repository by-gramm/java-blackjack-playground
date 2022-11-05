package nextstep.blackjack.entity;

public class Dealer extends Participant {

    private static Dealer dealer = new Dealer();

    private Dealer() {
    }

    public static Dealer getInstance() {
        return dealer;
    }
}
