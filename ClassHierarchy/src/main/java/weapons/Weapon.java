package weapons;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class Weapon {
    private String name;
    private int level;
    private int damage;
    private List<Integer> orbCosts;
    private List<Integer> powerMultiplier;

    public Weapon(String name, int level, int damage) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.orbCosts = new ArrayList<>();
        this.powerMultiplier = new ArrayList<>();
    }

    public void addOrbCosts(int orbCost) {
        this.orbCosts.add(orbCost);
    }

    public void upgradeWeapon(Weapon weaponToUpgrade, int newLevel) {
        WeaponUpgrade wu = new WeaponUpgrade();

        try {
            wu.upgradeWeapon(weaponToUpgrade, newLevel);
        } catch (InvalidUpgradeException iue) {
            iue.getMessage();
        }
    }

    public void addPowerMultiplier(int powerMultiplier) {
        this.powerMultiplier.add(powerMultiplier);
    }

    public boolean weaponIsAtItsMaxLevel(int currentLevel, int maxLevel) {
        BiPredicate<Integer, Integer> weaponLevelIsMax = Integer::equals; // (a, b) -> a.equals(b)

        return weaponLevelIsMax.test(currentLevel, maxLevel);
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
