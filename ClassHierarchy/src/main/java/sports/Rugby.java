package sports;

public class Rugby extends OlympicSport {
    private int sustitutionQuantityPerTeam;

    public Rugby(String name, int amountOfPlayers, int gameDurationInMinutes, String terrainType, boolean isTeamGame,
                    int sustitutionQuantityPerTeam) {
        super(name, amountOfPlayers, gameDurationInMinutes, terrainType, isTeamGame);
        this.sustitutionQuantityPerTeam = sustitutionQuantityPerTeam;
    }

    @Override
    public void someRulesToKnow() {
        System.out.println("The ball is oval and can only be passed backwards.");
    }

    public int getSustitutionQuantityPerTeam() {
        return sustitutionQuantityPerTeam;
    }

    public void setSustitutionQuantityPerTeam(int sustitutionQuantityPerTeam) {
        this.sustitutionQuantityPerTeam = sustitutionQuantityPerTeam;
    }

}
