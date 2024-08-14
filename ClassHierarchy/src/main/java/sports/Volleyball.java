package sports;

public class Volleyball extends OlympicSport {
    private int sustitutionQuantityPerTeam;

    public Volleyball(String name, int amountOfPlayers, int gameDurationInMinutes, String terrainType, boolean isTeamGame,
                    int sustitutionQuantityPerTeam) {
        super(name, amountOfPlayers, gameDurationInMinutes, terrainType, isTeamGame);
        this.sustitutionQuantityPerTeam = sustitutionQuantityPerTeam;
    }

    @Override
    public void someRulesToKnow() {
        System.out.println("The teams cannot use more than three touches to score a point.");
    }

    public int getSustitutionQuantityPerTeam() {
        return sustitutionQuantityPerTeam;
    }

    public void setSustitutionQuantityPerTeam(int sustitutionQuantityPerTeam) {
        this.sustitutionQuantityPerTeam = sustitutionQuantityPerTeam;
    }
}
