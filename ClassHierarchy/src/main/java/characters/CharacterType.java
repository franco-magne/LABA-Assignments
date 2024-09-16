package characters;

public enum CharacterType {
    PLAYABLE("Main character of the game."),
    BOSS("Boss character with special abilities."),
    ORDINARY_ENEMY("Enemies the main character faces along the game.");

    private final String description;

    CharacterType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
