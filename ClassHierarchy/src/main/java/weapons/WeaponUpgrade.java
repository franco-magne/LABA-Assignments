package weapons;

public class WeaponUpgrade {
    private Weapon weapon;
    private int nextLevel;

    public WeaponUpgrade(Weapon weapon, int nextLevel) {
        this.weapon = weapon;
        this.nextLevel = nextLevel;
    }

    public void upgradeWeapon(Weapon weapon, int nextLevel) throws InvalidUpgradeException {
        if ( (weapon.getLevel() == weapon.getOrbCosts().size()) || (nextLevel < 0) ) { // if its already at its maximum level or negative
            throw new InvalidUpgradeException(weapon.getName(), weapon.getLevel(), weapon.getOrbCosts().size());
        }
        weapon.setLevel(nextLevel);
    }

}
