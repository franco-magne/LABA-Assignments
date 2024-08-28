package itemmagic;

public class InsufficientMagicException extends Exception {
    private final int requiredMagic;
    private final int currentMagic;

    public InsufficientMagicException(int requiredMagic, int currentMagic) {
        this.requiredMagic = requiredMagic;
        this.currentMagic = currentMagic;
    }

    public String informInsufficientMagic() {
        return "Can't make this magic attack. Insufficient magic in your bar";
    }

    public int getRequiredMagic() {
        return requiredMagic;
    }

    public int getCurrentMagic() {
        return currentMagic;
    }
}
