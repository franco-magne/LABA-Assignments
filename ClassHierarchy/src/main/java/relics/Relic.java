package relics;

import game.Interactable;
import org.apache.logging.log4j.Logger;

public abstract class Relic implements Interactable {
    private String name;
    private boolean isEquipped;

    public Relic(String name, boolean isEquipped) {
        this.name = name;
        this.isEquipped = isEquipped;
    }

    public abstract void showDescription(Logger logger);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsEquipped() {
        return isEquipped;
    }

    public void setIsEquipped(boolean isEquipped) {
        this.isEquipped = isEquipped;
    }
}