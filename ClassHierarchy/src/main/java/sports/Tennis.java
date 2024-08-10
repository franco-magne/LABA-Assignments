package sports;

public class Tennis extends OlympicSport {
    private String typeOfEvent; // singles or doubles
    private int numberOfSets;

    public Tennis(String name, int amountOfPlayers, int gameDurationInMinutes, String terrainType, boolean isTeamGame,
                  String typeOfEvent, int numberOfSets) {
        super(name, amountOfPlayers, gameDurationInMinutes, terrainType, isTeamGame);
        this.typeOfEvent = typeOfEvent;
        this.numberOfSets = numberOfSets;
    }

    public void someRulesToKnow() {
        System.out.println("The topspin or backspin movement alter the ball's flight.");
    }

    public String getTypeOfEvent() {
        return typeOfEvent;
    }

    public void setTypeOfEvent(String typeOfEvent) {
        this.typeOfEvent = typeOfEvent;
    }

    public int getNumberOfSets() {
        return numberOfSets;
    }

    public void setNumberOfSets(int numberOfSets) {
        this.numberOfSets = numberOfSets;
    }
}
