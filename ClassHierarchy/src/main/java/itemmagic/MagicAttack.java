package itemmagic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MagicAttack {
    private static final Logger logger = LogManager.getLogger(MagicAttack.class);

    public void performMagicAttack(ItemMagic itemMagic, int currentMagic) throws InsufficientMagicException {
        if (currentMagic < itemMagic.getCostOfBar()) {
            throw new InsufficientMagicException(itemMagic.getCostOfBar(), currentMagic);
        }
        logger.info("Magic attack performed successfully!");
    }
}
