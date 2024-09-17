package relics;

import org.apache.logging.log4j.Logger;

public class GoldenFleece extends Relic {

    public GoldenFleece(String name, boolean isEquipped) {
        super(name, isEquipped);
    }

    @Override
    public void showDescription(Logger logger) {
        logger.info("The fleece allows Kratos to reflect any projectiles, beams, and attacks.");
    }

    @Override
    public void interact(Logger logger) {
        logger.info("Ready to block enemy attacks.");
    }

    @Override
    public boolean isInteractable() {
        return false;
    }

}
