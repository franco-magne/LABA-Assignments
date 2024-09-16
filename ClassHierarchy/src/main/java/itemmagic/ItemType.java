package itemmagic;

public enum ItemType {
    ITEM(1),
    MAGIC(1);

    private int currentLevel;

    ItemType(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }
}
