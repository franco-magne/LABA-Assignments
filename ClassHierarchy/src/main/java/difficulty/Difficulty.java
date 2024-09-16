package difficulty;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Difficulty {
    protected GameDifficulty label;
    protected int damageMultiplier;

    private static final Logger logger = LogManager.getLogger(Difficulty.class);

    public Difficulty(GameDifficulty label, int damageMultiplier) {
        this.label = label;
        this.damageMultiplier = damageMultiplier;
    }

    public static void getUnderstandableDifficulty(Difficulty dif) {
        switch (dif.getLabel()) {
            case SPARTAN:
                logger.info("EASY");
                break;
            case GOD:
                logger.info("MEDIUM");
                break;
            case TITAN:
                logger.info("HARD");
                break;
            case CHAOS:
                logger.info("VERY HARD");
                break;
        }
    }

    public GameDifficulty getLabel() {
        return label;
    }

    public void setLabel(GameDifficulty label) {
        this.label = label;
    }

    public int getDamageMultiplier() {
        return damageMultiplier;
    }

    public void setDamageMultiplier(int damageMultiplier) {
        this.damageMultiplier = damageMultiplier;
    }

    public static Logger getLogger() {
        return logger;
    }
}
