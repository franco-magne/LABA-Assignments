package sports;

public class Boxing extends OlympicSport {
    private int weightCategoryInKg;

    public Boxing(String name, int amountOfPlayers, int gameDurationInMinutes, String terrainType, boolean isTeamGame,
                  int weightCategoryInKg) {
        super(name, amountOfPlayers, gameDurationInMinutes, terrainType, isTeamGame);
        this.weightCategoryInKg = weightCategoryInKg;
    }

    @Override
    public void someRulesToKnow() {
        System.out.println("Men must wear mouthguards and gloves. Women must also wear headguards.");
    }

    @Override
    public int hashCode() {
        return this.weightCategoryInKg * 1000; // category in grams
    }

    public int getWeightCategoryInKg() {
        return weightCategoryInKg;
    }

    public void setWeightCategoryInKg(int weightCategoryInKg) {
        this.weightCategoryInKg = weightCategoryInKg;
    }
}
