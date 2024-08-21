package sports;

import java.util.List;

public class Boxing extends OlympicSport implements Equipable {
    private int weightCategoryInKg;
    private List<String> equipments;

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

    @Override
    public void equip(String equipment) {
        this.equipments.add(equipment);
    }

    @Override
    public void unequip(String equipment) {
        this.equipments.remove(equipment);
    }

    public int getWeightCategoryInKg() {
        return weightCategoryInKg;
    }

    public void setWeightCategoryInKg(int weightCategoryInKg) {
        this.weightCategoryInKg = weightCategoryInKg;
    }

}
