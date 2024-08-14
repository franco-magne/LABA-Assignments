package sports;

public class Basketball extends OlympicSport {
    private String typeOfGame; // 3X3 or 5X5

    public Basketball(String name, int amountOfPlayers, int gameDurationInMinutes, String terrainType, boolean isTeamGame,
                      String typeOfGame) {
        super(name, amountOfPlayers, gameDurationInMinutes, terrainType, isTeamGame);
        this.typeOfGame = typeOfGame;
    }

    @Override
    public void someRulesToKnow() {
        System.out.println("In 5X5, the team have to shoot within 24 seconds of getting the ball.");
    }

    public String getTypeOfGame() {
        return typeOfGame;
    }

    public void setTypeOfGame(String type) {
        this.typeOfGame = type;
    }
}
