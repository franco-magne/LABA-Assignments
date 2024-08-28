package difficulty;

public class Chaos extends Difficulty {
    protected boolean isUnblocked;

    public Chaos(String label, int damageMultiplier) {
        super(label, damageMultiplier);
    }

    public Chaos(String label, int damageMultiplier, boolean isUnblocked) {
        super(label, damageMultiplier);
        this.isUnblocked = isUnblocked;
    }

    public boolean isUnblocked() {
        return isUnblocked;
    }

    public void setUnblocked(boolean unlocked) {
        isUnblocked = unlocked;
    }
}

