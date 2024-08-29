package relics;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GoldenFleece extends Relic {
    private static final Logger logger = LogManager.getLogger(Relic.class);

    public GoldenFleece(String name) {
        super(name);
    }

    @Override
    public void showDescription() {
        logger.info("The fleece allows Kratos to reflect any projectiles, beams, and attacks.");
    }

    @Override
    public void interact() {
        logger.info("Ready to block enemy attacks.");
    }

    @Override
    public boolean isInteractable() {
        return false;
    }
}
