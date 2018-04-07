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

    public int getScoreMultiplier(TrumpEntity variant) {
        switch (this) {
            case TO_1000:
                return 1;
            case TO_2500:
                switch (variant.gameMode) {
                    case TRUMPF:
                        switch (variant.trumpColor) {
                            case EICHEL:
                            case ROSE:
                                return 1;
                            case SCHILTE:
                            case SCHELLE:
                                return 2;
                        }
                        break;
                    case OBENABE:
                    case UNEUFE:
                        return 3;
                }
                break;
        }

        //the multiplier is 1 for unimplemented cases
        return 1;
    }
}
