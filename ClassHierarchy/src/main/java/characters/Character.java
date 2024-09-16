package characters;

public class Character {
    private String name;
    private int healthBar;
    private CharacterType type;

    public Character(String name, int healthBar, CharacterType type) {
        this.name = name;
        this.healthBar = healthBar;
        this.type = type;
    }

    public Character(String name, CharacterType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthBar() {
        return healthBar;
    }

    public void setHealthBar(int healthBar) {
        this.healthBar = healthBar;
    }

    public CharacterType getType() {
        return type;
    }

    public void setType(CharacterType type) {
        this.type = type;
    }
}
