package sports;

public class Weightlifting extends OlympicSport {
    private int weightCategoryInKg;

    public Weightlifting(String name, boolean isTeamGame, int weightCategoryInKg) {
        super(name, isTeamGame);
        this.weightCategoryInKg = weightCategoryInKg;
    }

    @Override
    public void someRulesToKnow() {
        System.out.println("For the lift to count, athletes must finish with their elbows straight and legs " +
                "in line with the body.");
    }

    public int getWeightCategoryInKg() {
        return weightCategoryInKg;
    }

    public void setWeightCategoryInKg(int weightCategoryInKg) {
        this.weightCategoryInKg = weightCategoryInKg;
    }
}
