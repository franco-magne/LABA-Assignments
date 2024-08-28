package relics;

public class GoldenFleece extends Relic {

    public GoldenFleece(String name) {
        super(name);
    }

    @Override
    public void showDescription() {
        System.out.println("The fleece allows Kratos to reflect any projectiles, beams, and attacks.");
    }

    @Override
    public void interact() {
        System.out.println("Ready to block enemy attacks.");
    }

    @Override
    public boolean isInteractable() {
        return false;
    }
}
