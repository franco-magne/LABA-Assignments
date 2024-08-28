package relics;

import game.Interactable;

public abstract class Relic implements Interactable {
    protected String name;

    public Relic(String name) {
        this.name = name;
    }

    public abstract void showDescription();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}