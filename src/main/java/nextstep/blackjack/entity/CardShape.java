package nextstep.blackjack.entity;

public enum CardShape {
    SPADE("스페이드"),
    DIAMOND("다이아몬드"),
    HEART("하트"),
    CLOVER("클로버");

    private String shapeName;

    CardShape(String shapeName) {
        this.shapeName = shapeName;
    }

    @Override
    public String toString() {
        return this.shapeName;
    }
}
