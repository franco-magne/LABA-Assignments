package itemmagic;

import java.util.ArrayList;
import java.util.List;

public class ItemMagic {
    private String name;
    private int level;
    private int damage;
    private int costOfBar;
    private List<Integer> orbCosts;
    private List<Integer> powerMultiplier;
    private String type; // ITEM or MAGIC

    public ItemMagic(String name, int level, int damage, int costOfBar, String type) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.costOfBar = costOfBar;
        this.type = type;
        this.orbCosts = new ArrayList<>();
        this.powerMultiplier = new ArrayList<>();
    }

    public void addOrbCosts(int orbCost) {
        this.orbCosts.add(orbCost);
    }

    public void addPowerMultiplier(int powerMultiplier) {
        this.powerMultiplier.add(powerMultiplier);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getCostOfBar() {
        return costOfBar;
    }

    public void setCostOfBar(int costOfBar) {
        this.costOfBar = costOfBar;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Integer> getOrbCosts() {
        return orbCosts;
    }

    public void setOrbCosts(List<Integer> orbCosts) {
        this.orbCosts = orbCosts;
    }

    public List<Integer> getPowerMultiplier() {
        return powerMultiplier;
    }

    public void setPowerMultiplier(List<Integer> powerMultiplier) {
        this.powerMultiplier = powerMultiplier;
    }
}
