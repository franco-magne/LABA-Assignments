package sports;

public class Football extends OlympicSport {
    private int sustitutionQuantityPerTeam;

    public Football(String name, int amountOfPlayers, int gameDurationInMinutes, String terrainType, boolean isTeamGame,
                    int sustitutionQuantityPerTeam) {
        super(name, amountOfPlayers, gameDurationInMinutes, terrainType, isTeamGame);
        this.sustitutionQuantityPerTeam = sustitutionQuantityPerTeam;
    }

    public void someRulesToKnow() {
        System.out.println("The outfield players can't use their hands and arms to play.");
    }

    public int getSustitutionQuantityPerTeam() {
        return sustitutionQuantityPerTeam;
    }

    public void setSustitutionQuantityPerTeam(int sustitutionQuantityPerTeam) {
        this.sustitutionQuantityPerTeam = sustitutionQuantityPerTeam;
    }
}
