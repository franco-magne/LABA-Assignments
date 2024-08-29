package weapons;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WeaponUpgrade {
    private static final Logger logger = LogManager.getLogger(WeaponUpgrade.class);

    public void upgradeWeapon(Weapon weapon, int nextLevel) throws InvalidUpgradeException {
        if ( (weapon.getLevel() == weapon.getOrbCosts().size()) || (nextLevel < 0) ) { // if its already at its maximum level or negative
            throw new InvalidUpgradeException(weapon.getName(), weapon.getLevel(), weapon.getOrbCosts().size());
        }
        weapon.setLevel(nextLevel);
        logger.info("The weapon has been upgraded successfully!");
    }

}
