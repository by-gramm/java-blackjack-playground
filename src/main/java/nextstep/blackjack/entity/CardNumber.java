package nextstep.blackjack.entity;

public enum CardNumber {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13);

    private final int number;

    CardNumber(int number) {
        this.number = number;
    }

    public int getScore() {
        int MAX_SCORE = 10;

        return Math.min(this.number, MAX_SCORE);
    }

    @Override
    public String toString() {
        if (this.number == 1 || this.number > 10) {
            return this.name().substring(0, 1);
        }
        return Integer.toString(this.number);
    }
}
