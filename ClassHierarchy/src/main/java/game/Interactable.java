package game;

import org.apache.logging.log4j.Logger;

public interface Interactable {
    void interact(Logger logger);
    boolean isInteractable();
}
