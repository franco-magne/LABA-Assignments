package sports;

public abstract class OlympicSport {
    protected String name;
    protected int amountOfPlayers;
    protected int gameDurationInMinutes;
    protected String terrainType;
    protected boolean isTeamGame;

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
    public abstract void someRulesToKnow();

    public final void showSchedule() {
        System.out.println("1) Monday: Archery & Cycling");
        System.out.println("2) Tuesday: Basketball");
        System.out.println("3) Wednesday: Football");
        System.out.println("4) Thursday: Weightlifting & Boxing");
        System.out.println("5) Friday: Tennis");
        System.out.println("6) Saturday: Volleyball & Rugby");
        System.out.println("7) Sunday: Golf");
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
