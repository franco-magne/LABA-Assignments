package weapons;

public class InvalidUpgradeException extends Exception {
    private final String itemName;
    private final int currentLevel;
    private final int attemptedLevel;

    public InvalidUpgradeException(String itemName, int currentLevel, int attemptedLevel) {
        this.itemName = itemName;
        this.currentLevel = currentLevel;
        this.attemptedLevel = attemptedLevel;
    }

    public String getMessage() {
        return "The weapon is at its maximum level";
    }

    public String getItemName() {
        return itemName;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public int getAttemptedLevel() {
        return attemptedLevel;
    }
}
