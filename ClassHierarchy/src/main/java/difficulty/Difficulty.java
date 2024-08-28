package difficulty;

public class Difficulty {
    protected String label;
    protected int damageMultiplier;

    public Difficulty(String label, int damageMultiplier) {
        this.label = label;
        this.damageMultiplier = damageMultiplier;
    }

    public static void getUnderstandableDifficulty(Difficulty dif) {
        switch (dif.getLabel()) {
            case "Spartan":
                System.out.println("EASY");
                break;
            case "God":
                System.out.println("MEDIUM");
                break;
            case "Titan":
                System.out.println("HARD");
                break;
            case "Chaos":
                System.out.println("VERY HARD");
                break;
        }
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getDamageMultiplier() {
        return damageMultiplier;
    }

    public void setDamageMultiplier(int damageMultiplier) {
        this.damageMultiplier = damageMultiplier;
    }
}
