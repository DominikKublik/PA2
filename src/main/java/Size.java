public enum Size {
    SMALL(60),
    NORMAL(40),
    BIG(20);

    private final int chanceToSteal;

    Size(int chanceToSteal) {
        this.chanceToSteal = chanceToSteal;
    }

    public int getChanceToSteal() {
        return chanceToSteal;
    }
}
