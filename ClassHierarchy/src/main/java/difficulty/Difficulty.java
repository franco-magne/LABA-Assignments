package difficulty;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Difficulty {
    protected String label;
    protected int damageMultiplier;

    private static final Logger logger = LogManager.getLogger(Difficulty.class);

    public Difficulty(String label, int damageMultiplier) {
        this.label = label;
        this.damageMultiplier = damageMultiplier;
    }

    public static void getUnderstandableDifficulty(Difficulty dif) {
        switch (dif.getLabel()) {
            case "Spartan":
                logger.info("EASY");
                break;
            case "God":
                logger.info("MEDIUM");
                break;
            case "Titan":
                logger.info("HARD");
                break;
            case "Chaos":
                logger.info("VERY HARD");
                break;
        }
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getDamageMultiplier() {
        return damageMultiplier;
    }

    public void setDamageMultiplier(int damageMultiplier) {
        this.damageMultiplier = damageMultiplier;
    }
}
