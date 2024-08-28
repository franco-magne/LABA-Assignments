package characters;

public class Character {
    private String name;
    private int healthBar;
    private String type; // PLAYABLE or BOSS or ORDINARY_ENEMY

    public Character(String name, int healthBar, String type) {
        this.name = name;
        this.healthBar = healthBar;
        this.type = type;
    }

    public Character(String name, String type) {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
