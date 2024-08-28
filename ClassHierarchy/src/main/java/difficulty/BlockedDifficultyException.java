package difficulty;

public class BlockedDifficultyException extends Exception {
    private final Difficulty difficulty;

    public BlockedDifficultyException(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public String informBlockedDifficulty() {
        return "The " + difficulty.getLabel() + " mode is still blocked.";
    }
}
