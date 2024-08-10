package sports;

public class Boxing extends OlympicSport {
    private int weightCategoryInKg;

    public Boxing(String name, int amountOfPlayers, int gameDurationInMinutes, String terrainType, boolean isTeamGame,
                  int weightCategoryInKg) {
        super(name, amountOfPlayers, gameDurationInMinutes, terrainType, isTeamGame);
        this.weightCategoryInKg = weightCategoryInKg;
    }

    public void someRulesToKnow() {
        System.out.println("Men must wear mouthguards and gloves. Women must also wear headguards.");
    }

    public int getWeightCategoryInKg() {
        return weightCategoryInKg;
    }

    public void setWeightCategoryInKg(int weightCategoryInKg) {
        this.weightCategoryInKg = weightCategoryInKg;
    }
}
