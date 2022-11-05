package nextstep.blackjack.entity;

public class Card {

    private final CardNumber number;
    private final CardShape shape;

    public static Card of(CardNumber number, CardShape shape) {
        return new Card(number, shape);
    }

    public Card(CardNumber number, CardShape shape) {
        this.number = number;
        this.shape = shape;
    }

    public Integer getScore() {
        return number.getScore();
    }

    public boolean isAce() {
        return number.equals(CardNumber.ACE);
    }

    @Override
    public String toString() {
        return String.format("%s%s", this.number, this.shape);
    }
}
