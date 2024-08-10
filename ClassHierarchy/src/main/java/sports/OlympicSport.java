package sports;

public class OlympicSport {
    private String name;
    private int amountOfPlayers;
    private int gameDurationInMinutes;
    private String terrainType;
    private boolean isTeamGame;

    public OlympicSport() {    }

    // Overloading example between this two constructors
    public OlympicSport(String name, boolean isTeamGame) {
        this.name = name;
        this.isTeamGame = isTeamGame;
    }

    public OlympicSport(String name, int amountOfPlayers, int gameDurationInMinutes, String terrainType, boolean isTeamGame) {
        this.name = name;
        this.amountOfPlayers = amountOfPlayers;
        this.gameDurationInMinutes = gameDurationInMinutes;
        this.terrainType = terrainType;
        this.isTeamGame = isTeamGame;
    }

    // Child classes implement overriding examples of this method
    public void someRulesToKnow() {
        System.out.println("Some basics rules you should know...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOfPlayers() {
        return amountOfPlayers;
    }

    public void setAmountOfPlayers(int amountOfPlayers) {
        this.amountOfPlayers = amountOfPlayers;
    }

    public int getGameDurationInMinutes() {
        return gameDurationInMinutes;
    }

    public void setGameDurationInMinutes(int gameDurationInMinutes) {
        this.gameDurationInMinutes = gameDurationInMinutes;
    }

    public String getTerrainType() {
        return terrainType;
    }

    public void setTerrainType(String terrainType) {
        this.terrainType = terrainType;
    }

    public boolean getIsTeamGame() {
        return isTeamGame;
    }

    public void setIsTeamGame(boolean teamGame) {
        this.isTeamGame = teamGame;
    }
}
