package ch.ntb.jass.common.entities;

public enum TargetScoreEntity {
    TO_1000(1000),
    TO_2500(2500);

    private final int score;

    TargetScoreEntity(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
