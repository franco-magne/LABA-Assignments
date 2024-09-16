package difficulty;

public enum GameDifficulty {
    SPARTAN("EASY"),
    GOD("MEDIUM"),
    TITAN("HARD"),
    CHAOS("VERY HARD");

    private String name;

    GameDifficulty(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
