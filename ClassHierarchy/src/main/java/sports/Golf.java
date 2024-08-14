package sports;

public class Golf extends OlympicSport {
    private int amountOfHoles;

    public Golf(String name, int amountOfPlayers, int gameDurationInMinutes, String terrainType, boolean isTeamGame,
                int amountOfHoles) {
        super(name, amountOfPlayers, gameDurationInMinutes, terrainType, isTeamGame);
        this.amountOfHoles = amountOfHoles;
    }

    @Override
    public void someRulesToKnow() {
        System.out.println("The scores names are birdie, eagle and bogey.");
    }

    public int getAmountOfHoles() {
        return amountOfHoles;
    }

    public void setAmountOfHoles(int amountOfHoles) {
        this.amountOfHoles = amountOfHoles;
    }
}
